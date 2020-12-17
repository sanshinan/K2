package com.example.k2.persent;

import com.example.k2.base.BasePersent;
import com.example.k2.contract.MainContrac;
import com.example.k2.modle.Banbean;
import com.example.k2.modle.MainModelImor;
import com.example.k2.util.INetCallBack;

public class MainPresenterImapl extends BasePersent<MainContrac.IMainView> implements MainContrac.IMainPersent {
   MainContrac.IMainModel mainModel;

   public MainPresenterImapl(MainContrac.IMainView view){
       this.mainModel=new MainModelImor();
   }

    @Override
    public void loginBan(String url) {
        mainModel.getloginban(url, new INetCallBack<Banbean>() {

            @Override
            public void onSuccess(Banbean banbean) {
                iView.getBan(banbean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }
}
