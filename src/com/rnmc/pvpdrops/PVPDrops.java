package com.rnmc.pvpdrops;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PVPDrops extends JavaPlugin implements Listener{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static PVPDrops plugin;
	
	public PVPDrops instance;
	public PVPDrops getInstance(){
		return instance;
	}
	
	@Override
	public void onDisable() {
		instance = null;
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been disabled!");
	}
	
	@Override
	public void onEnable() {
		instance = this;
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " has been enabled!");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
@EventHandler	
public void Drop(PlayerDropItemEvent e){
	Player p = e.getPlayer();
	if(!p.hasPermission("pvpdrops.ignore")){
		if(p.getItemInHand() == new ItemStack(Material.IRON_SWORD)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_HOE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_AXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_SPADE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_PICKAXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.WOOD_SWORD)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.WOOD_HOE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.WOOD_AXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.WOOD_SPADE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.WOOD_PICKAXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_SWORD)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_HOE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_AXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_SPADE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_PICKAXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_SWORD)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_HOE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_AXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_SPADE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_PICKAXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.STONE_SWORD)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.STONE_HOE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.STONE_AXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.STONE_SPADE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.STONE_PICKAXE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.BOWL)){
			e.setCancelled(true);
			p.setItemInHand(new ItemStack(Material.AIR, 0));
		}
		if(p.getItemInHand() == new ItemStack(Material.CHAINMAIL_BOOTS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.CHAINMAIL_HELMET)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.CHAINMAIL_CHESTPLATE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.CHAINMAIL_LEGGINGS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.LEATHER_BOOTS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.LEATHER_HELMET)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.LEATHER_CHESTPLATE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.LEATHER_LEGGINGS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_BOOTS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_HELMET)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_CHESTPLATE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.GOLD_LEGGINGS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_BOOTS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_HELMET)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_CHESTPLATE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.IRON_LEGGINGS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_BOOTS)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_HELMET)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_CHESTPLATE)){
			e.setCancelled(true);
		}
		if(p.getItemInHand() == new ItemStack(Material.DIAMOND_LEGGINGS)){
			e.setCancelled(true);
		}
	}	
}
}
