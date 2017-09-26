package com.example.apple.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by apple on 26/09/17.
 */

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi",R.mipmap.color_red));
        words.add(new Word("green", "chokokki", R.mipmap.color_green));
        words.add(new Word("brown", "ṭakaakki", R.mipmap.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.mipmap.color_gray));
        words.add(new Word("black", "kululli", R.mipmap.color_black));
        words.add(new Word("white", "kelelli", R.mipmap.color_white));
        words.add(new Word("dusty yellow", "ṭopiisә", R.mipmap.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.mipmap.color_mustard_yellow));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

