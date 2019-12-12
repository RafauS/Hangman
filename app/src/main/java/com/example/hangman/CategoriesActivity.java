package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sport, film, animal;
    String textFromButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        initButtonsAndOnClicks();
    }

    private void initButtonsAndOnClicks(){
        sport = (Button) findViewById(R.id.sportCategory);
        film = (Button) findViewById(R.id.filmCategory);
        animal = (Button) findViewById(R.id.animalCategory);

        sport.setOnClickListener(this);
        film.setOnClickListener(this);
        animal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        textFromButton = b.getText().toString();
        Intent intent = new Intent(CategoriesActivity.this, MainActivity.class);
        intent.putExtra("CATEGORY",textFromButton);
        startActivity(intent);
    }
}
