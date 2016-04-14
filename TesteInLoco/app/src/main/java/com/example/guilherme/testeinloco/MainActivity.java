package com.example.guilherme.testeinloco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.inlocomedia.android.InLocoMedia;
import com.inlocomedia.android.InLocoMediaOptions;
import com.inlocomedia.android.ads.AdError;
import com.inlocomedia.android.ads.AdRequest;
import com.inlocomedia.android.ads.interstitial.InterstitialAd;
import com.inlocomedia.android.ads.interstitial.InterstitialAdListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InLocoMediaOptions options = InLocoMediaOptions.getInstance(this);
        options.setAdsKey("b45b572b562acafc5f5087774ee7cec3ee648b67377950381daa1e198ae7c135");

        options.setLogEnabled(true);
        options.setDevelopmentDevices("43292C85F9C5D8846CF9F423306BD7EF");

        InLocoMedia.init(this, options);




    }
}
