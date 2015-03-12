package io.github.daschnerj.playBoosts;

import io.github.daschnerj.playBoosts.commands.Data.PlayBoostsData;

import org.bukkit.entity.Player;

public class Get 
{
	
	//Data Get Functions - Start ===================================================================================================================
	
	public boolean activeJump()
	{
		return PlayBoostsData.Boost.get(0);
	}
	
	public boolean activeXP()
	{
		return PlayBoostsData.Boost.get(1);
	}
	
	public boolean activeSpeed()
	{
		return PlayBoostsData.Boost.get(2);
	}
	
	public boolean activeMine()
	{
		return PlayBoostsData.Boost.get(3);
	}
	
	public boolean activeLava()
	{
		return PlayBoostsData.Boost.get(4);
	}
	
	public boolean activeWater()
	{
		return PlayBoostsData.Boost.get(5);
	}
	
	public boolean activeDurability()
	{
		return PlayBoostsData.Boost.get(6);
	}
	
	public boolean activeFood()
	{
		return PlayBoostsData.Boost.get(7);
	}
	
	public boolean hasPlayerJump(Player p)
	{
		if(PlayBoostsData.PlayerJump.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean hasPlayerXP(Player p)
	{
		if(PlayBoostsData.PlayerXP.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean hasPlayerSpeed(Player p)
	{
		if(PlayBoostsData.PlayerSpeed.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean hasPlayerMine(Player p)
	{
		if(PlayBoostsData.PlayerMine.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean hasPlayerLava(Player p)
	{
		if(PlayBoostsData.PlayerLava.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean hasPlayerWater(Player p)
	{
		if(PlayBoostsData.PlayerWater.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean hasPlayerDurability(Player p)
	{
		if(PlayBoostsData.PlayerDurability.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean hasPlayerFood(Player p)
	{
		if(PlayBoostsData.PlayerFood.containsKey(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerJump(Player p)
	{
		if(hasPlayerJump(p))
		{
			return PlayBoostsData.PlayerJump.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerXP(Player p)
	{
		if(hasPlayerXP(p))
		{
			return PlayBoostsData.PlayerXP.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerSpeed(Player p)
	{
		if(hasPlayerSpeed(p))
		{
			return PlayBoostsData.PlayerSpeed.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerMine(Player p)
	{
		if(hasPlayerMine(p))
		{
			return PlayBoostsData.PlayerMine.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerLava(Player p)
	{
		if(hasPlayerLava(p))
		{
			return PlayBoostsData.PlayerLava.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerWater(Player p)
	{
		if(hasPlayerWater(p))
		{
			return PlayBoostsData.PlayerWater.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerDurability(Player p)
	{
		if(hasPlayerDurability(p))
		{
			return PlayBoostsData.PlayerDurability.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean allowPlayerFood(Player p)
	{
		if(hasPlayerFood(p))
		{
			return PlayBoostsData.PlayerFood.get(p);
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerJump(Player p)
	{
		if(allowPlayerJump(p) && activeJump())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerXP(Player p)
	{
		if(allowPlayerXP(p) && activeXP())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerSpeed(Player p)
	{
		if(allowPlayerSpeed(p) && activeSpeed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerMine(Player p)
	{
		if(allowPlayerMine(p) && activeMine())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerLava(Player p)
	{
		if(allowPlayerLava(p) && activeLava())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerWater(Player p)
	{
		if(allowPlayerWater(p) && activeWater())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerDurability(Player p)
	{
		if(allowPlayerDurability(p) && activeDurability())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean canPlayerFood(Player p)
	{
		if(allowPlayerFood(p) && activeFood())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Data Get Functions - End ===================================================================================================================

	//Player Get Functions - Start ===================================================================================================================
	
	public boolean checkPlayerPermission(Player p, String permission)
	{
		if(p.hasPermission(permission))
			return true;
		else
			return false;
	}
	
	//Player Get Functions - End ===================================================================================================================

}
