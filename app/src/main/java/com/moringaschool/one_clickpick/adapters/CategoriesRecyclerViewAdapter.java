package com.moringaschool.one_clickpick.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.one_clickpick.R;
import com.moringaschool.one_clickpick.models.Category;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

    public class CategoriesRecyclerViewAdapter extends RecyclerView.Adapter<CategoriesRecyclerViewAdapter.CategoryItemsViewHolder> {
        private List<Category> mCategories;
        private Context mContext;
        public String imageUrl = "https://images.unsplash.com/photo-1573674451487-3c66c2aad5ba?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80";

        public CategoriesRecyclerViewAdapter(Context context, List<Category> categories) {
            mContext = context;
            mCategories = categories;
        }

        @Override
        public CategoriesRecyclerViewAdapter.CategoryItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_card, parent, false);
            CategoryItemsViewHolder viewHolder = new CategoryItemsViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(CategoriesRecyclerViewAdapter.CategoryItemsViewHolder holder, int position) {
            holder.bindProducts(mCategories.get(position));
        }

        @Override
        public int getItemCount() {
            return mCategories.size();
        }

        public class CategoryItemsViewHolder extends RecyclerView.ViewHolder{
            @BindView(R.id.categoriesImage) ImageView mCategoriesImageView;
            @BindView(R.id.categoriesTitle) TextView mCategoriesTitle;
//            @BindView(R.id.categoriesSecondTitle) TextView mCategoriesSecondTitle;

            private Context mContext;

            public CategoryItemsViewHolder(View itemView){
                super(itemView);
                ButterKnife.bind(this, itemView);
                mContext = itemView.getContext();
            }

            public void bindProducts(Category category){
                mCategoriesTitle.setText(category.getName());
                Picasso.get().load(imageUrl).into(mCategoriesImageView);
            }
        }
    }

