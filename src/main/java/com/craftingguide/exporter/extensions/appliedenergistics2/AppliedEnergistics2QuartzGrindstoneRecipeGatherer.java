package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import java.util.List;
import appeng.api.AEApi;
import appeng.api.features.IGrinderEntry;

public class AppliedEnergistics2QuartzGrindstoneRecipeGatherer extends Gatherer {
    
    @Override
    public void gather(ModPackModel modPack) {
        List<IGrinderEntry> rawRecipes = AEApi.instance().registries().grinder().getRecipes();
        
        for (IGrinderEntry rawRecipe : rawRecipes) {
            
            RecipeModel recipe = new RecipeModel(ItemStackModel.convert(rawRecipe.getOutput(), modPack));
            
            recipe.addInput(ItemStackModel.convert(rawRecipe.getInput(), modPack));
            
            recipe.addTool(modPack.getItem(GRINDSTONE_ID));
            recipe.addTool(modPack.getItem(WOODEN_CRANK_ID));
            
            modPack.addRecipe(recipe);
        }
    }
    
    private String GRINDSTONE_ID = "appliedenergistics2:tile.BlockGrinder";
    
    private String WOODEN_CRANK_ID = "appliedenergistics2:tile.BlockCrank";
    
}
