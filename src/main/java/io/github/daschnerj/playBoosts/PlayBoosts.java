package io.github.daschnerj.playBoosts;


import io.github.daschnerj.playBoosts.commands.CommandHandler;
import io.github.daschnerj.playBoosts.commands.Base.PlayBoostCommand;
import io.github.daschnerj.playBoosts.commands.Data.PlayBoostsData;
import io.github.daschnerj.playBoosts.commands.Sub.PlayBoostArgs;
import io.github.daschnerj.playBoosts.listeners.BoostsListener;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayBoosts extends JavaPlugin 
{
	
	private final BoostsListener boostsListener = new BoostsListener(this);
	
	@Override
	public void onEnable() 
	{
		PlayBoostsData.Boost.put(0, false);
		PlayBoostsData.Boost.put(1, false);
		PlayBoostsData.Boost.put(2, false);
		PlayBoostsData.Boost.put(3, false);
		PlayBoostsData.Boost.put(4, false);
		PlayBoostsData.Boost.put(5, false);
		PlayBoostsData.Boost.put(6, false);
		PlayBoostsData.Boost.put(7, false);
		PlayBoostsData.Boost.put(8, false);
		PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(boostsListener, this);
        registerCommands();
		getLogger().info("onEnable has been invoked!");	
	}
 
	@Override
	public void onDisable() 
	{
		getLogger().info("onDisable has been invoked!");
	}
	
	public void registerCommands() 
	{ 
        this.getCommand("boost").setExecutor(new PlayBoostArgs());
    }

}
