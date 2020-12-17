package com.example.k2.util;

import java.util.HashMap;

public interface INetWorkInterface {
    <T> void get(String url,INetCallBack<T> callBack);

    <T> void post(String url,INetCallBack<T> callBack);

    <T> void post(String url, HashMap<String,String > map,INetCallBack<T> callBack);
}
