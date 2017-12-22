package com.craftingguide.exporter.extensions.forestry;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Set;
import forestry.api.recipes.ICarpenterRecipe;
import forestry.api.recipes.IDescriptiveRecipe;
import forestry.factory.recipes.CarpenterRecipeManager;

public class CarpenterRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        Set<ICarpenterRecipe> rawRecipes = new CarpenterRecipeManager().recipes();
        
        for (ICarpenterRecipe rawRecipe : rawRecipes) {
            IDescriptiveRecipe craftingGridRecipe = rawRecipe.getCraftingGridRecipe();
            
            ItemStack output = craftingGridRecipe.getRecipeOutput();
            
            RecipeModel recipe = new RecipeModel(ItemStackModel.convert(output, modPack));
            
            for (int x = 0; x < craftingGridRecipe.getWidth(); x ++) {
                for (int y = 0; y < craftingGridRecipe.getHeight(); x++) {
                    Object rawIngrediant = craftingGridRecipe.getIngredients()[y * 3 + x];
                    
                    ItemStack ingrediant = null;
                    
                    if (rawIngrediant instanceof ItemStack) {
                        ingrediant = (ItemStack) rawIngrediant;
                    } else if (rawIngrediant instanceof ItemStack[]) {
                        ingrediant = ((ItemStack[]) rawIngrediant)[0];
                    } else if (rawIngrediant instanceof List<?>) {
                        ingrediant = ((List<ItemStack>) rawIngrediant).get(0);
                    }
                    
                    recipe.setInputAt(y, x, ItemStackModel.convert(ingrediant, modPack));
                }
            }
        }
    }
    
}
