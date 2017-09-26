package com.example.apple.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by apple on 26/09/17.
 */

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.mipmap.number_one));
        words.add(new Word("two", "otiiko", R.mipmap.number_two));
        words.add(new Word("three", "tolookosu", R.mipmap.number_three));
        words.add(new Word("four", "oyyisa", R.mipmap.number_four));
        words.add(new Word("five", "massokka", R.mipmap.number_five));
        words.add(new Word("six", "temmokka", R.mipmap.number_six));
        words.add(new Word("seven", "kenekaku", R.mipmap.number_seven));
        words.add(new Word("eight", "kawinta", R.mipmap.number_eight));
        words.add(new Word("nine", "wo’e", R.mipmap.number_nine));
        words.add(new Word("ten", "na’aacha", R.mipmap.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("NumberActivity", "Playing sound");
                mMediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.number_one);
                mMediaPlayer.start();
            }
        });
    }
}
