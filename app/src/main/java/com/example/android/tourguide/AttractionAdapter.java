package com.example.android.tourguide;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.Attraction;
import com.example.android.tourguide.R;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction>{

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View attractionListItemView = convertView;
        if (attractionListItemView == null) {
            attractionListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        final Attraction currentAttraction = getItem(position);

        // Find the TextView in the artist_list_item.xml layout with the artist text view
        final ImageView locationImageView = attractionListItemView.findViewById(R.id.location_img);
        //Set the image to the locationImageView
        locationImageView.setImageResource(currentAttraction.getmLocationImg());

        //Find the TextView in the list_item.xml layout with the location TextView
        TextView locationNameTextView = attractionListItemView.findViewById(R.id.location_name);
        //Set the image to the location name TextView
        locationNameTextView.setText(currentAttraction.getmLocationName());

        TextView locationDescTextView = attractionListItemView.findViewById(R.id.location_desc);
        //Set the image to the location description TextView
        locationDescTextView.setText(currentAttraction.getmLocationDesc());

        TextView locationAddressTextView = attractionListItemView.findViewById(R.id.location_address);
        //Set the image to the location address TextView
        locationAddressTextView.setText(currentAttraction.getmLocationAddress());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return attractionListItemView;
    }
}
