package com.moringaschool.one_clickpick.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.moringaschool.one_clickpick.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.logInButton) Button mLogInButton;
    @BindView(R.id.userEnteredName) EditText mUserEnteredName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        mLogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mUserEnteredName.getText().toString();
                Intent intentCategories = new Intent(LoginActivity.this, CategoriesActivity.class);
                intentCategories.putExtra("userName", userName);
                startActivity(intentCategories);
            }
        });
    }
}
