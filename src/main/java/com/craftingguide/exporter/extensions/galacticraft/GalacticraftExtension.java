package com.craftingguide.exporter.extensions.galacticraft;

import com.craftingguide.exporter.ExporterExtension;
import com.craftingguide.exporter.Registry;

public class GalacticraftExtension implements ExporterExtension {

    @Override
    public void register(Registry registry) {
        registry.registerWorker("galacticraft.GalacticraftModEditor");
        

    }

}
