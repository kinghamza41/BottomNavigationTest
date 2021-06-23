package com.hamza.bottomnavigationtest;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomeFragment extends Fragment {
    Button btnplay;
    VideoView myvideo;
    MediaController mediaController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
       /* myvideo = (VideoView) findViewById(R.id.videoplayer);

        String path = "android.resource://com.hamza.bottomnavigationtest/" + R.raw.mycreation;
        Uri uri = Uri.parse(path);
        myvideo.setVideoURI(uri);
        myvideo.setMediaController(mediaController);
        mediaController.setAnchorView(myvideo);
        myvideo.start();*/
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*myvideo = (VideoView) myvideo.findViewById(R.id.videoplayer);

        String path = "android.resource://com.hamza.bottomnavigationtest/" + R.raw.mycreation;
        Uri uri = Uri.parse(path);
        myvideo.setVideoURI(uri);
        myvideo.setMediaController(mediaController);
        mediaController.setAnchorView(myvideo);
        myvideo.start();*/

       /* btnplay = (Button) btnplay.findViewById(R.id.btn_play);


        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String path = "android.resource://com.hamza.bottomnavigationtest/" + R.raw.mycreation;
                Uri uri = Uri.parse(path);
                myvideo.setVideoURI(uri);
                myvideo.setMediaController(mediaController);
                mediaController.setAnchorView(myvideo);
                myvideo.start();

            }
        });*/

    }
}
