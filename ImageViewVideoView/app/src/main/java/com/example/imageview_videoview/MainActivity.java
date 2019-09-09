package com.example.imageview_videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private Button buttonChange,buttonPlay,buttonPause;
    private ImageView imageView;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChange=findViewById(R.id.buttonChange);
        buttonPlay=findViewById(R.id.buttonPlay);
        buttonPause=findViewById(R.id.buttonPause);

        imageView=findViewById(R.id.imageView);
        videoView=findViewById(R.id.videoView);

        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if want to add new image
                imageView.setImageResource(R.drawable.jelly);
            }
        });

        /*buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //need video path-- use Uri
                Uri path=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.VideoName);
                videoView.setVideoUri(path);
                videoView.start();
            }
        });
        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.stopPlayback();
            }
        });*/
    }
}
