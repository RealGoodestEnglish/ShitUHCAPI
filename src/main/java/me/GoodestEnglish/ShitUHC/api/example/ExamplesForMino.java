package me.GoodestEnglish.ShitUHC.api.example;

import me.GoodestEnglish.ShitUHC.ShitUHC;
import me.GoodestEnglish.ShitUHC.api.ShitUHCAPI;
import me.GoodestEnglish.ShitUHC.api.ShitUHCScenarioBuilder;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class ExamplesForMino extends JavaPlugin {

    @Override
    public void onEnable() {

        /*
            Add your custom scenarios into your game when server starts up to have a better performance
            Remember to add 'QoolUHC' as your depends in plugin.yml
         */

        ShitUHCAPI.addScenario(
                "name of the scenario, use small latter for better performance",
                new ShitUHCScenarioBuilder(
                        "Scenario name, this time you can use capital latter",
                        false,
                        Material.ACACIA_DOOR,
                        Arrays.asList("Hey!", "This is second line!", "Mino is noob")
                )
        );
    }
}
