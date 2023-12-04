package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);

        // Replace "YOUR_VIDEO_URL" with the actual URL of the streaming video
        String videoUrl = "https://abplivetv.akamaized.net/hls/live/2043010/hindi/master.m3u8";

        // Create a Uri object from the video URL
        Uri videoUri = Uri.parse(videoUrl);

        // Set the media controller to enable play, pause, etc.
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Set the URI of the video to be played
        videoView.setVideoURI(videoUri);

        // Start the video
        videoView.start();
    }
}