package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_deopall extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (TFM_Util.isUserSuperadmin(sender) || senderIsConsole)
        {
            TFM_Util.adminAction(sender.getName(), "De-opping all players on the server", true);

            for (Player p : server.getOnlinePlayers())
            {
                p.setOp(false);
                p.sendMessage(TotalFreedomMod.YOU_ARE_NOT_OP);
            }
//            if (args.length >= 1)
//            {
//                if (args[0].equalsIgnoreCase("purge"))
//                {
//                    sender.sendMessage(ChatColor.GRAY + "Purging ops.txt.");
//
//                    for (OfflinePlayer p : server.getOperators())
//                    {
//                        p.setOp(false);
//                    }
//                }
//            }
        }
        else
        {
            sender.sendMessage(TotalFreedomMod.MSG_NO_PERMS);
        }

        return true;
    }
}
