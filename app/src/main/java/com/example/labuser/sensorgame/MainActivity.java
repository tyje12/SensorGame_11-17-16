package com.example.labuser.sensorgame;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private Button startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startGame = (Button) findViewById(R.id.startGame);

    }
//        startGame.setOnClickListener((new View.OnClickListener() {
    public void startGame(View v) {
        String[] action;
        action = new String[3];
        action[0] = "UP";
        action[1] = "LEFT";
        action[2] = "RIGHT";

        //got this timer code from android studio development help
        new CountDownTimer(30000, 1000) {
            TextView timer = (TextView) findViewById(R.id.mTextField);

            public void onTick(long millisUntilFinished) {
                timer.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                timer.setText("done!");
            }
        }.start();
        //end of timer code

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                //display string[0]
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText(action[0]);
                //move phone up


                //add score if right and display new string

                //display new string if wrong


            } else if (i == 1) {
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText(action[1]);
                //move phone left


                //add score if right and display new string

                //display new string if wrong
            } else if (i == 2) {
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText(action[2]);
                //move phone right


                //add score if right and display new string

                //display new string if wrong
            }


        }

    }
}


