package org.minecraft;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;
import org.bukkit.scheduler.BukkitTask;

public final class MskPlugin extends JavaPlugin {
    public static BukkitTask task;

    @Override
    public void onEnable() {
        Logger log = getLogger();
        // Plugin startup logic
        log.info("MSKPlugin plugin is enabled");
        // registering our commands
        this.getCommand("msktime").setExecutor(new CommandKit());
        if (task != null) task.cancel();
    }

    @Override
    public void onDisable() {
        Logger log = getLogger();
        // Plugin shutdown logic
        log.info("MSKPlugin plugin is disabled");
    }
}
