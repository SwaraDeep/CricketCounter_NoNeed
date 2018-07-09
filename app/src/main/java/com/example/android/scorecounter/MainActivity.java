package com.example.android.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int scoreA = 0, scoreB = 0, wicketA = 0, wicketB = 0;

    public void onePointA(View view) {
        scoreA += 1;
        displayA(scoreA);
    }

    public void twoPointA(View view) {
        scoreA += 2;
        displayA(scoreA);
    }

    public void fourPointA(View view) {
        scoreA += 4;
        displayA(scoreA);
    }

    public void sixPointA(View view) {
        scoreA += 6;
        displayA(scoreA);
    }

    public void wicketsA(View view) {
        if (wicketA == 10) {
            wicketA = 10;
        } else {
            wicketA += 1;
        }
        displayWicketsA(wicketA);
    }

    public void reset(View view) {
        wicketA = 0;
        wicketB = 0;
        scoreB = 0;
        scoreA = 0;
        displayA(scoreA);
        displayB(scoreB);
        displayWicketsB(wicketB);
        displayWicketsA(wicketA);
    }

    public void displayA(int total) {
        TextView totalA = (TextView) findViewById(R.id.scoreone);
        totalA.setText("" + total);
    }

    public void displayWicketsA(int wickets) {
        TextView wicketsA = (TextView) findViewById(R.id.wicketone);
        wicketsA.setText("" + wickets);
    }


    public void onePointB(View view) {
        scoreB += 1;
        displayB(scoreB);
    }

    public void twoPointB(View view) {
        scoreB += 2;
        displayB(scoreB);
    }

    public void fourPointB(View view) {
        scoreB += 4;
        displayB(scoreB);
    }

    public void sixPointB(View view) {
        scoreB += 6;
        displayB(scoreB);
    }

    public void wicketsB(View view) {
        if (wicketB == 10) {
            wicketB = 10;
        } else {
            wicketB += 1;
        }
        displayWicketsB(wicketB);
    }

    public void displayB(int total) {
        TextView totalB = (TextView) findViewById(R.id.scoreoneb);
        totalB.setText("" + total);
    }

    public void displayWicketsB(int wickets) {
        TextView wicketsB = (TextView) findViewById(R.id.wicketoneb);
        wicketsB.setText("" + wickets);
    }

}
