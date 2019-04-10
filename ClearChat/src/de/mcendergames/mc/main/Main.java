package de.mcendergames.mc.main;


import org.bukkit.plugin.java.JavaPlugin;


import de.mcendergames.mc.commands.ChatclearCommand;






public class Main extends JavaPlugin {
	
	private static Main plugin;
	
	public void onEnable() {
		
		
		getCommand("cc").setExecutor(new ChatclearCommand());
	}
	
	public static Main getPlugin() {
		return plugin;
		
	}


}
