package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.Editor;
import com.craftingguide.exporter.models.ModModel;
import com.craftingguide.exporter.models.ModPackModel;

public class AppliedEnergistics2ModEditor extends Editor {
    
    @Override
    public void edit(ModPackModel modPack) {
        ModModel mod = modPack.getMod("appliedenergistics2");
        if (mod == null) return;

        mod.setEnabled(true);
        mod.setIconicBlock(modPack.getItem("appliedenergistics2:tile.OreQuartz"));
    }
    
}
