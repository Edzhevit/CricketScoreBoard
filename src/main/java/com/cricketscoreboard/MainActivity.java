package com.cricketscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Display the Score for Team A

    public void displayScoreForTeamA(int score){
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(score);
    }

    public void onerun(View view) {
        scoreTeamA += 1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void tworun(View view) {
        scoreTeamA += 2;
        displayScoreForTeamA(scoreTeamA);
    }

    public void threerun(View view) {
        scoreTeamA += 3;
        displayScoreForTeamA(scoreTeamA);
    }

    public void fourrun(View view) {
        scoreTeamA += 4;
        displayScoreForTeamA(scoreTeamA);
    }

    public void sixrun(View view) {
        scoreTeamA += 6;
        displayScoreForTeamA(scoreTeamA);
    }

    // Display the Score for Team B

    public void displayScoreForTeamB(int score){
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(score);
    }

    public void onerunb(View view) {
        scoreTeamB += 1;
        displayScoreForTeamB(scoreTeamB);
    }

    public void tworunb(View view) {
        scoreTeamB += 2;
        displayScoreForTeamB(scoreTeamB);
    }

    public void threerunb(View view) {
        scoreTeamB += 3;
        displayScoreForTeamB(scoreTeamB);
    }

    public void fourrunb(View view) {
        scoreTeamB += 4;
        displayScoreForTeamB(scoreTeamB);
    }

    public void sixrunb(View view) {
        scoreTeamB += 6;
        displayScoreForTeamB(scoreTeamB);
    }

    // Resetting the score

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreForTeamA(0);
        displayScoreForTeamB(0);
    }
}
