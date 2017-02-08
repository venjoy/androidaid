package com.venjoy.socialogin.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.venjoy.socialogin.util.Constants;
import com.venjoy.socialogin.util.SocialAuth;

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
        setListner();
    }

    private void setListner() {
        mGPlus.setOnClickListener(this);
        mFacebook.setOnClickListener(this);
        mTwitter.setOnClickListener(this);
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
                new SocialAuth().authenticate(Constants.G_PLUS);
                break;
            case R.id.btn_facebook:
                break;
            case R.id.btn_twitter:
                break;
        }

    }


}
