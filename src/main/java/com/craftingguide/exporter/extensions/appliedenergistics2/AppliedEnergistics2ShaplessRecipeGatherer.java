package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.extensions.minecraft.RecipeAdapter;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import java.util.List;
import appeng.api.exceptions.MissingIngredientError;
import appeng.api.exceptions.RegistrationError;
import appeng.api.recipes.IIngredient;
import appeng.recipes.game.ShapelessRecipe;

public class AppliedEnergistics2ShaplessRecipeGatherer extends Gatherer {
    
    @Override
    public void gather(ModPackModel modPack) {
        CraftingManager craftingManager = CraftingManager.getInstance();
        List<IRecipe> recipes = (List<IRecipe>) craftingManager.getRecipeList();

        for (IRecipe rawRecipe : recipes) {
            if (rawRecipe instanceof ShapelessRecipe) {
                
                ShapelessRecipe shapelessRecipe = (ShapelessRecipe) rawRecipe;

                RecipeModel recipeModel = this.convertRecipe(modPack, shapelessRecipe);
                if (recipeModel == null) continue;

                modPack.addRecipe(recipeModel);
            }
        }
    }

    // Private Methods /////////////////////////////////////////////////////////////////////////////////////////////////

    private RecipeModel convertRecipe(ModPackModel modPack, ShapelessRecipe recipe) {
        ItemStackModel outputStack = ItemStackModel.convert(recipe.getRecipeOutput(), modPack);
        if (outputStack == null) return null;

        RecipeModel model = new RecipeModel(outputStack);

        int[] rows = { 1, 1, 0, 0, 1, 0, 2, 2, 2 };
        int[] cols = { 1, 0, 1, 0, 2, 2, 0, 1, 2 };
        int index = 0;

        for (Object ingredientObject : recipe.getInput()) {
            IIngredient ingredient = ((IIngredient) ingredientObject);
            if (!ingredient.isAir()) {
                
                ItemStackModel stackModel = null;
                try {
                    stackModel = ItemStackModel.convert(ingredient.getItemStackSet()[0], modPack);
                } catch (Exception e) {
                    
                }
                model.setInputAt(rows[index], cols[index], stackModel);
            }
            index++;
        }

        return model;
    }
    
}
