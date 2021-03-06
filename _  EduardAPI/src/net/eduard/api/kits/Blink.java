package net.eduard.api.kits;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.eduard.api.click.PlayerClick;
import net.eduard.api.click.PlayerClickEffect;
import net.eduard.api.game.Ability;
import net.eduard.api.setup.Mine;

public class Blink extends Ability {
	public int distance = 7;
	public Blink() {
		setIcon(Material.LEAVES, "§fTeleporte para perto numa distancia");
		setClick(new PlayerClick(Material.NETHER_STAR,new PlayerClickEffect() {
			
			@Override
			public void onClick(Player player, Block block, ItemStack item) {
				if (hasKit(player)) {
					if (cooldown(player)) {
						Location loc = Mine.getTargetLoc(player, distance);
						Mine.teleport(player,loc.clone().add(0, 2, 0));
						loc.getBlock().setType(Material.LEAVES);
					}
				}
				
			}
		}));
		add(Material.NETHER_STAR);
		setTime(10);
	}
	

}
