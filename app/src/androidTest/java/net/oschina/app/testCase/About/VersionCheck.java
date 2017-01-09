package net.oschina.app.testCase.About;

import junit.framework.Assert;

import net.oschina.app.BasicTestCase;

/**
 * Created by Admin on 2016/12/18.
 */
public class VersionCheck extends BasicTestCase {
    public VersionCheck(){super(false);}

    public void testVersionCheck(){
        pageHelper.getPageMyUnLogin().clickSettings();
        pageHelper.getPageSetting().clickAbout();
        assertEquals("v2.6.6(1609281026)",pageHelper.getPageAbout().getVersionValue());
    }
}
