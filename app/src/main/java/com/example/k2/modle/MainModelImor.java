package com.example.k2.modle;

import com.example.k2.contract.MainContrac;
import com.example.k2.util.INetCallBack;
import com.example.k2.util.RetrofitUtils;

public class MainModelImor implements MainContrac.IMainModel {
    @Override
    public <T> void getloginban(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
