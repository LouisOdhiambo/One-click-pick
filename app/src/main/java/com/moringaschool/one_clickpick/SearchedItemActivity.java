package com.moringaschool.one_clickpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchedItemActivity extends AppCompatActivity {
    @BindView(R.id.searchedItemsList) ListView mSearchedItemsList;
    private String[] items = new String[] {
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_item);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        mSearchedItemsList.setAdapter(adapter);

        Intent intent  = getIntent();
        String location = intent.getStringExtra("searchedTerm");
    }
}
