package com.geektech.characters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList <String> characters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadDate();
        recyclerView = findViewById(R.id.recycler_view);
        CharacterAdapter adapter = new CharacterAdapter(characters);
        recyclerView.setAdapter(adapter);
    }

    private  void loadDate(){

        characters=new ArrayList<>();
        characters.add("Шрек");
        characters.add("Фиона");
        characters.add("Осел");
        characters.add("Кот в сапогах");
        characters.add("Шкипер");
        characters.add("Морис");
        characters.add("Морт");
        characters.add("Мото-Мото");
        characters.add("Джулиан");
        characters.add("Мелман");
        characters.add("Алекс");
        characters.add("Марти");
        characters.add("Глория");
        characters.add("Кавальски");
        characters.add("Рико");
        characters.add("Прапор");
        characters.add("Марлен");
    }
}