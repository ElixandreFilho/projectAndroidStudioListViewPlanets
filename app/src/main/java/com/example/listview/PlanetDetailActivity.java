package com.example.listview;

// PlanetDetailActivity.java
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;


public class PlanetDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);

        TextView textViewPlanetName = findViewById(R.id.textViewPlanetName);
        TextView textViewPlanetInfo = findViewById(R.id.textViewPlanetInfo);

        if (getIntent().hasExtra("name") && getIntent().hasExtra("info")) {
            String name = getIntent().getStringExtra("name");
            String info = getIntent().getStringExtra("info");

            textViewPlanetName.setText(name);
            textViewPlanetInfo.setText(info);
        } else {
            Toast.makeText(this, "Informações do planeta não encontrados", Toast.LENGTH_SHORT).show();
        }

    }
}
