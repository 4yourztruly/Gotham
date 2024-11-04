package org.example.location.person;

import org.example.location.person.traits.Trait;

import java.util.ArrayList;

public class User extends Person {

    private final ArrayList<Trait>traits = new ArrayList<>();

    public User(String name, int age) {
        super(name, age);
    }

    public ArrayList<Trait> getTraits() {
        return traits;
    }
}
