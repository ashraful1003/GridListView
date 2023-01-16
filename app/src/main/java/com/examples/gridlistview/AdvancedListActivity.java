package com.examples.gridlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AdvancedListActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<AdvancedListItem> arrayList = new ArrayList<>();
    AdvancedCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_list);

        listView = findViewById(R.id.advanced_list);
        BindData();
    }

    private void BindData() {
        arrayList.add(new AdvancedListItem("Ashraful", "Developer", "Pabna"));
        arrayList.add(new AdvancedListItem("Alam", "Writer", "Pabna"));
        arrayList.add(new AdvancedListItem("Sirajam", "Teacher", "Dhaka"));
        arrayList.add(new AdvancedListItem("Munira", "Reader", "Dhaka"));
        arrayList.add(new AdvancedListItem("Niloy", "Cadre", "Noakhali"));
        arrayList.add(new AdvancedListItem("Paul", "Govt. Jav", "Noakhali"));
        arrayList.add(new AdvancedListItem("Ashraful", "Developer", "Pabna"));
        arrayList.add(new AdvancedListItem("Alam", "Writer", "Pabna"));
        arrayList.add(new AdvancedListItem("Sirajam", "Teacher", "Dhaka"));
        arrayList.add(new AdvancedListItem("Munira", "Reader", "Dhaka"));
        arrayList.add(new AdvancedListItem("Niloy", "Cadre", "Noakhali"));
        arrayList.add(new AdvancedListItem("Paul", "Govt. Jav", "Noakhali"));

        adapter = new AdvancedCustomAdapter(getApplicationContext(), arrayList);
        listView.setAdapter(adapter);
    }
}