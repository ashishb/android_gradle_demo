package net.ashishb.TestAndroidApp;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public static int square(int x) {
      return x * x;
    }
}
