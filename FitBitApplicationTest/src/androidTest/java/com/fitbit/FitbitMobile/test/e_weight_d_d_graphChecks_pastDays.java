package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class e_weight_d_d_graphChecks_pastDays extends ActivityInstrumentationTestCase2 {
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
    public e_weight_d_d_graphChecks_pastDays() throws ClassNotFoundException {
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
        /*
        //Scroll
        android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
        solo.scrollListToLine(listView0, 5);
        //Click
        solo.clickOnView(solo.getView("tile_content", 2));
        //solo.takeScreenshot("a_editWeight_b_tapTile");
        */
		//tap lbs to go -- user has Food Plan
		solo.clickOnText(java.util.regex.Pattern.quote("lbs to go"));
        //Wait for activity: 'com.fitbit.home.ui.DetailActivity_'
		assertTrue("DetailActivity_ is not found!", solo.waitForActivity("DetailActivity_"));
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btnGoLeft"));
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btnGoLeft"));
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btnGoLeft"));
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_enlarge_graph"));
        //Rotate the screen
		solo.setActivityOrientation(Solo.LANDSCAPE);
        //Sleep
		solo.sleep(500);
        //Click on 1w
		solo.clickOnView(solo.getView("btn_week"));
        //Sleep
		solo.sleep(500);
        //Click on 1m
		solo.clickOnView(solo.getView("btn_month"));
        //Sleep
		solo.sleep(500);
        //Click on 3m
		solo.clickOnView(solo.getView("btn_3months"));
        //Sleep
		solo.sleep(500);
        //Click on 1y
		solo.clickOnView(solo.getView("btn_year"));
        //Sleep
		solo.sleep(500);
        //Click on Weight
		solo.clickOnView(solo.getView("spn_chart_type"));
        //Wait for spinner to open
		solo.waitForDialogToOpen(5000);
        //Sleep
		solo.sleep(500);
        //Click on Lean vs Fat
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
        //Sleep
		solo.sleep(500);
        //Click on 1w
		solo.clickOnView(solo.getView("btn_week"));
        //Sleep
		solo.sleep(500);
        //Click on 1m
		solo.clickOnView(solo.getView("btn_month"));
        //Sleep
		solo.sleep(500);
        //Click on 3m
		solo.clickOnView(solo.getView("btn_3months"));
        //Sleep
		solo.sleep(500);
        //Click on 1y
		solo.clickOnView(solo.getView("btn_year"));
        //Sleep
		solo.sleep(500);
        //Click on Lean vs Fat
		solo.clickOnView(solo.getView("spn_chart_type"));
        //Wait for spinner to open
		solo.waitForDialogToOpen(5000);
        //Sleep
		solo.sleep(500);
        //Click on BMI
		solo.clickOnView(solo.getView(android.R.id.text1, 2));
        //Sleep
		solo.sleep(500);
        //Click on 1w
		solo.clickOnView(solo.getView("btn_week"));
        //Sleep
		solo.sleep(500);
        //Click on 1m
		solo.clickOnView(solo.getView("btn_month"));
        //Sleep
		solo.sleep(500);
        //Click on 3m
		solo.clickOnView(solo.getView("btn_3months"));
        //Sleep
		solo.sleep(500);
        //Click on 1y
		solo.clickOnView(solo.getView("btn_year"));
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_collapse_graph"));
        //Rotate the screen
		solo.setActivityOrientation(Solo.PORTRAIT);
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btnGoRight"));
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btnGoRight"));
        //Sleep
		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView("btnGoRight"));
	}
}
