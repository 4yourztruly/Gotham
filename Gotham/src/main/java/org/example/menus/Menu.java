package org.example.menus;

import java.util.Scanner;

public abstract class Menu {
    private final String name;
    protected Scanner scanner = new Scanner(System.in);

    public Menu(String name) {
        this.name = name;
    }
    abstract void display();

    public String getName() {
        return name;
    }

}
