package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class e_weight_d_a_lbToStone extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public e_weight_d_a_lbToStone() throws ClassNotFoundException {
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

    public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 2000);
        //Sleep
        solo.sleep(500);
        //solo.takeScreenshot("a_editWeight_a_dash");

        solo.clickOnText(java.util.regex.Pattern.quote("lbs to go"));
        //Wait for activity: 'com.fitbit.home.ui.DetailActivity_'
        assertTrue("DetailActivity_ is not found!", solo.waitForActivity("DetailActivity_"));
        //Sleep
        solo.sleep(500);
        //solo.takeScreenshot("a_editWeight_c_weight");
        //Click on Empty Text View
        solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.weight.ui.WeightLogActivity'
        assertTrue("WeightLogActivity is not found!", solo.waitForActivity("WeightLogActivity"));
        //Sleep
        solo.sleep(1000);
        solo.clickOnText(java.util.regex.Pattern.quote("lbs"));
        //solo.sleep(1500);
        solo.clickOnText(java.util.regex.Pattern.quote("stone"));


        //Click on LOG IT
        solo.clickOnView(solo.getView("log_button"));
        solo.sleep(500);


        solo.goBack();


    }
}