package com.examples.gridlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class GridFullImageActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_full_image);

        imageView = findViewById(R.id.image_view);

        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");
        GridImageAdapter imageAdapter = new GridImageAdapter(this);
        imageView.setImageResource(imageAdapter.thumbImages[position]);
    }
}