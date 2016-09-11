package com.craftingguide.exporter.extensions.cofh;

import com.craftingguide.exporter.ExporterExtension;
import com.craftingguide.exporter.Registry;

public class CofhExtension implements ExporterExtension {

    // ExporterExtension Overrides /////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void register(Registry registry) {
        registry.registerWorker("cofh.CofhModEditor");
        registry.registerWorker("cofh.ThermalExpansionGroupEditor");
        registry.registerWorker("cofh.ThermalFoundationGroupEditor");
    }
}