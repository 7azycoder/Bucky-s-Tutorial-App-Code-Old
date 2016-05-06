package com.lovepreetsingh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

/**
 * Created by Lovepreet Singh on 3/7/2015.
 */
public class Splash extends Activity {
    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle lovepreet) {
        super.onCreate(lovepreet);
        setContentView(R.layout.splash);
        ourSong= MediaPlayer.create(Splash.this,R.raw.backgroundmusic);

        SharedPreferences getPrefs= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        boolean music= getPrefs.getBoolean("checkbox",true);
        if(music==true){
            ourSong.start();
        }


        Thread timer= new Thread(){
            public void run(){
                try{
                        sleep(1000);

                }catch(InterruptedException e){
                        e.printStackTrace();
                }finally{
                    Intent openMainActivity= new Intent("com.lovepreetsingh.myapplication.MENU");
                    startActivity(openMainActivity);

                }

            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }

    /**
     * Created by Lovepreet Singh on 06-04-2015.
     */
    public static class Flipper extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.flipper);
        }
    }
}
