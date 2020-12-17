package com.example.k2.util;

public interface INetCallBack <T>{
    void onSuccess(T t);
    void onFail(String err);
}
