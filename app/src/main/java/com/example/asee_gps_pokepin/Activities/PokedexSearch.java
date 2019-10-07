package com.example.asee_gps_pokepin.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asee_gps_pokepin.R;
import com.example.asee_gps_pokepin.pokedexSearch.MyAdapter;

import java.util.ArrayList;

public class PokedexSearch extends AppCompatActivity {
    //TODO Añadir codigo Recycler
    //TODO Crear clase pokemon

    private RecyclerView recyclerView;
    private ArrayList<Pokemon> listPokemon;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.myRecycler);

    }
}
