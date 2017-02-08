package com.venjoy.socialogin.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import socialogin.venjoy.com.socialogin.R;

/**
 * Created by Vaibhav on 30-01-2017.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mGPlus, mFacebook, mTwitter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    // Method used to initialize views
    private void initViews() {
        mGPlus = (Button) findViewById(R.id.btn_gplus);
        mFacebook = (Button) findViewById(R.id.btn_facebook);
        mTwitter = (Button) findViewById(R.id.btn_twitter);
    }

    @Override
    public void onClick(View mView) {

        switch (mView.getId()) {
            case R.id.btn_gplus:
                break;
        }

    }
}
