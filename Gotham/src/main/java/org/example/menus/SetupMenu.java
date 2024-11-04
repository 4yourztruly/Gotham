package org.example.menus;

public class SetupMenu extends Menu{
    public SetupMenu(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Welcome to the dirty streets of Gotham what is your name kid?");
        String name = scanner.nextLine();
        System.out.println("Okay " + name + " and how old are you?");
        String age = scanner.nextLine();
        System.out.println("Alright time to show me your strengths and choose wisely");
        System.out.println("You have 25 point to spend on your traits and you will be able to level up your traits on your time on the streets");


    }
}
