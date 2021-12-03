package fr.lasere.plugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.lasere.plugin.commands.commandTest;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("le plugin viend de s'alummer");
		getCommand("test").setExecutor(new commandTest());
		getCommand("alert").setExecutor(new commandTest());
		getServer().getPluginManager().registerEvents(new PluginListeners(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("le plugin viend de s'étendre");
	}
	
}