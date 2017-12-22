package com.craftingguide.exporter.extensions.enderio;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemModel;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import crazypants.enderio.machine.crusher.CrusherRecipeManager;
import crazypants.enderio.machine.recipe.Recipe;
import crazypants.enderio.machine.recipe.RecipeOutput;

public class SagMillRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        ItemModel sagMill = modPack.getItem("EnderIO:blockSagMill");
        
        List<Recipe> recipes = CrusherRecipeManager.getInstance().getRecipes();
        
        for (Recipe recipe : recipes) {
            
            ArrayList<RecipeOutput> outputs = new ArrayList<RecipeOutput>();
            for (RecipeOutput output : recipe.getOutputs()) {
                outputs.add(output);
            }
            
            Iterator<RecipeOutput> outputsIterator = outputs.iterator();
            
            RecipeModel recipeModel = new RecipeModel(ItemStackModel.convert(outputsIterator.next().getOutput(), modPack));
            
            while (outputsIterator.hasNext()) {
                RecipeOutput output = outputsIterator.next();
                recipeModel.addExtra(ItemStackModel.convert(output.getOutput(), modPack));
            }
            
            recipeModel.setInputAt(1, 1, (ItemStackModel.convert(recipe.getInputs()[0].getInput(), modPack)));
            
            recipeModel.addTool(sagMill);
            modPack.addRecipe(recipeModel);
        }
    }
    
}
