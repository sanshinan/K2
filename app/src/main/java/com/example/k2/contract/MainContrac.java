package com.example.k2.contract;

import com.example.k2.base.BaseView;
import com.example.k2.modle.Banbean;
import com.example.k2.util.INetCallBack;

public interface MainContrac {
    interface IMainModel{
        <T> void getloginban(String url, INetCallBack<T> callBack);
    }

    interface IMainPersent{
        void loginBan(String url);
    }
    interface IMainView extends BaseView{
        void getBan(Banbean banbean);
    }
}
