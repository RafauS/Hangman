package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttA, buttB, buttC, buttD, buttE, buttF, buttG, buttH, buttI, buttJ, buttK, buttL, buttM, buttN, buttO, buttP, buttQ, buttR, buttS, buttT, buttU, buttV, buttW, buttX, buttY, buttZ;
    private TextView wordTextId;

    final private String word = "KETCHUP";
    private int lengthWord = word.length();

    private StringBuilder resultString = new StringBuilder();

    final private int maxAttempts = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializationButtons();
        setButtonsOnClick();
        setUnderscores();
        setTextViewInApp();
    }

    private void initializationButtons(){
        buttA = (Button) findViewById(R.id.ButtA);
        buttB = (Button) findViewById(R.id.ButtB);
        buttC = (Button) findViewById(R.id.ButtC);
        buttD = (Button) findViewById(R.id.ButtD);
        buttE = (Button) findViewById(R.id.ButtE);
        buttF = (Button) findViewById(R.id.ButtF);
        buttG = (Button) findViewById(R.id.ButtG);
        buttH = (Button) findViewById(R.id.ButtH);
        buttI = (Button) findViewById(R.id.ButtI);
        buttJ = (Button) findViewById(R.id.ButtJ);
        buttK = (Button) findViewById(R.id.ButtK);
        buttL = (Button) findViewById(R.id.ButtL);
        buttM = (Button) findViewById(R.id.ButtM);
        buttN = (Button) findViewById(R.id.ButtN);
        buttO = (Button) findViewById(R.id.ButtO);
        buttP = (Button) findViewById(R.id.ButtP);
        buttQ = (Button) findViewById(R.id.ButtQ);
        buttR = (Button) findViewById(R.id.ButtR);
        buttS = (Button) findViewById(R.id.ButtS);
        buttT = (Button) findViewById(R.id.ButtT);
        buttU = (Button) findViewById(R.id.ButtU);
        buttV = (Button) findViewById(R.id.ButtV);
        buttW = (Button) findViewById(R.id.ButtW);
        buttX = (Button) findViewById(R.id.ButtX);
        buttY = (Button) findViewById(R.id.ButtY);
        buttZ = (Button) findViewById(R.id.ButtZ);
    }

    private void setButtonsOnClick(){
        buttA.setOnClickListener(this);
        buttB.setOnClickListener(this);
        buttC.setOnClickListener(this);
        buttD.setOnClickListener(this);
        buttE.setOnClickListener(this);
        buttF.setOnClickListener(this);
        buttG.setOnClickListener(this);
        buttH.setOnClickListener(this);
        buttI.setOnClickListener(this);
        buttJ.setOnClickListener(this);
        buttK.setOnClickListener(this);
        buttL.setOnClickListener(this);
        buttM.setOnClickListener(this);
        buttN.setOnClickListener(this);
        buttO.setOnClickListener(this);
        buttP.setOnClickListener(this);
        buttQ.setOnClickListener(this);
        buttR.setOnClickListener(this);
        buttS.setOnClickListener(this);
        buttT.setOnClickListener(this);
        buttU.setOnClickListener(this);
        buttV.setOnClickListener(this);
        buttW.setOnClickListener(this);
        buttX.setOnClickListener(this);
        buttY.setOnClickListener(this);
        buttZ.setOnClickListener(this);
    }

    private void setUnderscores(){
        wordTextId = (TextView) findViewById(R.id.wordText);
        StringBuilder underscores = new StringBuilder();

        for(int i = 0;i<lengthWord;i++){
            underscores.append("_");
        }

        wordTextId.setText(underscores.toString());
        resultString.append(underscores.toString());
    }

    @Override
    public void onClick(View v) {

        Button alphabetButtons = (Button)v;

        String letter = (String)alphabetButtons.getText();

        if(checkIncludeLetterAndReplaceInsteadOfUnderscore(letter)) switchPropertiesButtonAfterGoodChoice(alphabetButtons);
        else switchPropertiesButtonAfterWrongChoice(alphabetButtons);


    }

    private boolean checkIncludeLetterAndReplaceInsteadOfUnderscore(String letter){
        String letterFromWord;
        boolean result = false;

        char charLetter = letter.charAt(0);

        for(int i=0;i<lengthWord;i++){
            letterFromWord = Character.toString(word.charAt(i));
            if(letterFromWord.equals(letter)){
                resultString.setCharAt(i,charLetter);
                result = true;
            }
        }
        return result;
    }

    private void setTextViewInApp(){
        wordTextId = (TextView) findViewById(R.id.wordText);
        StringBuilder resultWithSpace = new StringBuilder();
        for(int i = 0;i<lengthWord;i++){
            resultWithSpace.append(resultString.charAt(i)).append(" ");
        }

        wordTextId.setText(resultWithSpace);
    }

    private void switchPropertiesButtonAfterWrongChoice(Button b){
        b.setEnabled(false);
        b.setTextColor(Color.parseColor("#FF0000"));
    }

    private void switchPropertiesButtonAfterGoodChoice(Button b){
        b.setEnabled(false);
        b.setTextColor(Color.parseColor("#00FF00"));
        setTextViewInApp();
    }

}
