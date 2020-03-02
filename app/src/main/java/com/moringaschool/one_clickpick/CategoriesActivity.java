package com.moringaschool.one_clickpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoriesActivity extends AppCompatActivity {
    @BindView(R.id.welcomeMessage) TextView mWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        mWelcomeMessage.setText("Welcome back " + userName);
    }
}
