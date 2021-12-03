package fr.lasere.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.VersionCommand;
import org.bukkit.entity.Player;

public class commandTest implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(cmd.getName().equalsIgnoreCase("test")) {
				player.sendMessage("tu a réussi");
				return true;
			}
			
			if(cmd.getName().equalsIgnoreCase("alert")) {
				Bukkit.broadcastMessage("§4 ATTENTION !!!! le serveur vas surement fermé quelle que instent pour un mentenence §7 , alert envoyer de [" + player.getName()+ "]");
				return true;
			}
	
			
		}
		
		return false;
	}

}
