package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import android.graphics.Color;


public class PlanetAdapter extends ArrayAdapter<Planet> {

    public PlanetAdapter(Context context, List<Planet> planets) {
        super(context, 0, planets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Planet planet = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }
        TextView textView = convertView.findViewById(android.R.id.text1);
        textView.setText(planet.getName());
        textView.setTextColor(Color.WHITE);
        return convertView;
    }

}