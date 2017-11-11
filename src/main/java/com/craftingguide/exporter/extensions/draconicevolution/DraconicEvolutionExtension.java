package com.craftingguide.exporter.extensions.draconicevolution;

import com.craftingguide.exporter.ExporterExtension;
import com.craftingguide.exporter.Registry;
import com.craftingguide.exporter.Registry.Priority;

public class DraconicEvolutionExtension implements ExporterExtension {

    @Override
    public void register(Registry registry) {
        registry.registerWorker("draconicevolution.DraconicEvolutionModEditor");
        registry.registerWorker("draconicevolution.MultiBlockGatherer", Priority.LOW);
        registry.registerWorker("draconicevolution.AwakenedDraconiumRecipeGatherer", Priority.LOW);
    }

}
