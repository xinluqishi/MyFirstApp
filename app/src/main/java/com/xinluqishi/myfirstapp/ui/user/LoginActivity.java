package com.xinluqishi.myfirstapp.ui.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.xinluqishi.myfirstapp.presenter.user.ILoginPresenter;
import com.xinluqishi.myfirstapp.ui.base.BaseActivity;

/**
 * Created by shikeyue on 2017/8/6.
 */

public class LoginActivity extends BaseActivity implements ILoginView, View.OnClickListener {

    private EditText editUsername;
    private EditText editUserpass;

    private Button btnLogin;
    private Button btnClear;

    ILoginPresenter loginPresenter;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public void onClick(View v) {

    }
}
