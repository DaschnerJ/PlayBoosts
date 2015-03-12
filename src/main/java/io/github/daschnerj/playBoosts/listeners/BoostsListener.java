package io.github.daschnerj.playBoosts.listeners;

import io.github.daschnerj.playBoosts.Get;
import io.github.daschnerj.playBoosts.PlayBoosts;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class BoostsListener implements Listener {
	
public final PlayBoosts plugin;

	Get g = new Get();

	public BoostsListener(PlayBoosts instance) 
    {
        plugin = instance;
    }
 
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) 
    {
        Player player = event.getPlayer();
        player.setGameMode(GameMode.SURVIVAL);
        if(g.canPlayerJump(player))
        {
        	player.setAllowFlight(true);
        }
        
    }
 
    @EventHandler
    public void onPlayerToggleFlight(PlayerToggleFlightEvent event) {  	
    	Player player = event.getPlayer();
    	if(g.canPlayerJump(player))
        {
    		if (player.getGameMode() == GameMode.SURVIVAL) 
    		{
    			player.setFlying(false);
    			Location loc = player.getLocation().clone();
    			loc.setPitch(0.0F);
    			Vector vel = player.getVelocity().clone();
       
    			int strength = 10;
       
    			Vector jump = vel.multiply(0.1D).setY(0.17D * strength);
    			Vector look = loc.getDirection().normalize().multiply(1.5D);
       
    			player.setVelocity(jump.add(look));
       
    			player.setAllowFlight(false);
       
    			event.setCancelled(true);
    		}
        }
    }
 
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if(g.canPlayerJump(player))
        {
        	if (player.getGameMode() == GameMode.SURVIVAL) 
        	{
        		if (!player.getAllowFlight()) 
        		{
        			Location loc = player.getLocation();
        			Block block = loc.getBlock().getRelative(BlockFace.DOWN);
        			if (block.getType() != Material.AIR) 
        			{
        				player.setAllowFlight(true);
        			}
        		}
        	}
        }
        if(g.canPlayerSpeed(player))
        {
        	player.setWalkSpeed(0.6f);
        }
        else if(player.hasPotionEffect(PotionEffectType.SPEED) || player.hasPotionEffect(PotionEffectType.SLOW) || player.hasPermission("boost.speed.bypass"))
        {
        	
        }
        else
        {
        	player.setWalkSpeed(0.2f);
        }
    }
    
    @EventHandler
    public void doubleExperience(PlayerExpChangeEvent e) 
    {
    	Player player = e.getPlayer();
    	if(g.canPlayerXP(player))
    	{
    		e.setAmount(e.getAmount() * 2);
    	}
    }
    
    @EventHandler
    public void instantBreak(BlockDamageEvent e) 
    {
    	Player player = e.getPlayer();
    	if(g.canPlayerMine(player))
    	{
    		PotionEffect potionEffect = new PotionEffect(PotionEffectType.FAST_DIGGING, 20, 255);
            potionEffect.apply(player);
    	}
    }
    
    @EventHandler
    public void blockBreaking(BlockBreakEvent event)
    {
        Player p = event.getPlayer();
        if(g.canPlayerDurability(p))
		{
        	short d = p.getItemInHand().getDurability();
    		p.getItemInHand().setDurability((short)(d+1));
		}
    }
    
    @EventHandler
    public void onHungerChange(FoodLevelChangeEvent e) 
    {
    	Player player = (Player)e.getEntity();
    	if(g.canPlayerFood(player))
    	{
    		e.setCancelled(true); 
    	}
    }
    
    @EventHandler
    public void onLiquid(EntityDamageEvent event){
        if(event.getEntity() instanceof Player)
        {
            Player player = (Player) event.getEntity();
            if(g.canPlayerLava(player))
            {
            	if(event.getCause().equals(DamageCause.LAVA) || event.getCause().equals(DamageCause.FIRE) || event.getCause().equals(DamageCause.FIRE_TICK))
            	{
            		PotionEffect potionEffect = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 60, 2);
                    potionEffect.apply(player);
                    event.setCancelled(true);
            	}
            }
            if(g.canPlayerWater(player))
            {
            	if(event.getCause().equals(DamageCause.DROWNING))
            	{
            		PotionEffect potionEffect = new PotionEffect(PotionEffectType.WATER_BREATHING, 60, 2);
                    potionEffect.apply(player);
                    event.setCancelled(true);
            	}
            }
        }
    }

}
