package com.craftingguide.exporter.extensions.enderio;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemModel;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import java.util.ArrayList;
import java.util.List;
import net.minecraftforge.fluids.FluidStack;
import crazypants.enderio.machine.recipe.IRecipe;
import crazypants.enderio.machine.recipe.RecipeInput;
import crazypants.enderio.machine.vat.VatRecipe;
import crazypants.enderio.machine.vat.VatRecipeManager;

public class VatRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        ItemModel vat = modPack.getItem("EnderIO:blockVat");
        
        List<IRecipe> rawRecipes = VatRecipeManager.getInstance().getRecipes();
        
        for (IRecipe rawRecipe : rawRecipes) {
            
            VatRecipe recipe = (VatRecipe) rawRecipe;
            
            RecipeInput[] inputs = recipe.getInputs();
            
            ArrayList<RecipeInput> slotOne = new ArrayList<RecipeInput>();
            ArrayList<RecipeInput> slotTwo = new ArrayList<RecipeInput>();
            
            FluidStack fluid = null;
            
            for (RecipeInput input : inputs) {
                if (input.getInput() != null) {
                    if (input.getSlotNumber() == 0) {
                        slotOne.add(input);
                    } else {
                        slotTwo.add(input);
                    }
                } else {
                    fluid = input.getFluidInput();
                }
            }
            
            FluidStack rawOutput = recipe.getOutputs()[0].getFluidOutput();
            
            for (RecipeInput firstSlot : slotOne) {
                for (RecipeInput secondSlot : slotTwo) {
                    FluidStack output = rawOutput.copy();
                    
                    output.amount *= firstSlot.getMulitplier();
                    output.amount *= secondSlot.getMulitplier();
                    
                    RecipeModel recipeModel = new RecipeModel(ItemStackModel.convert(output, modPack));
                    
                    recipeModel.setInputAt(1, 1, ItemStackModel.convert(firstSlot.getInput(), modPack));
                    recipeModel.setInputAt(1, 2, ItemStackModel.convert(secondSlot.getInput(), modPack));
                    
                    recipeModel.setInputAt(1, 0, ItemStackModel.convert(fluid, modPack));
                    
                    recipeModel.addTool(vat);
                    modPack.addRecipe(recipeModel);
                }
            }
        }
    }
    
}
