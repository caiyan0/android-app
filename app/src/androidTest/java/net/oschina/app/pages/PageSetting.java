package net.oschina.app.pages;

import android.widget.RelativeLayout;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/18.
 */
public class PageSetting {
    private SoloWrap solo;
    private RelativeLayout logout,about;

    public PageSetting(SoloWrap solo){this.solo=solo;}

    public void initViews(){
        solo.getView("net.oschina.app:id/rl_cancle");
        solo.getView("net.oschina.app:id/rl_about");
    }
    public void clickLogout(){solo.clickOnView(logout);}
    public void clickAbout(){solo.clickOnView(about);}
}
