package com.craftingguide.exporter.extensions.enderio;

import com.craftingguide.exporter.Editor;
import com.craftingguide.exporter.models.ModModel;
import com.craftingguide.exporter.models.ModPackModel;

public class EnderIOModEditor extends Editor {
    
    @Override
    public void edit(ModPackModel modPack) {
        ModModel mod = modPack.getMod("EnderIO");
        if (mod == null) 
            return;
        
        mod.setEnabled(true);
        mod.setIconicBlock(modPack.getItem("EnderIO:blockAlloySmelter"));
        
    }
    
}
