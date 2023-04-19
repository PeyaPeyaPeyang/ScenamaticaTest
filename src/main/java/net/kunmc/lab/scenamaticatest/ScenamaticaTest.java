package net.kunmc.lab.scenamaticatest;

import net.kunmc.lab.scenamaticatest.commands.SC002_3_4Handler;
import net.kunmc.lab.scenamaticatest.commands.SC030Handler;
import net.kunmc.lab.scenamaticatest.events.SC011Handler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ScenamaticaTest extends JavaPlugin {

    @Override
    @SuppressWarnings("ConstantConditions")
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginCommand("sc002_3_4").setExecutor(new SC002_3_4Handler());
        Bukkit.getPluginCommand("sc030").setExecutor(new SC030Handler(this));

        Bukkit.getPluginManager().registerEvents(new SC011Handler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
