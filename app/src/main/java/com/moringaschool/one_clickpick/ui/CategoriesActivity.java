package com.moringaschool.one_clickpick.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.moringaschool.one_clickpick.R;
import com.moringaschool.one_clickpick.adapters.CategoriesRecyclerViewAdapter;
import com.moringaschool.one_clickpick.models.BestbuyCategoriesResponse;
import com.moringaschool.one_clickpick.models.Category;
import com.moringaschool.one_clickpick.network.EtsyApi;
import com.moringaschool.one_clickpick.network.EtsyClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoriesActivity extends AppCompatActivity {
    @BindView(R.id.welcomeMessage) TextView mWelcomeMessage;
    @BindView(R.id.categoryErrorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBarCategories) ProgressBar mProgressBar;

    @BindView(R.id.categoryList) RecyclerView mRecyclerView;
    private CategoriesRecyclerViewAdapter mAdapter;

    public List<Category> categories;
//    @BindView(R.id.electronicCategory) ImageView mElectronicCategory;
//    @BindView(R.id.phoneCategories) ImageView mPhoneCategories;
//    @BindView(R.id.computersLaptops) ImageView mComputersLaptops;
//    @BindView(R.id.clothesAll) ImageView mClothesAll;
//    @BindView(R.id.foodBeverages) ImageView mFoodBeverages;
//    @BindView(R.id.officeCategory) ImageView mOfficeCategories;
//    @BindView(R.id.kidsToys) ImageView mKidsToys;
//    @BindView(R.id.kitchenCooking) ImageView mKitchenCooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        mWelcomeMessage.setText("Welcome back " + userName);

        EtsyApi client = EtsyClient.getClient();

        Call<BestbuyCategoriesResponse> call = client.getCategories();

        call.enqueue(new Callback<BestbuyCategoriesResponse>() {
            @Override
            public void onResponse(Call<BestbuyCategoriesResponse> call, Response<BestbuyCategoriesResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    categories = response.body().getCategories();
                    mAdapter = new CategoriesRecyclerViewAdapter (CategoriesActivity.this, categories);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CategoriesActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);

                    showRestaurants();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<BestbuyCategoriesResponse> call, Throwable t) {
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



























//        mElectronicCategory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Electronic items", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        mPhoneCategories.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Phones and Accessories", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        mComputersLaptops.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Computers and Laptops", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        mClothesAll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Clothes and Shoes", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        mFoodBeverages.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Food and Beverages", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        mOfficeCategories.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Office items", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        mKidsToys.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Kids toys", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        mKitchenCooking.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(CategoriesActivity.this, "Kitchen Utensils", Toast.LENGTH_LONG).show();
//            }
//        });


