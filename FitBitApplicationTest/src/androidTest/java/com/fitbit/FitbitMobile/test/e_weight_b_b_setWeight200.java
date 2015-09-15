package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class e_weight_b_b_setWeight200 extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public e_weight_b_b_setWeight200() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }
    @SmallTest
    public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 2000);
        //Sleep
        solo.sleep(500);
        //Click BURGER
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep
        solo.sleep(500);
        //Click on Account
        solo.clickInList(4, 2);
        //Wait for activity: 'com.fitbit.settings.ui.ProfileActivity'
        assertTrue("ProfileActivity is not found!", solo.waitForActivity("ProfileActivity"));
        //Sleep
        solo.sleep(500);
        solo.clickOnText(java.util.regex.Pattern.quote("SETTINGS"));
        solo.sleep(500);

        solo.clickOnText(java.util.regex.Pattern.quote("Edit Your Profile"));

        //solo.clickOnView(solo.getView("activity"));
        //Wait for activity: 'com.fitbit.settings.ui.GoalsActivity'
        //assertTrue("GoalsActivity is not found!", solo.waitForActivity("GoalsActivity"));

        solo.sleep(500);

        solo.clearEditText(4);
        solo.enterText(4, "200");

        solo.clickOnView(solo.getView("profile_save"));







    }
}
