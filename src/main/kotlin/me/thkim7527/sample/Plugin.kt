package me.thkim7527.sample

import org.bukkit.plugin.java.JavaPlugin

class Plugin: JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabled ${description.fullName}")
        server.pluginManager.registerEvents(Event(), this)
        getCommand("sample")?.setExecutor(Command())
    }
}