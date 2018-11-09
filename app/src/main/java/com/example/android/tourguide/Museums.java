package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> attractions  = new ArrayList<>();

        attractions.add(new Attraction(R.drawable.sigal_museum,
                "Sigal Museum",
                "342 Northampton St., Easton, PA 18045",
                "Resource for artifacts from pre-European settlers, decorative arts, textiles, tools & furniture."));

        attractions.add(new Attraction(R.drawable.national_canal_museum,
                "National Canal Museum",
                "2750 Hugh Moore Park Rd, Easton, PA 18042",
                "The National Canal Museum is the Signature Program of the Delaware & Lehigh National Heritage Corridor"));

        attractions.add(new Attraction(R.drawable.thomas_rinek_mansion,
                "Thomas Rinek Mansion",
                "32 and 36 N. Third Street, Easton PA 18042",
                "Historic landmark"));

        attractions.add(new Attraction(R.drawable.hugh_moore_park,
                "Hugh Moore Park & Museum",
                "2750 Hugh Moore Park Rd, Easton PA 18042",
                "Scenic waterway featuring historic boat tours, a canal museum with hands-on exhibits & a trail."));

        //The List view to display all the songs on the playlist
        ListView attractionListView = findViewById(R.id.list);
        //Creates a song adapter for all songs on playlist
        AttractionAdapter attractionsAdapter = new AttractionAdapter(this, attractions);
        //Sets the songsAdapter to the listView
        attractionListView.setAdapter(attractionsAdapter);

    }


}
