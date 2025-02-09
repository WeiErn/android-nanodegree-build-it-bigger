package com.udacity.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class DisplayJokeActivity extends AppCompatActivity {
    DisplayJokeActivityFragment mDisplayJokeActivityFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();

        if (intent.hasExtra(getString(R.string.param_joke))) {
            String joke = intent.getExtras().getString(getString(R.string.param_joke));
            FragmentManager fragmentManager = getSupportFragmentManager();
            mDisplayJokeActivityFragment = (DisplayJokeActivityFragment) fragmentManager.findFragmentById(R.id.fragment);
            mDisplayJokeActivityFragment.setJoke(joke);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_image, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
