package com.moringaschool.one_clickpick;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.moringaschool.one_clickpick.ui.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

//    @Test
//    public void validateEditText(){
//        onView(withId(R.id.locationEditText)).perform(typeText("hello"))
//                .check(matches(withText("hello")));
//    }

    @Test
    public void orderNowButtonGoesToLogInActivity(){
        onView(withId(R.id.orderNowButton)).perform(click());
        String userName = "Customer";
        String passWord = "confidential";

        onView(withId(R.id.userEnteredEmail)).perform(typeText(userName)).perform(ViewActions.closeSoftKeyboard());
        onView(withId(R.id.userPassword)).perform(typeText(passWord)).perform(ViewActions.closeSoftKeyboard());
        try {
            Thread.sleep(250);
        }catch (InterruptedException e){
            System.out.println("got interrupted");
        }

        onView(withId(R.id.logInButton)).perform(click());
        onView(withId(R.id.welcomeMessage)).check(matches(withText("Welcome back " + userName)));
    }

}

