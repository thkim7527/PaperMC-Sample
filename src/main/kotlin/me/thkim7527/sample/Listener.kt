package me.thkim7527.sample

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

class Listener: Listener {
    @EventHandler
    fun onPlayerMoveEvent(e: PlayerMoveEvent) {
        e.player.sendMessage("Player Move!")
    }
}