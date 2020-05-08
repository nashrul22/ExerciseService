package com.example.exerciseservice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        audio = MediaPlayer.create(this, R.raw.sound);
        audio.setLooping(true);
        audio.setVolume(1, 1);
        audio.start();

    }
public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            audio.setVolume(0,0);
        }
        else {
            audio.setVolume(1,1);
        }
}

    private void isChecked() {
    }

    public void onBackPressed(){
        audio.stop();
        MainActivity.this.finish();
}


}
