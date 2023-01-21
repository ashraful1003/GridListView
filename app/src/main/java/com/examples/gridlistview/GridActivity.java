package com.examples.gridlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = findViewById(R.id.grid_view);
        /// set the grid image adapter to connect activity with adapter.
        gridView.setAdapter(new GridImageAdapter(GridActivity.this));

        /// image click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /// going to another activity to see the clicked image with full size
                Intent intent = new Intent(GridActivity.this, GridFullImageActivity.class);
                intent.putExtra("id", i);
                startActivity(intent);
            }
        });
    }
}