package net.oschina.app.pages;

import android.widget.ImageView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/18.
 */
public class PageMyUnLogin {
    private SoloWrap solo;
    private ImageView loginBtn,settings;

    public PageMyUnLogin(SoloWrap solo){
        this.solo=solo;
    }
    public void initViews(){
        loginBtn=(ImageView)solo.getView("net.oschina.app:id/iv_portrait");
        settings=(ImageView)solo.getView("net.oschina.app:id/iv_logo_setting");
    }
    public void clickLoginBtn(){solo.clickOnView(loginBtn);}
    public void clickSettings(){solo.clickOnView(settings);}
}
