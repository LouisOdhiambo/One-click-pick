package com.moringaschool.one_clickpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoriesActivity extends AppCompatActivity {
    @BindView(R.id.welcomeMessage) TextView mWelcomeMessage;
    @BindView(R.id.electronicCategory) ImageView mElectronicCategory;
    @BindView(R.id.phoneCategories) ImageView mPhoneCategories;
    @BindView(R.id.computersLaptops) ImageView mComputersLaptops;
    @BindView(R.id.clothesAll) ImageView mClothesAll;
    @BindView(R.id.foodBeverages) ImageView mFoodBeverages;
    @BindView(R.id.officeCategory) ImageView mOfficeCategories;
    @BindView(R.id.kidsToys) ImageView mKidsToys;
    @BindView(R.id.kitchenCooking) ImageView mKitchenCooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        mWelcomeMessage.setText("Welcome back " + userName);

        mElectronicCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Electronic items", Toast.LENGTH_SHORT).show();
            }
        });

        mPhoneCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Phones and Accessories", Toast.LENGTH_SHORT).show();
            }
        });

        mComputersLaptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Computers and Laptops", Toast.LENGTH_SHORT).show();
            }
        });

        mClothesAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Clothes and Shoes", Toast.LENGTH_SHORT).show();
            }
        });

        mFoodBeverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Food and Beverages", Toast.LENGTH_SHORT).show();
            }
        });

        mOfficeCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Office items", Toast.LENGTH_LONG).show();
            }
        });

        mKidsToys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Kids toys", Toast.LENGTH_LONG).show();
            }
        });

        mKitchenCooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoriesActivity.this, "Kitchen Utensils", Toast.LENGTH_LONG).show();
            }
        });
    }
}
