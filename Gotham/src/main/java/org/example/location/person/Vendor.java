package org.example.location.person;

import org.example.location.stores.items.Item;

import java.util.ArrayList;

public class Vendor extends Person{
    private ArrayList<Item>items = new ArrayList<Item>();

    public Vendor(String name, int age) {
        super(name, age);
    }
}
