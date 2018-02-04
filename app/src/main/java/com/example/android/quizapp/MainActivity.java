package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText q3EditTextA;

    //      updates progressbar
    int progressBarValue = 0;

    //      questions logic number that are used to calculate progress bar values
    int q1LogicNumber = 0;
    int q2LogicNumber = 0;
    int q3LogicNumber = 0;
    int q4LogicNumber = 0;
    int q5LogicNumber = 0;
    int q6LogicNumber = 0;
    int q7LogicNumber = 0;
    int q8LogicNumber = 0;
    int q9LogicNumber = 0;
    int q10LogicNumber = 0;

    //      question 1 boolean variables
    boolean q1A2;
    boolean q1A3;
    //    right answers
    boolean q1A1;
    boolean q1A4;
    //      question 2 boolean variables
    boolean q2A2;
    boolean q2A3;
    boolean q2A4;
    //    right answers
    boolean q2A1;
    //      question 3 int variable
    int q3A = 0;
    //      question 4 boolean variables
    boolean q4A1;
    boolean q4A3;
    boolean q4A4;
    //    right answers
    boolean q4A2;
    //    question 5 boolean variables
    boolean q5A1;
    boolean q5A2;
    boolean q5A4;
    //    right answers
    boolean q5A3;
    //    question 6 boolean variables
    boolean q6A1;
    boolean q6A3;
    boolean q6A4;
    //    right answers
    boolean q6A2;
    //     question 7 boolean variables
    boolean q7A1;
    boolean q7A2;
    //    right answers
    boolean q7A4;
    boolean q7A3;
    //     question 8 boolean variables
//    right answers
    boolean q8A1;
    boolean q8A2;
    boolean q8A4;
    boolean q8A3;
    //    question 9 boolean variables
    boolean q9A1;
    boolean q9A2;
    boolean q9A4;
    //    right answers
    boolean q9A3;
    //    question 10 boolean variables
    boolean q10A2;
    boolean q10A3;
    boolean q10A4;
    //    right answers
    boolean q10A1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q3EditTextA = findViewById(R.id.question3_users_answer);
        q3EditTextA.addTextChangedListener(q3EditWatcher);
        int score = 0;
        TextView scoreTextView = findViewById(R.id.display_score);
        String printScore = getString(R.string.questions_answered, score);
        scoreTextView.setText(printScore);

    }

//      question 1 onClick methods
    public void q1C1 (View view) {
        CheckBox q1C1 = findViewById(R.id.question1_checkbox1);
        q1A1 = q1C1.isChecked();
        question1();
    }
    public void q1C2 (View view) {
        CheckBox q1C2 = findViewById(R.id.question1_checkbox2);
        q1A2 = q1C2.isChecked();
        question1();
    }
    public void q1C3 (View view) {
        CheckBox q1C3 = findViewById(R.id.question1_checkbox3);
        q1A3 = q1C3.isChecked();
        question1();
    }
    public void q1C4 (View view) {
        CheckBox q1C4 = findViewById(R.id.question1_checkbox4);
        q1A4 = q1C4.isChecked();
        question1();
    }
//      question 2 onClick methods
    public void q2R1 (View view) {
        RadioButton q2R1 = findViewById(R.id.question2_radio1);
        q2A1 = q2R1.isChecked();
        question2();
    }
    public void q2R2 (View view) {
        RadioButton q2R2 = findViewById(R.id.question2_radio2);
        q2A2 = q2R2.isChecked();
        question2();
    }
    public void q2R3 (View view) {
        RadioButton q2R3 = findViewById(R.id.question2_radio3);
        q2A3 = q2R3.isChecked();
        question2();
    }
    public void q2R4 (View view) {
        RadioButton q2R4 = findViewById(R.id.question2_radio4);
        q2A4 = q2R4.isChecked();
        question2();
    }
//    question 3 textWatcher and progress bar logic
private final TextWatcher q3EditWatcher = new TextWatcher() {
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (q3LogicNumber == 0) {
            q3LogicNumber += 1;
            if (q3LogicNumber == 1) {
                progressBarIncrease();
            }
        }
    }

    public void afterTextChanged(Editable s) {
        if (s.length() == 0) {
            progressBarDecrease();
            q3LogicNumber = 0;
        }
    }
};
//    question 4 onClick methods
    public void q4R1 (View view){
        RadioButton q4R1 = findViewById(R.id.question4_radio1);
        q4A1 = q4R1.isChecked();
        question4();
    }
    public void q4R2 (View view){
        RadioButton q4R2 = findViewById(R.id.question4_radio2);
        q4A2 = q4R2.isChecked();
        question4();
    }
    public void q4R3 (View view){
        RadioButton q4R3 = findViewById(R.id.question4_radio3);
        q4A3 = q4R3.isChecked();
        question4();
    }
    public void q4R4 (View view){
        RadioButton q4R4 = findViewById(R.id.question4_radio4);
        q4A4 = q4R4.isChecked();
        question4();
    }
//    question 5 onClick methods
    public void q5R1 (View view){
        RadioButton q5R1 = findViewById(R.id.question5_radio1);
        q5A1 = q5R1.isChecked();
        question5();
    }
    public void q5R2 (View view){
        RadioButton q5R2 = findViewById(R.id.question5_radio2);
        q5A2 = q5R2.isChecked();
        question5();
    }
    public void q5R3 (View view){
        RadioButton q5R3 = findViewById(R.id.question5_radio3);
        q5A3 = q5R3.isChecked();
        question5();
    }
    public void q5R4 (View view){
    RadioButton q5R4 = findViewById(R.id.question5_radio4);
    q5A4 = q5R4.isChecked();
        question5();
    }
    //    question 6 onClick methods
    public void q6R1 (View view){
        RadioButton q6R1 = findViewById(R.id.question6_radio1);
        q6A1 = q6R1.isChecked();
        question6();
    }
    public void q6R2 (View view){
        RadioButton q6R2 = findViewById(R.id.question6_radio2);
        q6A2 = q6R2.isChecked();
        question6();
    }
    public void q6R3 (View view){
        RadioButton q6R3 = findViewById(R.id.question6_radio3);
        q6A3 = q6R3.isChecked();
        question6();
    }
    public void q6R4 (View view){
        RadioButton q6R4 = findViewById(R.id.question6_radio4);
        q6A4 = q6R4.isChecked();
        question6();
    }
    //    question 7 onClick methods
    public void q7C1 (View view){
        CheckBox q7C1 = findViewById(R.id.question7_checkbox1);
        q7A1 = q7C1.isChecked();
        question7();
    }
    public void q7C2 (View view){
        CheckBox q7C2 = findViewById(R.id.question7_checkbox2);
        q7A2 = q7C2.isChecked();
        question7();
    }
    public void q7C3 (View view){
        CheckBox q7C3 = findViewById(R.id.question7_checkbox3);
        q7A3 = q7C3.isChecked();
        question7();
    }
    public void q7C4 (View view){
        CheckBox q7C4 = findViewById(R.id.question7_checkbox4);
        q7A4 = q7C4.isChecked();
        question7();
    }
    //    question 8 onClick methods
    public void q8C1 (View view){
        CheckBox q8C1 = findViewById(R.id.question8_checkbox1);
        q8A1 = q8C1.isChecked();
        question8();
    }
    public void q8C2 (View view){
        CheckBox q8C2 = findViewById(R.id.question8_checkbox2);
        q8A2 = q8C2.isChecked();
        question8();
    }
    public void q8C3 (View view){
        CheckBox q8C3 = findViewById(R.id.question8_checkbox3);
        q8A3 = q8C3.isChecked();
        question8();
    }
    public void q8C4 (View view){
        CheckBox q8C4 = findViewById(R.id.question8_checkbox4);
        q8A4 = q8C4.isChecked();
        question8();
    }
    //    question 9 onClick methods
    public void q9R1 (View view){
        RadioButton q9R1 = findViewById(R.id.question9_radio1);
        q9A1 = q9R1.isChecked();
        question9();
    }
    public void q9R2 (View view){
        RadioButton q9R2 = findViewById(R.id.question9_radio2);
        q9A2 = q9R2.isChecked();
        question9();
    }
    public void q9R3 (View view){
        RadioButton q9R3 = findViewById(R.id.question9_radio3);
        q9A3 = q9R3.isChecked();
        question9();
    }
    public void q9R4 (View view){
        RadioButton q9R4 = findViewById(R.id.question9_radio4);
        q9A4 = q9R4.isChecked();
        question9();
    }
    //    question 10 onClick methods
    public void q10R1 (View view){
        RadioButton q10R1 = findViewById(R.id.question10_radio1);
        q10A1 = q10R1.isChecked();
        question10();
    }
    public void q10R2 (View view){
        RadioButton q10R2 = findViewById(R.id.question10_radio2);
        q10A2 = q10R2.isChecked();
        question10();
    }
    public void q10R3 (View view){
        RadioButton q10R3 = findViewById(R.id.question10_radio3);
        q10A3 = q10R3.isChecked();
        question10();
    }
    public void q10R4 (View view){
        RadioButton q10R4 = findViewById(R.id.question10_radio4);
        q10A4 = q10R4.isChecked();
        question10();
    }

//    these methods checks if at least one option in answer is checked and updates progress bar
    public void question1 () {
        if (q1A1 | q1A2 | q1A3 | q1A4) {
            if (q1LogicNumber == 0){
                q1LogicNumber += 1;
                if (q1LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        } else {
            progressBarDecrease();
            q1LogicNumber = 0;
        }
    }
    public void question2 () {
        if (q2A1 | q2A2 | q2A3 | q2A4) {
            if (q2LogicNumber == 0) {
                q2LogicNumber += 1;
                if (q2LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q2LogicNumber = 0;
        }
    }
    public void question4 () {
        if (q4A1 | q4A2 | q4A3 | q4A4) {
            if (q4LogicNumber == 0) {
                q4LogicNumber += 1;
                if (q4LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q4LogicNumber = 0;
        }
    }
    public void question5 () {
        if (q5A1 | q5A2 | q5A3 | q5A4) {
            if (q5LogicNumber == 0) {
                q5LogicNumber += 1;
                if (q5LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q5LogicNumber = 0;
        }
    }
    public void question6 () {
        if (q6A1 | q6A2 | q6A3 | q6A4) {
            if (q6LogicNumber == 0) {
                q6LogicNumber += 1;
                if (q6LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q6LogicNumber = 0;
        }
    }
    public void question7 () {
        if (q7A1 | q7A2 | q7A3 | q7A4) {
            if (q7LogicNumber == 0) {
                q7LogicNumber += 1;
                if (q7LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q7LogicNumber = 0;
        }
    }
    public void question8 () {
        if (q8A1 | q8A2 | q8A3 | q8A4) {
            if (q8LogicNumber == 0) {
                q8LogicNumber += 1;
                if (q8LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q8LogicNumber = 0;
        }
    }
    public void question9 () {
        if (q9A1 | q9A2 | q9A3 | q9A4) {
            if (q9LogicNumber == 0) {
                q9LogicNumber += 1;
                if (q9LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q9LogicNumber = 0;
        }
    }
    public void question10 () {
        if (q10A1 | q10A2 | q10A3 | q10A4) {
            if (q10LogicNumber == 0) {
                q10LogicNumber += 1;
                if (q10LogicNumber == 1) {
                    progressBarIncrease();
                }
            }
        }else {
            progressBarDecrease();
            q10LogicNumber = 0;
        }
    }
//    increases progress in progress bar
    public void progressBarIncrease () {
        ProgressBar pb = findViewById(R.id.progress_bar);
        progressBarValue += 10;
        pb.setProgress(progressBarValue);
    }
//    decreases progress in progress bar
    public void progressBarDecrease () {
        progressBarValue -= 10;
        ProgressBar pb = findViewById(R.id.progress_bar);
        pb.setProgress(progressBarValue);
    }

    //Evaluation button
    public void evaluateQuiz(View view) {
        EditText q3EditTextA = findViewById(R.id.question3_users_answer);
//        checks if user entered valid input
        try {
            q3A = Integer.parseInt(q3EditTextA.getText().toString());
        } catch(NumberFormatException nfe) {

        }
//      calculate score of the quiz
        int score = evaluateScore();
    /**
     * show score of the quiz as a toast and TextView.
     * Updates progress bar proportionally to number of correct
     * answers.
     * Second progress bars shows how many wrong answers has user made.
     */
        TextView scoreTextView = findViewById(R.id.display_score);
        String printScore = scoreMessage(score);
        scoreTextView.setText(printScore);
        ProgressBar pb = findViewById(R.id.progress_bar);
        progressBarValue = score * 10;
        pb.setProgress(progressBarValue);
        pb.setSecondaryProgress(100);
        Toast.makeText(this, getString(R.string.evaluation_toast,score) , Toast.LENGTH_SHORT).show();
    }
//    this method is used to calculate score
    private int evaluateScore() {
        int score = 0;
        if (q1A1 & q1A4) {
            score += 1;
        }
        if (q2A1){
            score += 1;
        }
        if (q3A == 47) {
            score += 1;
        }
        if (q4A2) {
            score += 1;
        }
        if (q5A3) {
            score += 1;
        }
        if (q6A2) {
            score += 1;
        }
        if (q7A3 & q7A4) {
            score += 1;
        }
        if (q8A1 & q8A2 & q8A3 & q8A4) {
            score += 1;
        }
        if (q9A3) {
            score += 1;
        }
        if (q10A1) {
            score += 1;
        }
        return score;
    }
//    compose score message
    private String scoreMessage(int score){
        return getString(R.string.questions_answered, score);
    }
}

