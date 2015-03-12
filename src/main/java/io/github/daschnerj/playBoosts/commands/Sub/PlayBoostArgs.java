package io.github.daschnerj.playBoosts.commands.Sub;

//Imports Needed.
import io.github.daschnerj.playBoosts.Get;
import io.github.daschnerj.playBoosts.Set;
import io.github.daschnerj.playBoosts.commands.Data.PlayBoostsData;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//ArgsCmd also implements CommandInterface
public class PlayBoostArgs implements CommandExecutor
{

	Get g = new Get();
	
	String noPerm = ChatColor.RED + "You do not have permission to do this command!";
	String boostNotActive = ChatColor.RED + "This boost is not active!";
	String noBoost = ChatColor.RED + "Invalid boost type!";
	String invalidArguments = ChatColor.RED + "Invalid arguments!";
	String boostActivated1 = ChatColor.GREEN + "Your Boost ";
	String boostActivated2 = ChatColor.GREEN + " has been actived!";
	String boostDeactivated1 = ChatColor.RED + "Your Boost ";
	String boostDeactivated2 = ChatColor.RED + " has been deactived!";
	String globalBoost1 = ChatColor.AQUA + "Boost ";
	String globalBoost2 = ChatColor.AQUA + " has been activated for all players!";
	String dGlobalBoost1 = ChatColor.DARK_RED + "Boost ";
	String dGlobalBoost2 = ChatColor.DARK_RED + " has been deactivated for all players!";
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(sender instanceof Player)
		{
		Player p = (Player) sender;

		//We don't have to check if the args length is equal to one, but you will have to check if it is greater than 1.
		if(commandLabel.equalsIgnoreCase("boost"))
		{
		if(args.length == 1)
		{
			if(args[0].equalsIgnoreCase("jump"))
			{	
				if(p.hasPermission("boosts.jump"))
				{
					if(g.activeJump())
					{
						if(g.hasPlayerJump(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "Jump" + boostDeactivated2);
							Set.removePlayerJump(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "Jump" + boostActivated2);
							Set.addPlayerJump(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	
			}
			else if(args[0].equalsIgnoreCase("xp"))
			{
				if(p.hasPermission("boosts.xp"))
				{
					if(g.activeXP())
					{
						if(g.hasPlayerXP(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "XP" + boostDeactivated2);
							Set.removePlayerXP(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "XP" + boostActivated2);
							Set.addPlayerXP(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	

			}
			else if(args[0].equalsIgnoreCase("speed"))
			{
				if(p.hasPermission("boosts.speed"))
				{
					if(g.activeSpeed())
					{
						if(g.hasPlayerSpeed(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "Speed" + boostDeactivated2);
							Set.removePlayerSpeed(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "Speed" + boostActivated2);
							Set.addPlayerSpeed(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	
			}
			else if(args[0].equalsIgnoreCase("mine"))
			{
				if(p.hasPermission("boosts.mine"))
				{
					if(g.activeMine())
					{
						if(g.hasPlayerMine(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "Mine" + boostDeactivated2);
							Set.removePlayerMine(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "Mine" + boostActivated2);
							Set.addPlayerMine(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	
			}
			else if(args[0].equalsIgnoreCase("lava"))
			{
				if(p.hasPermission("boosts.lava"))
				{
					if(g.activeLava())
					{
						if(g.hasPlayerLava(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "Lava" + boostDeactivated2);
							Set.removePlayerLava(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "Lava" + boostActivated2);
							Set.addPlayerLava(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	
			}
			else if(args[0].equalsIgnoreCase("water"))
			{
				if(p.hasPermission("boosts.water"))
				{
					if(g.activeWater())
					{
						if(g.hasPlayerWater(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "Water" + boostDeactivated2);
							Set.removePlayerWater(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "Water" + boostActivated2);
							Set.addPlayerWater(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	
			}
			else if(args[0].equalsIgnoreCase("durability"))
			{
				if(p.hasPermission("boosts.durability"))
				{
					if(g.activeDurability())
					{
						if(g.hasPlayerDurability(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "Durability" + boostDeactivated2);
							Set.removePlayerDurability(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "Durability" + boostActivated2);
							Set.addPlayerDurability(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	
			}
			else if(args[0].equalsIgnoreCase("food"))
			{
				if(p.hasPermission("boosts.food"))
				{
					if(g.activeFood())
					{
						if(g.hasPlayerFood(p))
						{
							p.sendMessage(boostDeactivated1 + ChatColor.GOLD + "Food" + boostDeactivated2);
							Set.removePlayerFood(p);
						}
						else
						{
							p.sendMessage(boostActivated1 + ChatColor.GOLD + "Food" + boostActivated2);
							Set.addPlayerFood(p);
						}
					}
					else
					{
						p.sendMessage(boostNotActive);
					}
				}
				else
				{
					p.sendMessage(noPerm);
				}	
			}
			else
			{
				p.sendMessage(noBoost);
			}
		}
		if(args.length == 2)
		{
			if(args[0].equals("toggle"))
			{
				if(args[1].equals("jump"))
				{	
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeJump())
						{
							if(PlayBoostsData.Boost.containsKey(0))
							{
								PlayBoostsData.Boost.remove(0);
							}
							PlayBoostsData.Boost.put(0, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Jump" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(0))
							{
								PlayBoostsData.Boost.remove(0);
							}
							PlayBoostsData.Boost.put(0, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Jump" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}	
				}
				else if(args[1].equals("xp"))
				{
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeXP())
						{
							if(PlayBoostsData.Boost.containsKey(1))
							{
								PlayBoostsData.Boost.remove(1);
							}
							PlayBoostsData.Boost.put(1, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "XP" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(1))
							{
								PlayBoostsData.Boost.remove(1);
							}
							PlayBoostsData.Boost.put(1, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "XP" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}	

				}
				else if(args[1].equals("speed"))
				{
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeSpeed())
						{
							if(PlayBoostsData.Boost.containsKey(2))
							{
								PlayBoostsData.Boost.remove(2);
							}
							PlayBoostsData.Boost.put(2, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Speed" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(2))
							{
								PlayBoostsData.Boost.remove(2);
							}
							PlayBoostsData.Boost.put(2, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Speed" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}	
				}
				else if(args[1].equals("mine"))
				{
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeMine())
						{
							if(PlayBoostsData.Boost.containsKey(3))
							{
								PlayBoostsData.Boost.remove(3);
							}
							PlayBoostsData.Boost.put(3, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Mine" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(3))
							{
								PlayBoostsData.Boost.remove(3);
							}
							PlayBoostsData.Boost.put(3, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Mine" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}	
				}
				else if(args[1].equals("lava"))
				{
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeLava())
						{
							if(PlayBoostsData.Boost.containsKey(4))
							{
								PlayBoostsData.Boost.remove(4);
							}
							PlayBoostsData.Boost.put(4, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Lava" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(4))
							{
								PlayBoostsData.Boost.remove(4);
							}
							PlayBoostsData.Boost.put(4, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Lava" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}		
				}
				else if(args[1].equals("water"))
				{
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeWater())
						{
							if(PlayBoostsData.Boost.containsKey(5))
							{
								PlayBoostsData.Boost.remove(5);
							}
							PlayBoostsData.Boost.put(5, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Water" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(5))
							{
								PlayBoostsData.Boost.remove(5);
							}
							PlayBoostsData.Boost.put(5, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Water" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}	
				}
				else if(args[1].equals("durability"))
				{
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeDurability())
						{
							if(PlayBoostsData.Boost.containsKey(6))
							{
								PlayBoostsData.Boost.remove(6);
							}
							PlayBoostsData.Boost.put(6, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Durability" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(6))
							{
								PlayBoostsData.Boost.remove(6);
							}
							PlayBoostsData.Boost.put(6, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Durability" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}	
				}
				else if(args[1].equals("food"))
				{
					if(p.hasPermission("boosts.admin"))
					{
						if(!g.activeFood())
						{
							if(PlayBoostsData.Boost.containsKey(7))
							{
								PlayBoostsData.Boost.remove(7);
							}
							PlayBoostsData.Boost.put(7, true);
							Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Food" + globalBoost2);
						}
						else
						{
							if(PlayBoostsData.Boost.containsKey(7))
							{
								PlayBoostsData.Boost.remove(7);
							}
							PlayBoostsData.Boost.put(7, false);
							Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Food" + dGlobalBoost2);
						}
					}
					else
					{
						p.sendMessage(noPerm);
					}	
				}
				else
				{
					p.sendMessage(noBoost);
				}
			}
			else
			{
				p.sendMessage(noBoost);
			}
		}
		else
		{
			p.sendMessage(invalidArguments);
		}
    
      return true;
      }
		return true;
	}
		else
		{
			if(args.length == 2)
			{
				if(args[0].equals("toggle"))
				{
					if(args[1].equals("jump"))
					{	
							if(!g.activeJump())
							{
								if(PlayBoostsData.Boost.containsKey(0))
								{
									PlayBoostsData.Boost.remove(0);
								}
								PlayBoostsData.Boost.put(0, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Jump" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(0))
								{
									PlayBoostsData.Boost.remove(0);
								}
								PlayBoostsData.Boost.put(0, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Jump" + dGlobalBoost2);
							}
					}
					else if(args[1].equals("xp"))
					{
							if(!g.activeXP())
							{
								if(PlayBoostsData.Boost.containsKey(1))
								{
									PlayBoostsData.Boost.remove(1);
								}
								PlayBoostsData.Boost.put(1, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "XP" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(1))
								{
									PlayBoostsData.Boost.remove(1);
								}
								PlayBoostsData.Boost.put(1, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "XP" + dGlobalBoost2);
							}	

					}
					else if(args[1].equals("speed"))
					{
							if(!g.activeSpeed())
							{
								if(PlayBoostsData.Boost.containsKey(2))
								{
									PlayBoostsData.Boost.remove(2);
								}
								PlayBoostsData.Boost.put(2, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Speed" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(2))
								{
									PlayBoostsData.Boost.remove(2);
								}
								PlayBoostsData.Boost.put(2, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Speed" + dGlobalBoost2);
							}	
					}
					else if(args[1].equals("mine"))
					{
							if(!g.activeMine())
							{
								if(PlayBoostsData.Boost.containsKey(3))
								{
									PlayBoostsData.Boost.remove(3);
								}
								PlayBoostsData.Boost.put(3, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Mine" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(3))
								{
									PlayBoostsData.Boost.remove(3);
								}
								PlayBoostsData.Boost.put(3, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Mine" + dGlobalBoost2);
							}	
					}
					else if(args[1].equals("lava"))
					{
							if(!g.activeLava())
							{
								if(PlayBoostsData.Boost.containsKey(4))
								{
									PlayBoostsData.Boost.remove(4);
								}
								PlayBoostsData.Boost.put(4, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Lava" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(4))
								{
									PlayBoostsData.Boost.remove(4);
								}
								PlayBoostsData.Boost.put(4, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Lava" + dGlobalBoost2);
							}	
					}
					else if(args[1].equals("water"))
					{
							if(!g.activeWater())
							{
								if(PlayBoostsData.Boost.containsKey(5))
								{
									PlayBoostsData.Boost.remove(5);
								}
								PlayBoostsData.Boost.put(5, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Water" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(5))
								{
									PlayBoostsData.Boost.remove(5);
								}
								PlayBoostsData.Boost.put(5, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Water" + dGlobalBoost2);
							}	
					}
					else if(args[1].equals("durability"))
					{
							if(!g.activeDurability())
							{
								if(PlayBoostsData.Boost.containsKey(6))
								{
									PlayBoostsData.Boost.remove(6);
								}
								PlayBoostsData.Boost.put(6, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Durability" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(6))
								{
									PlayBoostsData.Boost.remove(6);
								}
								PlayBoostsData.Boost.put(6, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Durability" + dGlobalBoost2);
							}
					}
					else if(args[1].equals("food"))
					{
							if(!g.activeFood())
							{
								if(PlayBoostsData.Boost.containsKey(7))
								{
									PlayBoostsData.Boost.remove(7);
								}
								PlayBoostsData.Boost.put(7, true);
								Bukkit.getServer().broadcastMessage(globalBoost1 + ChatColor.GOLD + "Food" + globalBoost2);
							}
							else
							{
								if(PlayBoostsData.Boost.containsKey(7))
								{
									PlayBoostsData.Boost.remove(7);
								}
								PlayBoostsData.Boost.put(7, false);
								Bukkit.getServer().broadcastMessage(dGlobalBoost1 + ChatColor.GOLD + "Food" + dGlobalBoost2);
							}	
					}
				}
			}


		}
		return true;
	}

}
