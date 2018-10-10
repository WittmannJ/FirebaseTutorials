package com.wittmann.jackl.firebasetutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // tutorial: https://www.youtube.com/watch?v=tg_7eV99RfM&list=PLGCjwl1RrtcSi2oV5caEVScjkM6r3HO9t&index=6
    private Button mFirebaseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseBtn = (Button) findViewById(R.id.firebase_btn);
    }
}
