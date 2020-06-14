package com.fexful.niyazittosrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Button> buttonCourses = new ArrayList<Button>();
        buttonCourses.add((Button) findViewById(R.id.buttonFirstCourse));
        buttonCourses.add((Button) findViewById(R.id.buttonSecondCourse));
        buttonCourses.add((Button) findViewById(R.id.buttonDesserts));
        buttonCourses.add((Button) findViewById(R.id.buttonCocktails));

        for (int i = 0; i < buttonCourses.size(); i++)
            buttonClick(buttonCourses.get(i), i);
    }

    //Эта функция вызывается, когда пользователь нажимает на одну из кнопок на главной активити
    void buttonClick(final Button button, final int i){
        button.setOnClickListener(new View.OnClickListener() {
            Intent intent;
            @Override
            public void onClick(View v) {
                switch (i) {
                    case 0:
                        intent = new Intent(MainActivity.this, FirstCourseActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, SecondCourseActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}