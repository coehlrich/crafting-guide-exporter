package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import java.util.List;
import appeng.api.recipes.IIngredient;
import appeng.recipes.game.ShapedRecipe;

public class AppliedEnergistics2ShapedRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        CraftingManager craftingManager = CraftingManager.getInstance();
        List<IRecipe> recipes = (List<IRecipe>) craftingManager.getRecipeList();

        for (IRecipe rawRecipe : recipes) {
            if (rawRecipe instanceof ShapedRecipe) {

                ShapedRecipe shapedRecipe = (ShapedRecipe) rawRecipe;
                
                RecipeModel recipeModel = this.convertRecipe(modPack, shapedRecipe);
                if (recipeModel == null) continue;

                modPack.addRecipe(recipeModel);
            }
        }
    }

    // Private Methods /////////////////////////////////////////////////////////////////////////////////////////////////

    private RecipeModel convertRecipe(ModPackModel modPack, ShapedRecipe recipe) {
        ItemStackModel output = ItemStackModel.convert(recipe.getRecipeOutput(), modPack);
        if (output == null) return null;

        RecipeModel model = new RecipeModel(output);

        // The following has been borrowed from AlgorithmX2 AE2 code at http://bit.ly/2g4dFbB
        // BEGIN AE2
        
        for (int x = 0; x < recipe.getWidth(); x++) {
            for (int y = 0; y < recipe.getHeight(); y++) {
                Object itemStackObject = recipe.getIngredients()[y * recipe.getWidth() + x];
                if (itemStackObject != null) {
                    
                    //END AE2
                    
                    IIngredient itemStackIngredient = (IIngredient) itemStackObject;
                    if (!itemStackIngredient.isAir()) {
                        ItemStack itemStack = null;
                        try {
                            itemStack = itemStackIngredient.getItemStackSet()[0];
                        } catch (Exception e) {
                            
                        }
                        ItemStackModel itemStackModel = ItemStackModel.convert(itemStack, modPack);
                        if (itemStackModel != null) {
                            itemStackModel.setQuantity(1);

                            model.setInputAt(y, x, itemStackModel);
                        }
                    }
                }
            }
        }

        return model;
    }
    
}
