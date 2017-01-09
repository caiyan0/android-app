package net.oschina.app.testCase.login;

import net.oschina.app.BasicTestCase;

/**
 * Created by Admin on 2016/12/18.
 */
public class WrongLogin extends BasicTestCase {
    public WrongLogin(){super(false);}
    public void testWrongLogin(){
        pageHelper.getPageNavigation().goToMyTab();
        if (pageHelper.getPageMyLogin().isNickNameShow()){
            pageHelper.getPageMyLogin().clickSettings();
            pageHelper.getPageSetting().clickLogout();
        }
        pageHelper.getPageMyUnLogin().clickLoginBtn();
        pageHelper.getPageLogin().Login("123445667","12234444");
        assertTrue(pageHelper.getSolo().searchText("用户名或口令错",true));
    }
}
