package net.oschina.app.runners;

import android.test.InstrumentationTestRunner;

import com.zutubi.android.junitreport.JUnitReportTestRunner;

import junit.framework.TestSuite;

import net.oschina.app.testSuites.SuitAbout;
import net.oschina.app.testSuites.SuitLogin;

/**
 * Created by Admin on 2016/12/19.
 */
public class Runner1 extends JUnitReportTestRunner{
    @Override
    public TestSuite getAllTests() {
        TestSuite suite=new TestSuite();
        suite.addTest(SuitLogin.getSuitLogin());
        suite.addTest(SuitAbout.getSuitAbout());
        return suite;
    }
}
