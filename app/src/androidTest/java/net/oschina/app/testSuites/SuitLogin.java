package net.oschina.app.testSuites;

import junit.framework.TestSuite;

import net.oschina.app.testCase.login.RightLogin;
import net.oschina.app.testCase.login.WrongLogin;

/**
 * Created by Admin on 2016/12/18.
 */
public class SuitLogin {
    public static TestSuite getSuitLogin(){
        TestSuite suite=new TestSuite();
        suite.addTestSuite(RightLogin.class);
        suite.addTestSuite(WrongLogin.class);
        return suite;
    }
}
