package me.thkim7527.sample

import com.sk89q.worldedit.bukkit.WorldEditPlugin
import org.bukkit.plugin.java.JavaPlugin

class Plugin: JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabled ${description.fullName}")
        server.pluginManager.registerEvents(Event(), this)
        getCommand("sample")?.setExecutor(Command())

        val WorldEditPlugin: WorldEditPlugin = server.pluginManager.getPlugin("WorldEdit") as WorldEditPlugin
    }
}