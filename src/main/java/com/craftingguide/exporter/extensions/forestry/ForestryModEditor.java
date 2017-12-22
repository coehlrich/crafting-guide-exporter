package com.craftingguide.exporter.extensions.forestry;

import com.craftingguide.exporter.Editor;
import com.craftingguide.exporter.models.ModModel;
import com.craftingguide.exporter.models.ModPackModel;

public class ForestryModEditor extends Editor {
    
    public void edit(ModPackModel modPack) {
        ModModel mod = modPack.getMod("forestry");
        if (mod == null) return;

        mod.setEnabled(true);
        mod.setIconicBlock(modPack.getItem("forestry:apiculture:2"));
    }
    
}
