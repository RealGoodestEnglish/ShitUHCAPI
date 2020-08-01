package me.GoodestEnglish.ShitUHC.scenario;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.List;

public abstract class Scenario {
    public String name;
    public boolean enabled;
    public Material material;
    public List<String> description;


    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean value, Player player) {
        return;
    }

    public String getName() {
        return null;
    }

    public ItemStack getItemStack() {
        return null;
    }

    public ItemStack getItemStackEditable() {
        return null;
    }

}
