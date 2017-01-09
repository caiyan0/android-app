package net.oschina.app.testCase.login;

import net.oschina.app.BasicTestCase;

/**
 * Created by Admin on 2016/12/18.
 */
public class RightLogin extends BasicTestCase {
    public RightLogin(){super(true);}
    public void testRightLogin(){
        pageHelper.getSolo().sleep(5);
        assertTrue(pageHelper.getPageMyLogin().isNickNameShow());
    }

}
