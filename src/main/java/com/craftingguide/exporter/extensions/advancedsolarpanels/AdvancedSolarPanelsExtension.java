package com.craftingguide.exporter.extensions.advancedsolarpanels;

import com.craftingguide.exporter.ExporterExtension;
import com.craftingguide.exporter.Registry;

public class AdvancedSolarPanelsExtension implements ExporterExtension {

    @Override
    public void register(Registry registry) {
        registry.registerWorker("advancedsolarpanels.AdvancedSolarPanelsModEditor");
        registry.registerWorker("advancedsolarpanels.AdvancedSolarPanelsMolecularTransformerRecipeGatherer");
    }

}
