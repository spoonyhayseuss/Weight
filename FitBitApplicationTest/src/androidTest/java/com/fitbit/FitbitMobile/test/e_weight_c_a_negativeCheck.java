package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class e_weight_c_a_negativeCheck extends ActivityInstrumentationTestCase2 {
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
    public e_weight_c_a_negativeCheck() throws ClassNotFoundException {
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
        solo.sleep(1000);

        solo.clickOnText(java.util.regex.Pattern.quote("Woohoo!"));
        assertTrue("WeightLandingActivity is not found!", solo.waitForActivity("WeightLandingActivity"));
        solo.sleep(500);
        solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.weight.ui.WeightLogActivity'
        assertTrue("WeightLogActivity is not found!", solo.waitForActivity("WeightLogActivity"));

        solo.sleep(500);
        solo.clearEditText(1);
        solo.enterText(1, "");


        solo.sleep(500);
        solo.clickOnView(solo.getView("menu_save"));


        assertTrue("'Weight must be in range from 1lbs to 1,500lbs. Current value is 0.' is not shown!", solo.waitForView(solo.getView(android.R.id.message)));

/*
        solo.sleep(500);
        solo.clearEditText(1);
        solo.enterText(1, "4");
        solo.clickOnView(solo.getView("menu_save"));
        assertTrue("'Weight must be in range from 1lbs to 1,500lbs. Current value is 0.' is not shown!", solo.waitForView(solo.getView(android.R.id.message)));
*/
        //Sleep
        solo.sleep(500);

        solo.clearEditText(1);
        solo.enterText(1, "1600");
        solo.clickOnView(solo.getView("menu_save"));
        assertTrue("'Weight must be in range from 1lbs to 1,500lbs. Current value is 0.' is not shown!", solo.waitForView(solo.getView(android.R.id.message)));



    }
}
