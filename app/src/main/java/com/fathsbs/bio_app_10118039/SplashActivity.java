/*
Tanggal Pengerjaan      : Terakhir 4 Juni 2021 22:44
NIM                     : 10118039
Nama                    : Fatahillah Satria Bima Seno
Kelas                   : AKB-1 atau IF-1
 */

package com.fathsbs.bio_app_10118039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.MultiplePulse;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;
    Animation logoAnim,textAnim,copyrightAnim,pgBar_anim;
    ImageView image;
    com.github.ybq.android.spinkit.SpinKitView pgBar;
    TextView text_app, text_app_romaji,text_app_copyright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        //proggress bar
        ProgressBar progressBar = (ProgressBar)findViewById(R.id.spin_kit);
        Sprite pulse = new MultiplePulse();
        progressBar.setIndeterminateDrawable(pulse);

        //animasi
        logoAnim = AnimationUtils.loadAnimation(this,R.anim.logo_animation);
        textAnim = AnimationUtils.loadAnimation(this,R.anim.text_animation);
        copyrightAnim = AnimationUtils.loadAnimation(this,R.anim.copyright_animation);
        pgBar_anim = AnimationUtils.loadAnimation(this,R.anim.pg_bar_animation);

        //Cari id
        image   = findViewById(R.id.logo);
        text_app    = findViewById(R.id.name_app);
        text_app_romaji    = findViewById(R.id.name_app_romaji);
        text_app_copyright    = findViewById(R.id.copyright);
        pgBar    = findViewById(R.id.spin_kit);

        //implementasi
        image.setAnimation(logoAnim);
        text_app.setAnimation(textAnim);
        text_app_romaji.setAnimation(textAnim);
        text_app_copyright.setAnimation(copyrightAnim);
        pgBar.setAnimation(pgBar_anim);

        //pindah halaman
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,WalktroughActivity.class);
                startActivity(intent);
            }
        },SPLASH_SCREEN);
    }
}