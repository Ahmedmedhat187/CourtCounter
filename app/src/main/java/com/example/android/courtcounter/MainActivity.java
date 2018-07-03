package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView team_a_score , team_b_score;
    Button btn_a_3 , btn_a_2 , btn_a_1 , btn_b_3 , btn_b_2 , btn_b_1 , btn_reset;
    int scoreTeamA = 0 , scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btn_a_1:
                scoreTeamA ++;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.btn_a_2:
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.btn_a_3:
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.btn_b_1:
                scoreTeamB ++;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.btn_b_2:
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.btn_b_3:
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.btn_reset:
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                break;
        }
    }


    public void displayForTeamA(int score) {
        team_a_score.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        team_b_score.setText(String.valueOf(score));
    }

    public void initViews() {
        team_a_score = (TextView)findViewById(R.id.team_a_score);
        team_b_score = (TextView)findViewById(R.id.team_b_score);

        btn_a_1 = (Button)findViewById(R.id.btn_a_1);
        btn_a_2 = (Button)findViewById(R.id.btn_a_2);
        btn_a_3 = (Button)findViewById(R.id.btn_a_3);
        btn_b_1 = (Button)findViewById(R.id.btn_b_1);
        btn_b_2 = (Button)findViewById(R.id.btn_b_2);
        btn_b_3 = (Button)findViewById(R.id.btn_b_3);
        btn_reset = (Button)findViewById(R.id.btn_reset);

        btn_a_1.setOnClickListener(this);
        btn_a_2.setOnClickListener(this);
        btn_a_3.setOnClickListener(this);
        btn_b_1.setOnClickListener(this);
        btn_b_2.setOnClickListener(this);
        btn_b_3.setOnClickListener(this);
        btn_reset.setOnClickListener(this);
    }



}
