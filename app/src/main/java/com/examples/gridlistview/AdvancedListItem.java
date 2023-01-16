package com.examples.gridlistview;

public class AdvancedListItem {
    String name, designation, location;

    public AdvancedListItem(String name, String designation, String location) {
        this.name = name;
        this.designation = designation;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
