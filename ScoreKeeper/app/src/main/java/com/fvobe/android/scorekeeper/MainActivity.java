package com.fvobe.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String Play_1 = "Score 1";
    private static final String Play_2 = "Score 2";

    int firstPlayer, secondPlayer =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
           firstPlayer =  savedInstanceState.getInt(Play_1);
            secondPlayer = savedInstanceState.getInt(Play_2);

        }
        setContentView(R.layout.activity_main);
        displayPlayer1(firstPlayer);
        displayPlayer2(secondPlayer);
    }
    /**
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        displayPlayer1(savedInstanceState.getInt(Play_1));
        displayPlayer2(savedInstanceState.getInt(Play_1));
       // mTextView.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
    }

     Beginning of Player 1 instances
     *
     * Display the current score of Player 1
     */

    public void displayPlayer1 (int score){
        TextView Player1score = (TextView) findViewById(R.id.player1_score);
                Player1score.setText(String.valueOf(score));
    }

    /**
     *  Gold Button is clicked
     */

    public void plus91(View v) {
        firstPlayer += 9;
        displayPlayer1(firstPlayer);
    }

    /**
     *  Red Button is clicked
     */

    public void plus71(View v) {
        firstPlayer += 7;
        displayPlayer1(firstPlayer);
    }

    /**
     *  Blue Button is clicked
     */

    public void plus51(View v) {
        firstPlayer += 5;
        displayPlayer1(firstPlayer);
    }

    /**
     *  Black Button is clicked
     */

    public void plus31(View v) {
        firstPlayer += 3;
        displayPlayer1(firstPlayer);
    }

    /**
     *  White Button is clicked
     */

    public void plus11(View v) {
        firstPlayer += 1;
        displayPlayer1(firstPlayer);
    }

    // Player 1 Button Instances ends


    /** Beginning of Player 2 instances
     *
     * Display the current score of Player 2
     */

    public void displayPlayer2 (int score1){
        TextView Player2score = (TextView) findViewById(R.id.player2_score);
        Player2score.setText(String.valueOf(score1));
    }

    /**
     *  Gold Button is clicked
     */

    public void plus92(View v) {
        secondPlayer += 9;
        displayPlayer2(secondPlayer);
    }

    /**
     *  Red Button is clicked
     */

    public void plus72(View v) {
        secondPlayer += 7;
        displayPlayer2(secondPlayer);
    }

    /**
     *  Blue Button is clicked
     */

    public void plus52(View v) {
        secondPlayer += 5;
        displayPlayer2(secondPlayer);
    }

    /**
     *  Black Button is clicked
     */

    public void plus32(View v) {
        secondPlayer += 3;
        displayPlayer2(secondPlayer);
    }

    /**
     *  White Button is clicked
     */

    public void plus12(View v) {
        secondPlayer += 1;
        displayPlayer2(secondPlayer);
    }

    public void reset(View view){
        firstPlayer = 0;
        secondPlayer = 0;
        displayPlayer1(firstPlayer);
        displayPlayer2(secondPlayer);
    }

    // Player 2 Button Instances ends
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(Play_1, firstPlayer);
        outState.putInt(Play_2, secondPlayer);

        super.onSaveInstanceState(outState);
    }
}
