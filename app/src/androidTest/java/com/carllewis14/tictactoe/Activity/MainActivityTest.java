package com.carllewis14.tictactoe.Activity;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.carllewis14.tictactoe.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void addPlayerMarkToCell() {
        ViewInteraction textView = onView(
                allOf(withId(R.id.cell21),
                        withParent(allOf(withId(R.id.Row2),
                                withParent(withId(R.id.Grid)))),
                        isDisplayed()));
        textView.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.cell32),
                        withParent(allOf(withId(R.id.Row3),
                                withParent(withId(R.id.Grid)))),
                        isDisplayed()));
        textView2.perform(click());

    }

}
