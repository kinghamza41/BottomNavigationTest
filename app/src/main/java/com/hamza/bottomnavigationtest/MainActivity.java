package com.hamza.bottomnavigationtest;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
   Button btnplay;
    VideoView myvideo;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*btnplay = (Button) findViewById(R.id.btn_play);*/
        myvideo = (VideoView) findViewById(R.id.videoplayer);

        mediaController = new MediaController(this);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(selListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();

        String path = "android.resource://com.hamza.bottomnavigationtest/" + R.raw.mycreation;
        Uri uri = Uri.parse(path);
        myvideo.setVideoURI(uri);
        myvideo.setMediaController(mediaController);
        mediaController.setAnchorView(myvideo);
        myvideo.start();

       /* btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String path="android.resource://com.hamza.videoplaying/"+R.raw.mycreation;
                Uri uri=Uri.parse(path);
                myvideo.setVideoURI(uri);
                myvideo.setMediaController(mediaController);
                mediaController.setAnchorView(myvideo);
                myvideo.start();
            }
        });*/

    }

    private BottomNavigationView.OnNavigationItemSelectedListener selListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch (menuItem.getItemId()) {

                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();


                            /*String path = "android.resource://com.hamza.videoplaying/" + R.raw.mycreation;
                            Uri uri = Uri.parse(path);
                            myvideo.setVideoURI(uri);
                            myvideo.start();
        myvideo.setMediaController(mediaController);
        mediaController.setAnchorView(myvideo);*/

                            break;
                        case R.id.nav_favourite:
                            selectedFragment = new FavouriteFragment();
                            break;
                        case R.id.nav_search:
                            selectedFragment = new SearchFragment();
                            break;
                        case R.id.nav_help:
                            selectedFragment = new HelpFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };

   /* public void New_click(View view) {

        myvideo = (VideoView) findViewById(R.id.videoplayer);

        String path = "android.resource://com.hamza.bottomnavigationtest/" + R.raw.mycreation;
        Uri uri = Uri.parse(path);
        myvideo.setVideoURI(uri);
          myvideo.setMediaController(mediaController);
        mediaController.setAnchorView(myvideo);
        myvideo.start();
    }*/
}

