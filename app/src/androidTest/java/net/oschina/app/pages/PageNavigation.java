package net.oschina.app.pages;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/18.
 */
public class PageNavigation {
    private SoloWrap solo;
    private View myFL,exploreFL,tweetFL,homeFL;
    private ImageView newPost;

    public PageNavigation(SoloWrap solo){
        this.solo = solo;
    }

    public void initViews(){
        solo.waitForText("动弹");
        homeFL = solo.getView("net.oschina.app:id/nav_item_news");
        exploreFL = solo.getView("net.oschina.app:id/nav_item_tweet");
        tweetFL = solo.getView("net.oschina.app:id/nav_item_tweet");
        myFL = solo.getView("net.oschina.app:id/nav_item_me");
        newPost = (ImageView) solo.getView("net.oschina.app:id/nav_item_tweet_pub");
    }

    public void goToHomeTab(){
        solo.clickOnView(homeFL);
    }

    public void goToTweetTab(){
        solo.clickOnView(tweetFL);
    }

    public void clickNewPost(){
        solo.clickOnView(newPost);
    }

    public void clickExploreTab(){
        solo.clickOnView(exploreFL);
    }

    public void goToMyTab(){
        solo.clickOnView(myFL);
    }


}
