package net.kunmc.lab.scenamaticatest.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class SC011Handler implements Listener
{
    @EventHandler
    public void onDeath(PlayerDeathEvent e)
    {
        e.setDeathMessage("You died!");

        Player p = e.getEntity();

        p.sendMessage("The player died!");

    }
}
