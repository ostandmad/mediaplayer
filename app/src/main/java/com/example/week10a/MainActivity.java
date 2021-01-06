package com.example.week10a;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button start,pause,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=(Button)findViewById(R.id.button);
        pause=(Button)findViewById(R.id.button2);
        stop=(Button)findViewById(R.id.button3);
        //creating media player
        final MediaPlayer mp;

        mp = MediaPlayer.create(this, R.raw.song);


        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
        pause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()) {
                    mp.pause();
                }

            }
        });
        stop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                    mp.stop();
                    mp.prepareAsync();

            }
        });
    }
}
