package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import cpw.mods.fml.common.registry.GameData;
import net.minecraft.item.ItemStack;

public class AppliedEnergistics2ChargerRecipeGatherer extends Gatherer {
    
    @Override
    public void gather(ModPackModel modPack) {
        RecipeModel recipe = new RecipeModel(ItemStackModel.convert(new ItemStack(GameData.getItemRegistry().getObject("appliedenergistics2:item.ItemMultiMaterial"), 1, 1), modPack));
        recipe.addInput(ItemStackModel.convert(new ItemStack(GameData.getItemRegistry().getObject("appliedenergistics2:item.ItemMultiMaterial"), 1), modPack));
        
        recipe.addTool(modPack.getItem(CHARGER));
        
        modPack.addRecipe(recipe);
    }
    
    private String CHARGER = "appliedenergistics2:tile.BlockCharger";
    
}
