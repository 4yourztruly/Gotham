package org.example.location.stores;

import org.example.location.stores.items.Item;

import java.util.ArrayList;

public class Store {
    private String name;
    private StoreType storeType;
    private final ArrayList<Item>items = new ArrayList<>();
}
