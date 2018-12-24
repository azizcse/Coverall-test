package dekz.traviscoveralls;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/*
 *  ****************************************************************************
 *  * Created by : Md. Azizul Islam on 12/24/2018 at 1:12 PM.
 *  * Email : azizul@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Azizul Islam on 12/24/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> RUL = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void additionTest() {
        delay(1000);

        onView(withId(R.id.etNum1)).perform(typeText("10"));
        delay(1000);

        onView(withId(R.id.etNum2)).perform(typeText("10"));
        delay(1000);

        onView(withId(R.id.btnTambah)).perform(click());
        delay(1000);

        //onView(withId(R.id.tvHasil)).check(matches(withText("20.0")));
        delay(1000);
    }

    private void delay(long item) {
        try {
            Thread.sleep(item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}