package com.craftingguide.exporter.extensions.appliedenergistics2;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import cpw.mods.fml.common.registry.GameData;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import appeng.api.AEApi;
import appeng.api.definitions.IMaterials;
import appeng.items.misc.ItemCrystalSeed;

public class AppliedEnergistics2WaterRecipeGatherer extends Gatherer {
    
    @Override
    public void gather(ModPackModel modPack) {
        IMaterials materials = AEApi.instance().definitions().materials();
        ItemCrystalSeed crystalSeed = (ItemCrystalSeed) AEApi.instance().definitions().items().crystalSeed().maybeItem().get();
        
        RecipeModel recipe = new RecipeModel(ItemStackModel.convert(materials.purifiedCertusQuartzCrystal().maybeStack(1).get(), modPack));
        recipe.setInputAt(1, 1, ItemStackModel.convert(new ItemStack(crystalSeed, 1, crystalSeed.CERTUS), modPack));
        recipe.addTool(modPack.getItem(WATER_ID));
        modPack.addRecipe(recipe);
        
        recipe = new RecipeModel(ItemStackModel.convert(materials.purifiedNetherQuartzCrystal().maybeStack(1).get(), modPack));
        recipe.setInputAt(1, 1, ItemStackModel.convert(new ItemStack(crystalSeed, 1, crystalSeed.NETHER), modPack));
        recipe.addTool(modPack.getItem(WATER_ID));
        modPack.addRecipe(recipe);
        
        recipe = new RecipeModel(ItemStackModel.convert(materials.purifiedFluixCrystal().maybeStack(1).get(), modPack));
        recipe.setInputAt(1, 1, ItemStackModel.convert(new ItemStack(crystalSeed, 1, crystalSeed.FLUIX), modPack));
        recipe.addTool(modPack.getItem(WATER_ID));
        modPack.addRecipe(recipe);
        
        recipe = new RecipeModel(ItemStackModel.convert(materials.fluixCrystal().maybeStack(1).get(), modPack));
        recipe.setInputAt(1, 0, ItemStackModel.convert(new ItemStack(GameData.getItemRegistry().getObject("appliedenergistics2:item.ItemMultiMaterial"), 1, 1), modPack));
        recipe.setInputAt(1, 1, ItemStackModel.convert(new ItemStack(Items.quartz, 1), modPack));
        recipe.setInputAt(1, 2, ItemStackModel.convert(new ItemStack(Items.redstone, 1), modPack));
        recipe.addTool(modPack.getItem(WATER_ID));
        modPack.addRecipe(recipe);
    }
    
    private String WATER_ID = "minecraft:water";
    
}
