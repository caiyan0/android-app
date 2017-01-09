package net.oschina.app;

import com.robotium.solo.Solo;

import net.oschina.app.pages.PageAbout;
import net.oschina.app.pages.PageLogin;
import net.oschina.app.pages.PageMyLogin;
import net.oschina.app.pages.PageMyUnLogin;
import net.oschina.app.pages.PageNavigation;
import net.oschina.app.pages.PageSetting;

/**
 * Created by Admin on 2016/12/18.
 */
public class PageHelper {
    private SoloWrap solo;
    private PageAbout pageAbout;
    private PageLogin pageLogin;
    private PageMyLogin pageMyLogin;
    private PageMyUnLogin pageMyUnLogin;
    private PageNavigation pageNavigation;
    private PageSetting pageSetting;

    public PageHelper(SoloWrap solo){this.solo=solo;}

    public PageAbout getPageAbout(){
        if (pageAbout == null){
            pageAbout = new PageAbout(solo);
        }
        PageAbout.initViews();
        return pageAbout;
    }
    public PageLogin getPageLogin(){
        if(pageLogin == null){
            pageLogin = new PageLogin(solo);
        }
        pageLogin.initViews();
        return pageLogin;
    }
    public PageMyLogin getPageMyLogin(){
        if (pageMyLogin == null){
            pageMyLogin = new PageMyLogin(solo);
        }
        pageMyLogin.initViews();
        return pageMyLogin;
    }
    public PageMyUnLogin getPageMyUnLogin(){
        if (pageMyUnLogin == null){
            pageMyUnLogin = new PageMyUnLogin(solo);
        }
        pageMyUnLogin.initViews();
        return pageMyUnLogin;
    }
    public PageNavigation getPageNavigation(){
        if (pageNavigation == null){
            pageNavigation = new PageNavigation(solo);
        }
        pageNavigation.initViews();
        return pageNavigation;
    }
    public PageSetting getPageSetting(){
        if (pageSetting == null){
            pageSetting = new PageSetting(solo);
        }
        pageSetting.initViews();
        return pageSetting;
    }
    public SoloWrap getSolo(){
        return solo;
    }
}
