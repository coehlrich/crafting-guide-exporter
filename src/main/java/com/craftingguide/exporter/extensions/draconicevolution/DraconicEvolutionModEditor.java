package com.craftingguide.exporter.extensions.draconicevolution;

import com.craftingguide.exporter.Editor;
import com.craftingguide.exporter.models.ModModel;
import com.craftingguide.exporter.models.ModPackModel;

public class DraconicEvolutionModEditor extends Editor {
    
    @Override
    public void edit(ModPackModel modPack) {
        ModModel mod = modPack.getMod("DraconicEvolution");
        if (mod == null) return;

        mod.setEnabled(true);
        mod.setIconicBlock(modPack.getItem("DraconicEvolution:draconicBlock"));
    }
    
}
