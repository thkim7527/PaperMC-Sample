package me.thkim7527.sample

import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

class Event: Listener {
    fun onBlockBreakEvent(e: BlockBreakEvent) {
        e.player.sendMessage("Break Blcok!")
    }
}