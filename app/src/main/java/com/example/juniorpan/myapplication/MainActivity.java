package com.example.juniorpan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.github.mzule.activityrouter.router.Routers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_book;
    private Button btn_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_book = findViewById(R.id.btn_book);
        btn_music = findViewById(R.id.btn_music);
        btn_book.setOnClickListener(this);
        btn_music.setOnClickListener(this);
        System.out.println("sdfsdfsdf");
        Log.i("myapp","initview...");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_book:
                System.out.print("btn_book clicked!");
                Routers.open(MainActivity.this,"mzule://book_main");
                System.out.println("after btn_book clicked!");
                Log.i("myapp","btn_book clicked...");
                break;
            case R.id.btn_music:
                System.out.println(" btn_music clicked!");
                Routers.open(MainActivity.this,"mzule://music_main");
                System.out.println("after btn_music clicked!");
                Log.i("myapp","btn_music clicked...");
                break;
        }
    }
}
