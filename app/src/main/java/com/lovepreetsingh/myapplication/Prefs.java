package com.lovepreetsingh.myapplication;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Lovepreet Singh on 3/24/2015.
 */
public class Prefs extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
