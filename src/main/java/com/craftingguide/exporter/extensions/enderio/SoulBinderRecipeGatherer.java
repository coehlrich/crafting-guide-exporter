package com.craftingguide.exporter.extensions.enderio;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemModel;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.Map;
import crazypants.enderio.ModObject;
import crazypants.enderio.machine.IMachineRecipe;
import crazypants.enderio.machine.MachineRecipeRegistry;
import crazypants.enderio.machine.soul.ISoulBinderRecipe;

public class SoulBinderRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        ItemModel soulBinder = modPack.getItem("EnderIO:blockSoulBinder");
        
        Map<String, IMachineRecipe> recipesMap = MachineRecipeRegistry.instance.getRecipesForMachine(ModObject.blockSoulBinder.unlocalisedName);
        
        ArrayList<ISoulBinderRecipe> recipes = new ArrayList<ISoulBinderRecipe>();
        
        for (String key : recipesMap.keySet()) {
            recipes.add((ISoulBinderRecipe) recipesMap.get(key));
        }
        
        for (ISoulBinderRecipe recipe : recipes) {
            
            ItemStack input = recipe.getInputStack();
            ItemStack output = recipe.getOutputStack();
            
            RecipeModel recipeModel = new RecipeModel(ItemStackModel.convert(output, modPack));
            
            recipeModel.setInputAt(1, 1, ItemStackModel.convert(input, modPack));
            
            recipeModel.addTool(soulBinder);
            modPack.addRecipe(recipeModel);
        }
    }
    
}
