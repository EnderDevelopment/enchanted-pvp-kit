package com.example.enderdev_pvp_kit;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class EnderDevPvPKitMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Initialize the mod
        System.out.println("EnderDev PvP Kit mod initialized!");
        PvPKitCommand.register(CommandRegistrationCallback.EVENT);
    }

    public static void givePvPKit(Player player) {
        // Give the player a PvP kit with all items enchanted
        ItemStack sword = new ItemStack(Items.DIAMOND_SWORD);
        sword.enchant(Enchantments.SHARPNESS, 5);
        sword.enchant(Enchantments.KNOCKBACK, 2);
        sword.enchant(Enchantments.FIRE_ASPECT, 2);
        sword.enchant(Enchantments.UNBREAKING, 3);
        player.getInventory().add(sword);

        ItemStack bow = new ItemStack(Items.BOW);
        bow.enchant(Enchantments.POWER, 5);
        bow.enchant(Enchantments.PUNCH, 2);
        bow.enchant(Enchantments.FLAME, 1);
        bow.enchant(Enchantments.UNBREAKING, 3);
        player.getInventory().add(bow);

        ItemStack helmet = new ItemStack(Items.DIAMOND_HELMET);
        helmet.enchant(Enchantments.PROTECTION, 4);
        helmet.enchant(Enchantments.UNBREAKING, 3);
        player.getInventory().add(helmet);

        ItemStack chestplate = new ItemStack(Items.DIAMOND_CHESTPLATE);
        chestplate.enchant(Enchantments.PROTECTION, 4);
        chestplate.enchant(Enchantments.UNBREAKING, 3);
        player.getInventory().add(chestplate);

        ItemStack leggings = new ItemStack(Items.DIAMOND_LEGGINGS);
        leggings.enchant(Enchantments.PROTECTION, 4);
        leggings.enchant(Enchantments.UNBREAKING, 3);
        player.getInventory().add(leggings);

        ItemStack boots = new ItemStack(Items.DIAMOND_BOOTS);
        boots.enchant(Enchantments.PROTECTION, 4);
        boots.enchant(Enchantments.FEATHER_FALLING, 4);
        boots.enchant(Enchantments.UNBREAKING, 3);
        player.getInventory().add(boots);

        ItemStack shield = new ItemStack(Items.SHIELD);
        shield.enchant(Enchantments.UNBREAKING, 3);
        player.getInventory().add(shield);
    }
}