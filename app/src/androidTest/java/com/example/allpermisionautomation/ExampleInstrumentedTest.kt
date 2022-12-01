package com.example.allpermisionautomation

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {

    /**
     UiDevice class use to access and perform operations device on which app is runnning
     */
    private var device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    //launch the app
    @get:Rule
    var activityScenarioRule= ActivityScenarioRule(MainActivity::class.java)



    @Test
    fun clickonButton() {
        //click on blutooth button
        device.findObject(UiSelector().text("BLUETOOTH")).click()
        //click on allow
        device.findObject(UiSelector().text("Allow")).click()
        //click home button
        device.pressHome()

    }
}