package me.thkim7527.sample

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

class Event: Listener {
    @EventHandler
    fun onBlockBreakEvent(e: BlockBreakEvent) {
        e.player.sendMessage("Break Block!")
    }
}