package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.graphics.Typeface;




public class MainActivity extends AppCompatActivity {
    MediaPlayer mysong;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysong=MediaPlayer.create(MainActivity.this,R.raw.mylovepiano);
        Button tela2 = (Button) findViewById(R.id.imageButton2);
        t=(TextView) findViewById(R.id.jogar);
        Typeface myCustonFont=Typeface.createFromAsset(getAssets(),"fonts/bubble.tff");
        t.setTypeface(myCustonFont);
     }



 public void PlayIt(View v){
        mysong.start();
 }
    public void sair(View v){
        this.finish();
    }
}
