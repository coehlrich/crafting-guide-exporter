package com.craftingguide.exporter.extensions.forestry;

import com.craftingguide.exporter.ExporterExtension;
import com.craftingguide.exporter.Registry;

public class ForestryExtension implements ExporterExtension {

    @Override
    public void register(Registry registry) {
        registry.registerWorker("forestry.ForestryModEditor");
        registry.registerWorker("forestry.CarpenterRecipeGatherer");
        
    }

}
