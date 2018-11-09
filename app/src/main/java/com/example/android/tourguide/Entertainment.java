package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Entertainment extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(R.drawable.crayola_circle_entrance,
                "Crayola Experience",
                "30 Centre Square, Easton, PA 18042",
                "Roomy, crayon-centric warehouse with colorul kid-friendly activities, events, a cafe &amp; a store"));

        attractions.add(new Attraction(R.drawable.state_theater,
                "State Theater",
                "453 Northampton St, Easton, PA, 18042",
                "The State Theater is a 1,500-seat historic theater"));

        //The List view to display all the songs on the playlist
        ListView attractionListView = findViewById(R.id.list);
        //Creates a song adapter for all songs on playlist
        AttractionAdapter attractionsAdapter = new AttractionAdapter(this, attractions);
        //Sets the songsAdapter to the listView
        attractionListView.setAdapter(attractionsAdapter);
    }
}
