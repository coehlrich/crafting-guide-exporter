package com.craftingguide.exporter.extensions.advancedsolarpanels;

import com.craftingguide.exporter.Editor;
import com.craftingguide.exporter.models.ModModel;
import com.craftingguide.exporter.models.ModPackModel;

public class AdvancedSolarPanelsModEditor extends Editor {
    
    public void edit(ModPackModel modPack) {
        ModModel mod = modPack.getMod("AdvancedSolarPanel");
        if (mod == null) return;

        mod.setEnabled(true);
        mod.setIconicBlock(modPack.getItem("AdvancedSolarPanel:BlockAdvSolarPanel"));
        mod.setUrl("https://minecraft.curseforge.com/projects/advanced-solar-panels");
    }
    
}
