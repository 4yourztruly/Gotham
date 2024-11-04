package org.example.menuManager;

import org.example.menus.Menu;

import java.util.ArrayList;

public class MenuManagerList implements MenuManager{
    private final ArrayList<Menu>menus = new ArrayList<Menu>();
    @Override
    public void addMenu(Menu menu) {
        menus.add(menu);

    }

    @Override
    public ArrayList<Menu> getMenus() {
        return menus;
    }

    @Override
    public void getMenu(String name) {

    }
}
