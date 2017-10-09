package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import java.util.Collection;
import appeng.api.AEApi;
import appeng.api.features.IInscriberRecipe;
import appeng.api.features.InscriberProcessType;

public class AppliedEnergistics2InscriberRecipeGatherer extends Gatherer {
    
    @Override
    public void gather(ModPackModel modPack) {
        Collection<IInscriberRecipe> rawRecipes = AEApi.instance().registries().inscriber().getRecipes();
        for (IInscriberRecipe rawRecipe : rawRecipes) {

            RecipeModel recipe = new RecipeModel(ItemStackModel.convert(rawRecipe.getOutput(), modPack));
            
            if (rawRecipe.getTopOptional() != null && rawRecipe.getTopOptional().isPresent()) {
                if (rawRecipe.getProcessType() == InscriberProcessType.Press) {
                    recipe.setInputAt(0, 0, ItemStackModel.convert(rawRecipe.getTopOptional().get(), modPack));    
                } else {
                    recipe.addExtra(ItemStackModel.convert(rawRecipe.getTopOptional().get(), modPack));
                }
            }
            
            recipe.setInputAt(1, 1, ItemStackModel.convert(rawRecipe.getInputs().get(0), modPack));
            
            if (rawRecipe.getBottomOptional() != null && rawRecipe.getBottomOptional().isPresent()) {
                if (rawRecipe.getProcessType() == InscriberProcessType.Press) {
                    recipe.setInputAt(0, 2, ItemStackModel.convert(rawRecipe.getBottomOptional().get(), modPack));    
                } else {
                    recipe.addExtra(ItemStackModel.convert(rawRecipe.getBottomOptional().get(), modPack));
                }
            }
            
            recipe.addTool(modPack.getItem(INSCRIBER_ID));
            
            modPack.addRecipe(recipe);
        }
    }
    
    private String INSCRIBER_ID = "appliedenergistics2:tile.BlockInscriber";
    
}
