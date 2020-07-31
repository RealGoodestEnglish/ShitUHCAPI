package me.GoodestEnglish.ShitUHC.api;

import me.GoodestEnglish.ShitUHC.scenario.Scenario;
import org.bukkit.Material;

import java.util.List;

public class ShitUHCScenarioBuilder extends Scenario {

    /**
     * This Scenario Builder allows you to create your own scenario, after you created your scenario,
     * use the method 'addScenario' in ShitUHCAPI to add your custom scenario
     *
     * @param name The scenario name, doesn't matter if it is lower case or not
     * @param enabled The state of the scenario, normally it should be false
     * @param icon The icon of the scenario, it displays when someone opened the scenarios gui
     * @param description The description of the scenario, give it a brief description to let players know what is it!
     */
    public ShitUHCScenarioBuilder(String name, boolean enabled, Material icon, List<String> description) {
        this.name = name;
        this.enabled = enabled;
        this.material = icon;
        this.description = description;
    }

}
