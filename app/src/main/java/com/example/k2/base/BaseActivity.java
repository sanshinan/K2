package com.example.k2.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePersent> extends AppCompatActivity implements BaseView {
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        if (presenter == null){
            presenter=getPresenter();
            presenter.attachView(this);
        }
        initView();
        initData();

    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayout();


    public abstract T getPresenter();
}
