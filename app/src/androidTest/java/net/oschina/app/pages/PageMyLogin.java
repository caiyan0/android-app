package net.oschina.app.pages;

import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/18.
 */
public class PageMyLogin {
    private SoloWrap solo;
    private TextView nickName;
    private ImageView settings;

    public PageMyLogin(SoloWrap solo){
        this.solo = solo;
    }
    public void initViews(){
        nickName=(TextView)solo.getView("net.oschina.app:id/tv_nick");
        settings=(ImageView)solo.getView("net.oschina.app:id/iv_logo_setting");
    }
    public String getNickName(){return nickName.getText().toString();}
    public boolean isNickNameShow(){
        if(nickName != null){
           if (nickName.isShown() && nickName.getText().toString().equals("autotest"));
            return true;
        }
        return false;
    }
    public void clickSettings(){solo.clickOnView(settings);}

}
