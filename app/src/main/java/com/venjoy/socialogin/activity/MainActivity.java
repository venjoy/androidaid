package com.venjoy.socialogin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.venjoy.socialogin.gplus.GplusPresenterImpl;
import com.venjoy.socialogin.util.Constants;

import socialogin.venjoy.com.socialogin.R;

/**
 * Created by Vaibhav on 30-01-2017.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mGPlus, mFacebook, mTwitter;
    private GplusPresenterImpl objGplusPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setListner();

        objGplusPresenter = new GplusPresenterImpl();
        objGplusPresenter.initGoogle(this);

    }

    // set Listner for onClick
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
                objGplusPresenter.performLogin(this);
                break;
            case R.id.btn_facebook:
                break;
            case R.id.btn_twitter:
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.G_PLUS_REQUESTCODE && resultCode == RESULT_OK) {
            Log.e("Bundle", "Intent Data " + data.toString());
        }
    }
}
