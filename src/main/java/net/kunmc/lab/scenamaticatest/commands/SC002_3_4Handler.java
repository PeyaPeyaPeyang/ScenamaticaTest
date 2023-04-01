package net.kunmc.lab.scenamaticatest.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SC002_3_4Handler implements CommandExecutor
{
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {
        Player actor;
        if ((actor = Bukkit.getPlayer("Actor001")) == null)
            throw new IllegalStateException("Actor001 is not found.");

        actor.sendMessage("Hello, World!");
        return true;
    }
}
