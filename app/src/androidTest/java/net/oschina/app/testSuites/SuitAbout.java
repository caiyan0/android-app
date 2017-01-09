package net.oschina.app.testSuites;

import junit.framework.TestSuite;

import net.oschina.app.testCase.About.VersionCheck;

/**
 * Created by Admin on 2016/12/18.
 */
public class SuitAbout {
    public static TestSuite getSuitAbout(){
        TestSuite suite=new TestSuite();
        suite.addTestSuite(VersionCheck.class);
        return suite;
    }
}
