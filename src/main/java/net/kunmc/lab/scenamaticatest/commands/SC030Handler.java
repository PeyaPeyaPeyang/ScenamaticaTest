package net.kunmc.lab.scenamaticatest.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class SC030Handler implements CommandExecutor
{
    private final Plugin plugin;

    public SC030Handler(Plugin plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {
        this.plugin.getLogger().info("LogTest_1145141919810");

        return true;
    }
}
