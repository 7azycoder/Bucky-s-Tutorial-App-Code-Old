package com.lovepreetsingh.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;

/**
 * Created by Lovepreet Singh on 02-04-2015.
 */
public class GFX extends Activity {
    MyBringBack ourView;
    PowerManager.WakeLock wL;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        PowerManager pM = (PowerManager)getSystemService(Context.POWER_SERVICE);
        wL= pM.newWakeLock(PowerManager.FULL_WAKE_LOCK,"whatever");
        super.onCreate(savedInstanceState);
        wL.acquire();
        ourView = new MyBringBack(this);
        setContentView(ourView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        wL.release();
    }
}
