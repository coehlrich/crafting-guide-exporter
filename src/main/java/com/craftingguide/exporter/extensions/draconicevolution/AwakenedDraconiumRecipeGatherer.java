package com.craftingguide.exporter.extensions.draconicevolution;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemModel;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.RecipeModel;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AwakenedDraconiumRecipeGatherer extends Gatherer {
    
    public void gather(ModPackModel modPack) {
        
        ItemModel awakenedDraconium = modPack.getItem("DraconicEvolution:draconicBlock");
        ItemModel dragonHeart = modPack.getItem("DraconicEvolution:dragonHeart");
        ItemModel draconiumBlock = modPack.getItem("DraconicEvolution:draconium:0");
        ItemModel tnt = modPack.getItem("minecraft:tnt");
        ItemModel flintAndSteel = modPack.getItem(new ItemStack(Items.flint_and_steel));
        
        for (int i = 1; i < 5; i++) {
            
            ItemStackModel awakenedDraconiumStack = new ItemStackModel(awakenedDraconium, i);
            ItemStackModel dragonHeartStack = new ItemStackModel(dragonHeart, 1);
            ItemStackModel draconiumBlockStack = new ItemStackModel(draconiumBlock, i);
            ItemStackModel tntStack = new ItemStackModel(tnt, 1);
            ItemStackModel flintandSteelStack = new ItemStackModel(flintAndSteel, 1);
            
            RecipeModel recipe = new RecipeModel(awakenedDraconiumStack);
            
            recipe.setInputAt(1, 1, dragonHeartStack);
            recipe.setInputAt(0, 2, draconiumBlockStack);
            recipe.setInputAt(2, 2, tntStack);
            recipe.setInputAt(1, 2, flintandSteelStack);
            
            recipe.setIsMadeInWorld(true);
            
            modPack.addRecipe(recipe);
            
        }
    }
    
}
