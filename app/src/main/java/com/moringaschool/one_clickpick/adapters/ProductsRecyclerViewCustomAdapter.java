package com.moringaschool.one_clickpick.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.one_clickpick.R;
import com.moringaschool.one_clickpick.models.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductsRecyclerViewCustomAdapter extends RecyclerView.Adapter<ProductsRecyclerViewCustomAdapter.ProductsItemsViewHolder> {
    private List<Product> mProducts;
    private Context mContext;

    public ProductsRecyclerViewCustomAdapter(Context context, List<Product> products) {
        mContext = context;
        mProducts = products;
    }

    @Override
    public ProductsRecyclerViewCustomAdapter.ProductsItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list_item, parent, false);
        ProductsItemsViewHolder viewHolder = new ProductsItemsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProductsRecyclerViewCustomAdapter.ProductsItemsViewHolder holder, int position) {
        holder.bindProducts(mProducts.get(position));
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public class ProductsItemsViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.productImage) ImageView mProductsImageView;
        @BindView(R.id.descriptionText) TextView mProductsDescription;
        @BindView(R.id.ratingText) TextView mProductsRating;

        private Context mContext;

        public ProductsItemsViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindProducts(Product product){
            mProductsDescription.setText(product.getName());
            mProductsRating.setText(product.getType());
            Picasso.get().load(product.getImage()).into(mProductsImageView);
        }
    }
}
