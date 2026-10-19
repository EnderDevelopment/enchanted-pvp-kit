package com.example.enderdev_pvp_kit.command;

import com.example.enderdev_pvp_kit.EnderDevPvPKitMod;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class PvPKitCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("pvpkit").executes(context -> {
            ServerPlayer player = context.getSource().getPlayer();
            if (player != null) {
                EnderDevPvPKitMod.givePvPKit(player);
            player.sendSystemMessage(Component.literal("You have received the PvP kit!")); // Send a system message to the player
                context.getSource().sendSuccess(() -> Component.literal("You have received the PvP kit!"), false);
            }
            return 1;
        }));
    }
}