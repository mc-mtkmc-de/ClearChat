package de.mcendergames.mc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatclearCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("clearchat.cc")) {
				if(args.length == 0) {
					
					for(int i = 0; i <= 150; i++) 
						Bukkit.broadcastMessage(" ");
					Bukkit.broadcastMessage("§aDer Chat wurde von §6" + player.getName() + "§ageleert.");
					
					
				} else
					player.sendMessage("§cBitte benutze §6/cc §c!");
				
			} else
				player.sendMessage("§cDazu hast du keine Rechte!");
		}

		return false;
	}

}
