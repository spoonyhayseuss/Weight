package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class e_weight_b_c_goal190lbs extends ActivityInstrumentationTestCase2 {
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
    public e_weight_b_c_goal190lbs() throws ClassNotFoundException {
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
    //@SmallTest
    public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 2000);

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
        solo.clickOnView(solo.getView("nutrition_and_body"));
        //Wait for activity: 'com.fitbit.settings.ui.GoalsActivity'
        assertTrue("GoalsActivity is not found!", solo.waitForActivity("GoalsActivity"));

        //Click on Your Goal Maintain
        solo.clickOnView(solo.getView("your_goal_container"));
        //Wait for activity: 'com.fitbit.weight.ui.weight.goal.flow.WeightGoalSettingActivity'
        assertTrue("WeightGoalSettingActivity is not found!", solo.waitForActivity("WeightGoalSettingActivity"));
        //Sleep for 600 milliseconds
        solo.sleep(600);
        //Click on Lose
        solo.clickOnView(solo.getView("btn_lose"));
        //Wait for activity: 'com.fitbit.weight.ui.weight.goal.flow.WeightGoalWeightPickerActivity'
        assertTrue("WeightGoalWeightPickerActivity is not found!", solo.waitForActivity("WeightGoalWeightPickerActivity"));

        solo.clearEditText((android.widget.EditText) solo.getView("main_edit_text"));
        solo.enterText((android.widget.EditText) solo.getView("main_edit_text"), "190");

        //Click on Next
        solo.clickOnView(solo.getView("btn_next"));
        //Wait for activity: 'com.fitbit.weight.ui.weight.goal.flow.WeightGoalFatPickerActivity'
        assertTrue("WeightGoalFatPickerActivity is not found!", solo.waitForActivity("WeightGoalFatPickerActivity"));

        //Enter the text: '18'
        solo.clearEditText((android.widget.EditText) solo.getView("main_edit_text"));
        solo.enterText((android.widget.EditText) solo.getView("main_edit_text"), "18");
        //Sleep
        solo.sleep(500);
        //Click on Next
        solo.clickOnView(solo.getView("btn_next"));
        //Wait for activity: 'com.fitbit.weight.ui.weight.goal.flow.WeightGoalCompletedActivity'
        //assertTrue("WeightGoalCompletedActivity is not found!", solo.waitForActivity("WeightGoalCompletedActivity"));

        solo.sleep(500);
        //Click on Done
        //solo.clickOnView(solo.getView("btn_done"));
        //Wait for activity: 'com.fitbit.settings.ui.GoalsActivity'
        //assertTrue("GoalsActivity is not found!", solo.waitForActivity("GoalsActivity"));






    }
}
