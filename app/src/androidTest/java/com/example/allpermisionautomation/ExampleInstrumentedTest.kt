package com.example.allpermisionautomation


import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SdkSuppress
import androidx.test.uiautomator.*


import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

import org.junit.Rule


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
private const val BASIC_SAMPLE_PACKAGE = "com.example.android.testing.uiautomator.BasicSample"
private const val LAUNCH_TIMEOUT = 5000L
private const val STRING_TO_BE_TYPED = "UiAutomator"

@RunWith(AndroidJUnit4::class)
@SdkSuppress(minSdkVersion = 18)
class ExampleInstrumentedTest {
    private lateinit var device: UiDevice-
@get:Rule
var activityScenarioRule=ActivityScenarioRule(MainActivity::class.java)
   @Test
   fun bluetoothPermission()
   {
       device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

       val bluetoothBtn : UiObject= device.findObject(UiSelector().text("BLUETOOTH").className("android.widget.Button"))

       bluetoothBtn.click()

       val allowBtn:UiObject=device.findObject(UiSelector().text("Allow").className("android.widget.Button"))
      allowBtn.click()





   }



}