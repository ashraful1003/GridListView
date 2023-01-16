package com.examples.gridlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdvancedCustomAdapter extends BaseAdapter {
    ArrayList<AdvancedListItem> list;
    Context context;

    AdvancedCustomAdapter(Context context, ArrayList<AdvancedListItem> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.advanced_list_row, viewGroup, false);
        }

        TextView name, designation, location;
        name = view.findViewById(R.id.name);
        designation = view.findViewById(R.id.designation);
        location = view.findViewById(R.id.location);

        AdvancedListItem model = list.get(i);
        name.setText(model.getName());
        designation.setText(model.getDesignation());
        location.setText(model.getLocation());

        return view;
    }
}
