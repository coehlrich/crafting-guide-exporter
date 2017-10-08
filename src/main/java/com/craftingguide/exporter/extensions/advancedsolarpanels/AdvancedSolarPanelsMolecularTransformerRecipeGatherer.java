package com.craftingguide.exporter.extensions.advancedsolarpanels;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import java.util.List;
import advsolar.utils.MTRecipeManager;
import advsolar.utils.MTRecipeRecord;

public class AdvancedSolarPanelsMolecularTransformerRecipeGatherer extends Gatherer {
    
    @Override
    public void gather(ModPackModel modPack) {
        List<MTRecipeRecord> rawRecipes = MTRecipeManager.transformerRecipes;
        for (MTRecipeRecord rawRecipe : rawRecipes) {
            ItemStackModel outputStack = ItemStackModel.convert(rawRecipe.outputStack, modPack);
            ItemStackModel inputStack = ItemStackModel.convert(rawRecipe.inputStack, modPack);
            
            RecipeModel recipe = new RecipeModel(outputStack);
            recipe.setInputAt(1, 1, inputStack);
            recipe.addTool(modPack.getItem(MOLECULAR_TRANSFORMER_ID));
            
            modPack.addRecipe(recipe);
        }
    }
    
    private String MOLECULAR_TRANSFORMER_ID = "AdvancedSolarPanel:BlockMolecularTransformer";
    
}
