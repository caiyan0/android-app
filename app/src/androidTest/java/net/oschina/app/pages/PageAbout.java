package net.oschina.app.pages;

import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/18.
 */
public class PageAbout {
    private SoloWrap solo;
    private TextView version;
    public PageAbout(SoloWrap solo){
        this.solo = solo;
    }
    public  void initViews(){
        version=(TextView)solo.getView("net.oschina.app:id/tv_version_name");
    }
    public String getVersionValue(){
        return version.getText().toString();
    }
}
