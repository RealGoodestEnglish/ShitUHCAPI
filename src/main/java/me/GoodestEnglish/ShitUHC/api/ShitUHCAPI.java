package me.GoodestEnglish.ShitUHC.api;

import me.GoodestEnglish.ShitUHC.scenario.Scenario;
import org.bukkit.entity.Player;

public class ShitUHCAPI {

    /**
     *
     * @param name the name of the scenario, name would prefer in all lower case
     * @param scenario the scenario
     */
    public static void addScenario(String name, Scenario scenario) {

    }

    /**
     *
     * @param name the scenario's name you want to remove, it should be in lower case
     */
    public static void removeScenario(String name) {

    }

    /**
     * This allows you to check if the scenario is enabled or not
     *
     * @param scenario The scenario you want to check
     * @return the state of scenario, true = enabled, false = disabled
     */
    public static boolean isScenarioEnabled(String scenario) {
        return false;
    }

    /**
     * Check to see if the player is alive or not
     *
     * @param player The player you want to check
     * @return true = alive, false = dead, if he is is staff mode or in practice then return false
     */
    public static boolean isAlive(Player player) {
        return false;
    }

}
