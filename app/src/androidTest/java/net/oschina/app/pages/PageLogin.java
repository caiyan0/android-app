package net.oschina.app.pages;

import android.widget.Button;
import android.widget.EditText;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/18.
 */
public class PageLogin {
    private SoloWrap solo;
    private EditText nameET,pwdEt;
    private Button loginBtn;
    public PageLogin(SoloWrap solo){
        this.solo = solo;
    }
    public void initViews(){
        nameET = (EditText)solo.getView("net.oschina.app:id/et_username");
        pwdEt = (EditText)solo.getView("net.oschina.app:id/et_password");
        loginBtn = (Button)solo.getView("net.oschina.app:id/btn_login");
    }
    public void clearNameEditText(){solo.clearEditText(nameET);}
    public void clearPwdEditText(){solo.clearEditText(pwdEt);}
    public void enterName(String name){solo.enterText(nameET,name);}
    public void enterPwd(String pwd){solo.enterText(pwdEt,pwd);}
    public void clickOnLoginBtn(){solo.clickOnView(loginBtn);}
    public void Login(String name,String pwd){
        clearPwdEditText();
        clearNameEditText();
        enterName(name);
        enterPwd(pwd);
        clickOnLoginBtn();
    }
}
