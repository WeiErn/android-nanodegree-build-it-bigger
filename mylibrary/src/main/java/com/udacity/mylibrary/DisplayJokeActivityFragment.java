package com.udacity.mylibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DisplayJokeActivityFragment extends Fragment {

    private TextView mJokeTextView;

    public DisplayJokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display_joke, container, false);
        mJokeTextView = view.findViewById(R.id.jokeTextView);
        return view;
    }

    public void setJoke(String joke) {
        mJokeTextView.setText(joke);
    }
}
