package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Parks extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(R.drawable.bushkill_park_entrance,
                "Bushkill Park",
                "2100 Bushkill Park Dr, Easton, PA 18040",
                "A small amusement park, generally geared toward younger audiences"));

        attractions.add(new Attraction(R.drawable.scott_park,"Scott Park",
                "130 Larry Holmes Dr, Easton, PA 18042",
                "is home to an open-air amphitheatre with adequate viewing space for 400 patrons and additional room along the perimeter."));

        attractions.add(new Attraction(R.drawable.riverside_park, "Riverside Park", "Larry Holmes Dr, Easton, PA 18042",
                "Public recreation space along the Delaware River with a playground & a sheltered, open-air theater."));


        attractions.add(new Attraction(R.drawable.karl_stirner_trail,
                "Karl Stirner Arts Trail",
                "Karl Stirner Arts Trai, Easton PA 18042",
                "Take a stroll while viewing beautiful and inspiring artwork."));

        //The List view to display all the songs on the playlist
        ListView attractionListView = findViewById(R.id.list);
        //Creates a song adapter for all songs on playlist
        AttractionAdapter attractionsAdapter = new AttractionAdapter(this, attractions);
        //Sets the songsAdapter to the listView
        attractionListView.setAdapter(attractionsAdapter);

    }
}
