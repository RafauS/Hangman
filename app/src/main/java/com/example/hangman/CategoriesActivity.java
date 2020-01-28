package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    private DatabaseHelper dbHelper;
    CategoryAdapter categoryAdapter;
    private Button sport, film, animal;
    String textFromButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        initRecycleView();
    }


    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        textFromButton = b.getText().toString();
        Intent intent = new Intent(CategoriesActivity.this, MainActivity.class);
        intent.putExtra("CATEGORY",textFromButton);
        startActivity(intent);
    }

    public void initRecycleView(){

         int[] images = {R.drawable.sport,R.drawable.family, R.drawable.animal,R.drawable.food,R.drawable.school};////////////////////////
         final String[] names = getResources().getStringArray(R.array.categories);

        recyclerView = (RecyclerView) findViewById(R.id.category_recycleView);
        categoryAdapter = new CategoryAdapter(this,images,names);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(categoryAdapter);


        categoryAdapter.setOnItemClickListener(new CategoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                textFromButton = names[position];
                Intent intent = new Intent(CategoriesActivity.this, MainActivity.class);
                intent.putExtra("CATEGORY",textFromButton);
                startActivity(intent);
            }
        });
    }
}
