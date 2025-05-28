package com.noctify.Custom;

import com.noctify.Custom.Behavior.MidasSwordBehavior;
import com.noctify.Custom.ItemAttributes.ExampleItem;
import com.noctify.Custom.ItemRegistry.*;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class MidasSword extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.GREEN + "MidasSword item has been added to the game!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void initialize(Plugin plugin) {
        ItemRegistry.registerItem("midas_sword", MidasSword.class);
        ItemRegistry.registerBehavior(plugin, "midas_sword", MidasSwordBehavior.class);
        ItemRegistry.addRecipe(plugin, ExampleItem.class);
    }

}
