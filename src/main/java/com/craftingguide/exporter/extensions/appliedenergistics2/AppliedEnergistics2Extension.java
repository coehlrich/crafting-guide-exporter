package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.ExporterExtension;
import com.craftingguide.exporter.Registry;

public class AppliedEnergistics2Extension implements ExporterExtension {

    @Override
    public void register(Registry registry) {
        registry.registerWorker("appliedenergistics2.AppliedEnergistics2ModEditor");
        registry.registerWorker("appliedenergistics2.AppliedEnergistics2ChargerRecipeGatherer");
        registry.registerWorker("appliedenergistics2.AppliedEnergistics2QuartzGrindstoneRecipeGatherer");
        registry.registerWorker("appliedenergistics2.AppliedEnergistics2InscriberRecipeGatherer");
        registry.registerWorker("appliedenergistics2.AppliedEnergistics2WaterRecipeGatherer");
        registry.registerWorker("appliedenergistics2.AppliedEnergistics2ShapedRecipeGatherer");
        registry.registerWorker("appliedenergistics2.AppliedEnergistics2ShaplessRecipeGatherer");
    }

}
