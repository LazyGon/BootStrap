package com.github.okocraft.name;

import org.bukkit.plugin.java.JavaPlugin;

public class PL extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(getName() + " have been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info(getName() + " have been disabled!");
    }
}
