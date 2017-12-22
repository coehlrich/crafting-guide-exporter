package com.craftingguide.exporter.extensions.enderio;

import com.craftingguide.exporter.ExporterExtension;
import com.craftingguide.exporter.Registry;
import com.craftingguide.exporter.Registry.Priority;

public class EnderIOExtension implements ExporterExtension {

    @Override
    public void register(Registry registry) {
        registry.registerWorker("enderio.EnderIOModEditor");
        registry.registerWorker("enderio.AlloySmelterRecipeGatherer", Priority.LOW);
        registry.registerWorker("enderio.SagMillRecipeGatherer", Priority.LOW);
        registry.registerWorker("enderio.SpliceAndSpliceRecipeGatherer", Priority.LOW);
        registry.registerWorker("enderio.SoulBinderRecipeGatherer", Priority.LOW);
        registry.registerWorker("enderio.VatRecipeGatherer", Priority.LOW);

    }

}
