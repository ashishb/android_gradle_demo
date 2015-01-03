package net.ashishb.TestAndroidApp;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class net.ashishb.TestAndroidApp.MainTest \
 * net.ashishb.TestAndroidApp.tests/android.test.InstrumentationTestRunner
 */
public class MainTest extends ActivityInstrumentationTestCase2<Main> {

  public MainTest() {
    super("net.ashishb.TestAndroidApp", Main.class);
  }

  public void testSquare() {
    assertEquals(100, Main.square(10));
  }

}
