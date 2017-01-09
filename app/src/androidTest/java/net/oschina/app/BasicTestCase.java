package net.oschina.app;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.robotium.solo.Solo;

/**
 * Created by Admin on 2016/12/18.
 */
public class BasicTestCase extends ActivityInstrumentationTestCase2<AppStart> {
    private SoloWrap solo;
    protected PageHelper pageHelper;
    private boolean isNeedLogin;

    public BasicTestCase(boolean isNeedLogin){
        super(AppStart.class);
        this.isNeedLogin=isNeedLogin;
    }

    @Override
    public void setUp() throws Exception {
        try {
            super.setUp();
            Solo solo1=new Solo(getInstrumentation(),getActivity());
            solo=new SoloWrap(solo1);
            pageHelper=new PageHelper(solo);
            pageHelper.getPageNavigation().goToMyTab();
            if (isNeedLogin){
                if (pageHelper.getPageMyLogin().isNickNameShow()){
                    pageHelper.getPageMyLogin().clickSettings();
                    pageHelper.getPageSetting().clickLogout();
                }
                pageHelper.getPageMyUnLogin().clickLoginBtn();
                pageHelper.getPageLogin().Login("735723619@qq.com","12345678");
            }
        } catch (Throwable th){
            Log.i("AUTO","errors happend in setup method,errpr msg is:"+th.getMessage());
            solo.takeScreenshot(this.getClass().getSimpleName());
            throw th;
        }
        }

    @Override
    protected void runTest() throws Throwable {
        try {
            super.runTest();
        }catch (Throwable th){
            Log.i("AUTO","errors happend in runtest method,errpr msg is:"+th.getMessage());
            solo.takeScreenshot(this.getClass().getSimpleName());
            throw th;
        }

    }

    @Override
    public void tearDown() throws Exception {
        try {

        }catch (Throwable th){
            Log.i("AUTO","errors happend in tearDown method,errpr msg is:"+th.getMessage());
            solo.takeScreenshot(this.getClass().getSimpleName());
            throw th;
        }finally {
            solo.finishOpenedActivities();
            super.tearDown();
        }

    }
}
