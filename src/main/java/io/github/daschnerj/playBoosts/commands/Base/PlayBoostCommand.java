package io.github.daschnerj.playBoosts.commands.Base;

//Imports for the base command class.
import io.github.daschnerj.playBoosts.commands.CommandInterface;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//This class implements the Command Interface.
public class PlayBoostCommand implements CommandInterface
{

  //The command should be automatically created.
  @Override
  public boolean onCommand(CommandSender sender, Command cmd,
          String commandLabel, String[] args) {

      //Because in our CommandHandler we are already checking if the sender's instance is a player, we don't have to do it here.
      Player p = (Player) sender;
      //For the purpose of this tutorial I am just sending the player a message.
      p.sendMessage("Example!");
      return true;
  }

}