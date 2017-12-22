package com.craftingguide.exporter.extensions.enderio;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemModel;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import net.minecraft.item.ItemStack;
import java.util.List;
import crazypants.enderio.machine.alloy.AlloyRecipeManager;
import crazypants.enderio.machine.recipe.IManyToOneRecipe;

public class AlloySmelterRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        ItemModel alloySmelter = modPack.getItem("EnderIO:blockAlloySmelter");
        
        List<IManyToOneRecipe> recipes = AlloyRecipeManager.getInstance().getRecipes();
        
        for (IManyToOneRecipe recipe : recipes) {
            
            List<ItemStack> inputs = recipe.getInputStacks();
            ItemStack output = recipe.getOutput();
            
            RecipeModel recipeModel = new RecipeModel(ItemStackModel.convert(output, modPack));
            
            for (ItemStack input : inputs) {
                recipeModel.setInputAt(0, inputs.indexOf(input), ItemStackModel.convert(input, modPack));
            }
            
            recipeModel.addTool(alloySmelter);
            modPack.addRecipe(recipeModel);
        }
    }
    
}
