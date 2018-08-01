package com.example.android.rugbyscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //these are global variables and also the initial values for the score displayed
    int pointsForA = 0;
    int pointsForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method displays the value for score of team A.
    public void displayForTeamA(int pointsForA) {
        TextView scoreView = (TextView) findViewById(R.id.scoreForA);
        scoreView.setText(String.valueOf(pointsForA));
    }


    //adds 5 to "pointsForA" when the button is clicked.
    public void fivePointsForA(View v) {
        pointsForA += 5;
        displayForTeamA(pointsForA);
    }

    //adds 3 to "pointsForA" when the button is clicked.
    public void threePointsForA(View v) {
        pointsForA += 3;
        displayForTeamA(pointsForA);
    }

    //adds 2 to "pointsForA" when the button is clicked.
    public void twoPointsForA(View v) {
        pointsForA += 2;
        displayForTeamA(pointsForA);
    }


    //this method displays the value for score of team B.
    public void displayForTeamB(int pointsForB) {
        TextView scoreView = (TextView) findViewById(R.id.scoreForB);
        scoreView.setText(String.valueOf(pointsForB));
    }

    //adds 5 to "pointsForB" when the button is clicked.
    public void fivePointsForB(View v) {
        pointsForB += 5;
        displayForTeamB(pointsForB);
    }

    //adds 3 to "pointsForB" when the button is clicked.
    public void threePointsForB(View v) {
        pointsForB += 3;
        displayForTeamB(pointsForB);
    }

    //add 2 to "pointsForB" when the button is clicked.
    public void twoPointsForB(View v) {
        pointsForB += 2;
        displayForTeamB(pointsForB);
    }

    //resets the initial points back to 0
    public void resetScores(View v) {
        pointsForB = pointsForA = 0;
        displayForTeamB(pointsForB);
        displayForTeamA(pointsForA);
    }
}
