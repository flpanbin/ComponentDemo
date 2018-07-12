package com.example.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.module2.R;
import com.github.mzule.activityrouter.annotation.Router;

@Router("book_main")
public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_main);
    }
}
