package com.examples.gridlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] users = {"Ashraful", "Alam", "Sirajam", "Munira", "Niloy", "Paul"};

    /// for advanced listview
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// if you want to show the grid view then just remove the comment from the
        // the below line.
        startActivity(new Intent(MainActivity.this, GridActivity.class));

        listView = findViewById(R.id.list_view);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        listView.setAdapter(arrayAdapter);

        /// for advanced listview
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AdvancedListActivity.class));
            }
        });
    }
}