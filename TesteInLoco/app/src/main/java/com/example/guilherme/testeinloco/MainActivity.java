package com.example.guilherme.testeinloco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.inlocomedia.android.InLocoMedia;
import com.inlocomedia.android.InLocoMediaOptions;
import com.inlocomedia.android.ads.AdError;
import com.inlocomedia.android.ads.interstitial.InterstitialAdListener;

public class MainActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        InLocoMediaOptions options = InLocoMediaOptions.getInstance(this);
        options.setAdsKey("b45b572b562acafc5f5087774ee7cec3ee648b67377950381daa1e198ae7c135");

        options.setLogEnabled(true);
        options.setDevelopmentDevices("43292C85F9C5D8846CF9F423306BD7EF");

        InLocoMedia.init(this, options);

        //------------------------------------------------------------------------------------------
        Button button = (Button) findViewById(R.id.button1);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");


        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    //beginPlayingGame();
                }
            }
        });





    }

}
