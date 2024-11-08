package org.example.location.person.traits;

public class Trait {
    private final String name;
    private int level;

    public Trait(String name) {
        this.name = name;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
