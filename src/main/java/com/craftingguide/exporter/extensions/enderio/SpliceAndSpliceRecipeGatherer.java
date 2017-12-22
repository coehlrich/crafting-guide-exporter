package com.craftingguide.exporter.extensions.enderio;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemModel;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import net.minecraft.item.ItemStack;
import java.util.List;
import crazypants.enderio.machine.recipe.IManyToOneRecipe;
import crazypants.enderio.machine.slicensplice.SliceAndSpliceRecipeManager;

public class SpliceAndSpliceRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        ItemModel sliceAndSplice = modPack.getItem("EnderIO:blockSliceAndSplice");
        ItemModel diamondAxe = modPack.getItem("minecraft:diamond_axe");
        ItemModel shears = modPack.getItem("minecraft:shears");
        
        List<IManyToOneRecipe> recipes = SliceAndSpliceRecipeManager.getInstance().getRecipes();
        
        for (IManyToOneRecipe recipe : recipes) {
            
            List<ItemStack> inputs = recipe.getInputStacks();
            ItemStack output = recipe.getOutput();
            
            RecipeModel recipeModel = new RecipeModel(ItemStackModel.convert(output, modPack));
            
            for (ItemStack input : inputs) {
                recipeModel.setInputAt(inputs.indexOf(input) > 2 ? 1 : 0, inputs.indexOf(input) > 2 ? inputs.indexOf(input) - 3 : inputs.indexOf(input), ItemStackModel.convert(input, modPack));
            }
            
            recipeModel.addTool(sliceAndSplice);
            recipeModel.addTool(diamondAxe);
            recipeModel.addTool(shears);
            
            modPack.addRecipe(recipeModel);
        }
    }
    
}
