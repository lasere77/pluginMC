package fr.lasere.plugin;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PluginListeners implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		player.getInventory().clear();
	
		
		ItemStack customsword = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta customM = customsword.getItemMeta();
		customM.setDisplayName("§2 épée de dieux");
		customM.setLore(Arrays.asList("wech wech canne a pêche","salut mon pote a la compote","allez bilout"));
		customM.addEnchant(Enchantment.DAMAGE_ALL, 125, true);
		customM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		customsword.setItemMeta(customM);
		player.getInventory().setItemInMainHand(customsword);
		
		ItemStack customaxe = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta custoMAXE = customaxe.getItemMeta();
		custoMAXE.setDisplayName("§2ache de dieux");
		custoMAXE.setLore(Arrays.asList("wech wech canne a pêche","salut mon pote a la compote","allez bilout"));
		custoMAXE.addEnchant(Enchantment.DAMAGE_ALL, 250, true);
		custoMAXE.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		customaxe.setItemMeta(custoMAXE);
		player.getInventory().setItemInOffHand(customaxe);
		
		
		ItemStack custompaper = new ItemStack(Material.PAPER, 1);
		ItemMeta customMPAPER = custompaper.getItemMeta();	
		customMPAPER.setDisplayName("el papier");
		customMPAPER.setLore(Arrays.asList("ce petit bout de paper peux beaucoup te servire"));
		custompaper.setItemMeta(customMPAPER);
		player.getInventory().addItem(custompaper);
		
		
		player.updateInventory();
	}
	
}