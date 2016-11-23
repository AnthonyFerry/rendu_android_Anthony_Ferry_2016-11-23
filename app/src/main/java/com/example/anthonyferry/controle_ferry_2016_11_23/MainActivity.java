package com.example.anthonyferry.controle_ferry_2016_11_23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<FicheAnimal> animals;

    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        animals.add(new FicheAnimal("test", "test", "test"));

        //this.initList();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, animals);


        recyclerView.setAdapter(adapter);

    }
/*
    private void initList()
    {
        FicheAnimal animal;

        for (int i = 0; i < 8; i++)
        {
            animal.setName("Animal" + i);
            animal.setSpicie("Spicie" + i);
            animal.setNote("Note" + i);

            animals.add(animal);
        }
    }
*/



}
