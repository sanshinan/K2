package com.example.k2.base;

public class BasePersent<V extends BaseView> {
    public V iView;
    public void attachView(V v){
        iView=v;
    }
}
