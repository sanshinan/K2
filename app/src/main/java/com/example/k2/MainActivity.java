package com.example.k2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.k2.base.BaseActivity;
import com.example.k2.contract.MainContrac;
import com.example.k2.modle.Banbean;
import com.example.k2.persent.MainPresenterImapl;
import com.example.k2.util.URLConstant;

public class MainActivity extends BaseActivity<MainPresenterImapl> implements MainContrac.IMainView {


    private android.widget.Button btn;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginBan(URLConstant.NEWBAN);
            }
        });
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenterImapl getPresenter() {
        return new MainPresenterImapl(this);
    }

    @Override
    public void getBan(Banbean banbean) {
        Log.i("TAG", "getBan: "+banbean.toString());
    }
}