package com.project.hikingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_popular;
    private ArrayList<PopulerModel> populerModels = new ArrayList<>();
    ListPopulerAdapter listPopulerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_popular = findViewById(R.id.rv_popular);

        rv_popular.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv_popular.setLayoutManager(layoutManager);
        rvPopuler();
    }

    private void rvPopuler(){
        populerModels.addAll(PopulerData.getListData());
        rv_popular.setLayoutManager((new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)));
        listPopulerAdapter = new ListPopulerAdapter(populerModels, this);
        rv_popular.setAdapter(listPopulerAdapter);
    }
}