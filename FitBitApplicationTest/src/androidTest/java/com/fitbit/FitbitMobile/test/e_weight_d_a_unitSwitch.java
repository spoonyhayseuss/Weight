package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class e_weight_d_a_unitSwitch extends ActivityInstrumentationTestCase2 {
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
    public e_weight_d_a_unitSwitch() throws ClassNotFoundException {
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

        solo.clickOnText(java.util.regex.Pattern.quote("Woohoo!"));
        assertTrue("WeightLandingActivity is not found!", solo.waitForActivity("WeightLandingActivity"));
        solo.sleep(500);
        solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.weight.ui.WeightLogActivity'
        assertTrue("WeightLogActivity is not found!", solo.waitForActivity("WeightLogActivity"));

        solo.clearEditText(1);
        solo.enterText(1, "190");

        solo.clickOnText("lbs");
        solo.clickOnText("stone");

        solo.clickOnText("12");
        solo.clickOnText("13");
        solo.clickOnText("8 lbs");
        solo.clickOnText("stone");
        solo.clickOnText("kg");
        solo.clickOnText("12");
        solo.clickOnText("86.2");
        solo.clickOnText("kg");
        solo.clickOnText("lbs");
        solo.clickOnView(solo.getView("menu_save"));



    }
}