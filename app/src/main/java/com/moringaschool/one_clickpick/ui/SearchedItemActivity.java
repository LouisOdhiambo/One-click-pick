package com.moringaschool.one_clickpick.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.one_clickpick.R;
import com.moringaschool.one_clickpick.adapters.ProductsRecyclerViewCustomAdapter;
import com.moringaschool.one_clickpick.models.BestBuyProductSearchResponse;
import com.moringaschool.one_clickpick.models.Product;
import com.moringaschool.one_clickpick.network.EtsyApi;
import com.moringaschool.one_clickpick.network.EtsyClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchedItemActivity extends AppCompatActivity {

    private static final String TAG = "SearchedItem";

    @BindView(R.id.productsRecyclerView) RecyclerView mRecyclerView;
    private ProductsRecyclerViewCustomAdapter mAdapter;

    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBarRegister) ProgressBar mProgressBar;

    public List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_item);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String tag = intent.getStringExtra("tag");

        EtsyApi client = EtsyClient.getClient();

        Call<BestBuyProductSearchResponse> call = client.getProducts();

        call.enqueue(new Callback<BestBuyProductSearchResponse>() {
            @Override
            public void onResponse(Call<BestBuyProductSearchResponse> call, Response<BestBuyProductSearchResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    products = response.body().getProducts();
                    mAdapter = new ProductsRecyclerViewCustomAdapter(SearchedItemActivity.this, products);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SearchedItemActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);

                    showRestaurants();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<BestBuyProductSearchResponse> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
            }

        });
    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showRestaurants() {
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}
