package com.craftingguide.exporter.extensions.galacticraft;

import com.craftingguide.exporter.Editor;
import com.craftingguide.exporter.models.ModModel;
import com.craftingguide.exporter.models.ModPackModel;

public class GalacticraftModEditor extends Editor {
    
    public void edit(ModPackModel modPack) {
        galacticraftCoreEdit(modPack);
        galacticraftPlanetEdit(modPack);
    }
    
    public void galacticraftCoreEdit(ModPackModel modPack) {
        ModModel mod = modPack.getMod("GalacticraftCore");
        if (mod == null) return;
        
        mod.setEnabled(true);
        mod.setIconicBlock(modPack.getItem("GalacticraftCore:item.spaceship"));
    }
    
    public void galacticraftPlanetEdit(ModPackModel modPack) {
        ModModel mod = modPack.getMod("GalacticraftMars");
        if (mod == null) return;
        
        mod.setEnabled(true);
        mod.setIconicBlock(modPack.getItem("GalacticraftMars:item.spaceshipTier2"));
    }
    
}
