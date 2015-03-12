package io.github.daschnerj.playBoosts;

import io.github.daschnerj.playBoosts.commands.Data.PlayBoostsData;

import org.bukkit.entity.Player;

public class Set 
{
	
	public static Get g = new Get();
	
	public static void addPlayerJump(Player p)
	{
		PlayBoostsData.PlayerJump.put(p, true);
	}
	
	public static void addPlayerXP(Player p)
	{
		PlayBoostsData.PlayerXP.put(p, true);
	}
	
	public static void addPlayerSpeed(Player p)
	{
		PlayBoostsData.PlayerSpeed.put(p, true);
	}
	
	public static void addPlayerMine(Player p)
	{
		PlayBoostsData.PlayerMine.put(p, true);
	}
	
	public static void addPlayerLava(Player p)
	{
		PlayBoostsData.PlayerLava.put(p, true);
	}
	
	public static void addPlayerWater(Player p)
	{
		PlayBoostsData.PlayerWater.put(p, true);
	}
	
	public static void addPlayerDurability(Player p)
	{
		PlayBoostsData.PlayerDurability.put(p, true);
	}
	
	public static void addPlayerFood(Player p)
	{
		PlayBoostsData.PlayerFood.put(p, true);
	}
	
	public static void removePlayerJump(Player p)
	{
		if(g.hasPlayerJump(p))
			PlayBoostsData.PlayerJump.remove(p);
	}
	
	public static void removePlayerXP(Player p)
	{
		if(g.hasPlayerXP(p))
			PlayBoostsData.PlayerXP.remove(p);
	}
	
	public static void removePlayerSpeed(Player p)
	{
		if(g.hasPlayerSpeed(p))
			PlayBoostsData.PlayerSpeed.remove(p);
	}
	
	public static void removePlayerMine(Player p)
	{
		if(g.hasPlayerMine(p))
			PlayBoostsData.PlayerMine.remove(p);
	}
	
	public static void removePlayerLava(Player p)
	{
		if(g.hasPlayerLava(p))
			PlayBoostsData.PlayerLava.remove(p);
	}
	
	public static void removePlayerWater(Player p)
	{
		if(g.hasPlayerWater(p))
			PlayBoostsData.PlayerWater.remove(p);
	}
	
	public static void removePlayerDurability(Player p)
	{
		if(g.hasPlayerDurability(p))
			PlayBoostsData.PlayerDurability.remove(p);
	}
	
	public static void removePlayerFood(Player p)
	{
		if(g.hasPlayerFood(p))
			PlayBoostsData.PlayerFood.remove(p);
	}
	
	public static void negatePlayerJump(Player p)
	{
		removePlayerJump(p);
		PlayBoostsData.PlayerJump.put(p, false);
	}
	
	public static void negatePlayerXP(Player p)
	{
		removePlayerXP(p);
		PlayBoostsData.PlayerXP.put(p, false);
	}
	
	public static void negatePlayerSpeed(Player p)
	{
		removePlayerSpeed(p);
		PlayBoostsData.PlayerSpeed.put(p, false);
	}
	
	public static void negatePlayerMine(Player p)
	{
		removePlayerMine(p);
		PlayBoostsData.PlayerMine.put(p, false);
	}
	
	public static void negatePlayerLava(Player p)
	{
		removePlayerLava(p);
		PlayBoostsData.PlayerLava.put(p, false);
	}
	
	public static void negatePlayerWater(Player p)
	{
		removePlayerWater(p);
		PlayBoostsData.PlayerWater.put(p, false);
	}
	
	public static void negatePlayerDurability(Player p)
	{
		removePlayerDurability(p);
		PlayBoostsData.PlayerDurability.put(p, false);
	}
	
	public static void negatePlayerFood(Player p)
	{
		removePlayerFood(p);
		PlayBoostsData.PlayerFood.put(p, false);
	}

}
