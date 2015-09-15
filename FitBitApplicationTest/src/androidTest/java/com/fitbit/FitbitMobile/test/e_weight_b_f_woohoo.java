package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class e_weight_b_f_woohoo extends ActivityInstrumentationTestCase2 {
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
    public e_weight_b_f_woohoo() throws ClassNotFoundException {
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
        //solo.takeScreenshot("a_editWeight_a_dash");
        //Scroll
        //android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
        //solo.scrollListToLine(listView0, 5);

        //Click
        //solo.clickOnView(solo.getView("tile_content", 2));
        ////solo.takeScreenshot("a_editWeight_b_tapTile");
        solo.clickOnText(java.util.regex.Pattern.quote("Woohoo!"));
        //Wait for activity: 'com.fitbit.home.ui.DetailActivity_'
        assertTrue("DetailActivity_ is not found!", solo.waitForActivity("DetailActivity_"));
        //Sleep
        solo.sleep(1000);
        //solo.takeScreenshot("a_editWeight_c_weight");
        //Click on Empty Text View
        solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.weight.ui.WeightLogActivity'
        assertTrue("WeightLogActivity is not found!", solo.waitForActivity("WeightLogActivity"));
        //Sleep
        solo.sleep(500);

    }
}
