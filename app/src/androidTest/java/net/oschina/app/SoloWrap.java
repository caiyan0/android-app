package net.oschina.app;

import android.renderscript.Element;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;
import com.umeng.socialize.net.utils.UResponse;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;

import net.oschina.app.improve.detail.contract.BlogDetailContract;

/**
 * Created by Admin on 2016/12/17.
 */
public class SoloWrap {
    private Solo solo;
    public SoloWrap(Solo solo){this.solo = solo;}
    public void clickOnView(View view){
        if (view != null){
            Log.i("AUTO","click on view"+ view.getId());
            solo.waitForView(view,1,5000);
            solo.clickOnView(view);
        }else{
            Assert.fail("View is null,cannot click!");
        }
    }
    public View getView(String id){
        View view = null;
        try {
            view=solo.getView(id) ;
        }catch (AssertionFailedError ex){
            if (ex.getMessage().contains("not found")){
                return null;
            }
        }
        return view;
    }
    public View getView(int id){
        return solo.getView(id);
    }
    public void enterText(EditText indext, String text){
        solo.enterText(indext,text);
    }
    public void clearEditText(EditText editText){
        solo.clearEditText(editText);
    }
    public Solo getSolo(){
        return solo;
    }
    public void sleep(int seconds){
        solo.sleep(seconds);
    }
    public void waitForText(String text){
        solo.waitForView(text,1,5000);
    }
    public boolean searchText(String text,boolean onlyVisible){
        return  solo.searchText(text,onlyVisible);
    }
    public void clickOnText(String text){
        solo.clickOnText(text);
    }
    public void finishOpenedActivities(){
        solo.finishOpenedActivities();
    }
    public void takeScreenshot(String name) {
       solo.takeScreenshot(name);
    }
    public WebElement getWebElement(String xpath){return  solo.getWebElement(By.xpath(xpath),0);}
}
