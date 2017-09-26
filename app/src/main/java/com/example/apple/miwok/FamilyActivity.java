package com.example.apple.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by apple on 26/09/17.
 */

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә", R.mipmap.family_father));
        words.add(new Word("mother", "әṭa", R.mipmap.family_mother));
        words.add(new Word("son", "angsi", R.mipmap.family_son));
        words.add(new Word("daughter", "tune", R.mipmap.family_daughter));
        words.add(new Word("older brother", "taachi", R.mipmap.family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.mipmap.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.mipmap.family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.mipmap.family_younger_sister));
        words.add(new Word("grandmother", "ama", R.mipmap.family_grandmother));
        words.add(new Word("grandfather", "paapa", R.mipmap.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
