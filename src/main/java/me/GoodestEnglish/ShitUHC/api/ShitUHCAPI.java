package me.GoodestEnglish.ShitUHC.api;

import me.GoodestEnglish.ShitUHC.scenario.Scenario;

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
    public boolean isScenarioEnabled(Scenario scenario) {
        return false;
    }

}
