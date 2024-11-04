package org.example.dependencies;

import org.example.commandManager.CommandManager;
import org.example.commandManager.CommandManagerList;
import org.example.menuManager.MenuManager;
import org.example.menuManager.MenuManagerList;

public class Dependencies {
    private final MenuManager menuManager;
    private final CommandManager commandManager;

    public Dependencies() {
        this.menuManager = new MenuManagerList();
        this.commandManager = new CommandManagerList();
    }

    public MenuManager getMenuManager() {
        return menuManager;
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }
}
