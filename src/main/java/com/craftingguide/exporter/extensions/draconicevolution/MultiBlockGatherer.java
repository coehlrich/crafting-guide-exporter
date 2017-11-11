package com.craftingguide.exporter.extensions.draconicevolution;

import com.craftingguide.exporter.Gatherer;
import com.craftingguide.exporter.models.ItemModel;
import com.craftingguide.exporter.models.ItemStackModel;
import com.craftingguide.exporter.models.ModPackModel;
import com.craftingguide.exporter.models.MultiblockRecipe;

public class MultiBlockGatherer extends Gatherer {
    
    @Override
    public void gather(ModPackModel modPack) {
        reactor(modPack);
        energyStorage(modPack);
        resurrectionRitual(modPack);
    }
    
    private static String REACTOR_CORE_ID = "DraconicEvolution:reactorCore";
    
    private static String REACTOR_STABILIZER_ID = "DraconicEvolution:reactorStabilizer";
    
    private static String REACTOR_ENERGY_INJECTOR_ID = "DraconicEvolution:reactorEnergyInjector";
    
    private static String ENERGY_CORE_ID = "DraconicEvolution:energyStorageCore";
    
    private static String PARTICLE_GENERATOR_ID = "DraconicEvolution:particleGenerator";
    
    private static String REDSTONE_BLOCK_ID = "minecraft:redstone_block";
    
    private static String DRACONIUM_BLOCK_ID = "DraconicEvolution:draconium";
    
    private static ItemStackModel z = null;
    
    private static String GLOWSTONE_BLOCK_ID = "minecraft:glowstone";
    
    private static String OBSIDIAN_ID = "minecraft:obsidian";
    
    private static String DIAMOND_BLOCK_ID = "minecraft:diamond_block";
    
    private static String RESURRECTION_STONE_ID = "DraconicEvolution:draconium:1";
    
    private static String PILLAR_QUARTZ_BLOCK_ID = "minecraft:quartz_block:2";
    
    private static String CHARGED_DRACONIUM_BLOCK_ID = "DraconicEvolution:draconium:2";
    
    private void reactor(ModPackModel modPack) {
        ItemModel reactor = new ItemModel("DraconicEvolution:reactor", "Draconic Reactor");
        
        ItemStackModel a = new ItemStackModel(modPack.getItem(REACTOR_CORE_ID), 1);
        ItemStackModel b = new ItemStackModel(modPack.getItem(REACTOR_STABILIZER_ID), 1);
        ItemStackModel c = new ItemStackModel(modPack.getItem(REACTOR_ENERGY_INJECTOR_ID), 1);
        
        MultiblockRecipe recipe = new MultiblockRecipe();
            
        recipe.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, c, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, b, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {b, z, z, z, z, a, z, z, z, z, b},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, b, z, z, z, z, z} } });
        
        reactor.setMultiblock(recipe);
        modPack.addItem(reactor);
    }
    
    //Had to put these in different functions because of the 65535 byte limit.
    private void energyStorage(ModPackModel modPack) {
        ItemStackModel a = new ItemStackModel(modPack.getItem(ENERGY_CORE_ID), 1);
        ItemStackModel b = new ItemStackModel(modPack.getItem(PARTICLE_GENERATOR_ID), 1);
        ItemStackModel c = new ItemStackModel(modPack.getItem(REDSTONE_BLOCK_ID), 1);
        ItemStackModel d = new ItemStackModel(modPack.getItem(DRACONIUM_BLOCK_ID), 1);
        
        tier1(modPack, a, b, c, d);
        
        tier2(modPack, a, b, c, d);
        
        tier3(modPack, a, b, c, d);
        
        tier4(modPack, a, b, c, d);
        
        tier5(modPack, a, b, c, d);
        
        tier6(modPack, a, b, c, d);
        
        tier7(modPack, a, b, c, d);
                    
    }
    
    private void tier1(ModPackModel modPack, ItemStackModel a, ItemStackModel b, ItemStackModel c, ItemStackModel d) {
        ItemModel energyStorageMultiBlockTier1 = new ItemModel("DraconicEvolution:energystorage:1", "Draconic Energy Storage Tier 1");
        
        MultiblockRecipe recipeTier1 = new MultiblockRecipe();
            
        recipeTier1.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {b, z, z, z, z, z, z, z, a, z, z, z, z, z, z, z, b},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z} } });
        
        energyStorageMultiBlockTier1.setMultiblock(recipeTier1);
        
        modPack.addItem(energyStorageMultiBlockTier1);
    }
    
    private void tier2(ModPackModel modPack, ItemStackModel a, ItemStackModel b, ItemStackModel c, ItemStackModel d) {
        ItemModel energyStorageMultiBlockTier2 = new ItemModel("DraconicEvolution:energystorage:2", "Draconic Energy Storage Tier 2");
        
        MultiblockRecipe recipeTier2 = new MultiblockRecipe();
            
        recipeTier2.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, d, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, d, z, z, z, z, z, z, z, z},
                    {b, z, z, z, z, z, z, d, a, d, z, z, z, z, z, z, b},
                    {z, z, z, z, z, z, z, z, d, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, d, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} } });
        
        energyStorageMultiBlockTier2.setMultiblock(recipeTier2);
        
        modPack.addItem(energyStorageMultiBlockTier2);
    }
    
    private void tier3(ModPackModel modPack, ItemStackModel a, ItemStackModel b, ItemStackModel c, ItemStackModel d) {
        ItemModel energyStorageMultiBlockTier3 = new ItemModel("DraconicEvolution:energystorage:3", "Draconic Energy Storage Tier 3");
        
        MultiblockRecipe recipeTier3 = new MultiblockRecipe();
            
        recipeTier3.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {b, z, z, z, z, z, z, d, a, d, z, z, z, z, z, z, b},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} } });
        
        energyStorageMultiBlockTier3.setMultiblock(recipeTier3);
        
        modPack.addItem(energyStorageMultiBlockTier3);
    }
    
    private void tier4(ModPackModel modPack, ItemStackModel a, ItemStackModel b, ItemStackModel c, ItemStackModel d) {
        ItemModel energyStorageMultiBlockTier4 = new ItemModel("DraconicEvolution:energystorage:4", "Draconic Energy Storage Tier 4");
        
        MultiblockRecipe recipeTier4 = new MultiblockRecipe();
            
        recipeTier4.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {b, z, z, z, z, z, d, c, a, c, d, z, z, z, z, z, b},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} } });
        
        energyStorageMultiBlockTier4.setMultiblock(recipeTier4);
        
        modPack.addItem(energyStorageMultiBlockTier4);
    }
    
    private void tier5(ModPackModel modPack, ItemStackModel a, ItemStackModel b, ItemStackModel c, ItemStackModel d) {
        ItemModel energyStorageMultiBlockTier5 = new ItemModel("DraconicEvolution:energystorage:5", "Draconic Energy Storage Tier 5");
        
        MultiblockRecipe recipeTier5 = new MultiblockRecipe();
            
        recipeTier5.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {b, z, z, z, z, d, c, c, a, c, c, d, z, z, z, z, b},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} }, 
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} } });
        
        energyStorageMultiBlockTier5.setMultiblock(recipeTier5);
        modPack.addItem(energyStorageMultiBlockTier5);
    }
    
    private void tier6(ModPackModel modPack, ItemStackModel a, ItemStackModel b, ItemStackModel c, ItemStackModel d) {
        ItemModel energyStorageMultiBlockTier6 = new ItemModel("DraconicEvolution:energystorage:6", "Draconic Energy Storage Tier 6");
        
        MultiblockRecipe recipeTier6 = new MultiblockRecipe();
            
        recipeTier6.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {b, z, z, z, d, c, c, c, a, c, c, c, d, z, z, z, b},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} }, 
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} } });
        
        energyStorageMultiBlockTier6.setMultiblock(recipeTier6);
        
        modPack.addItem(energyStorageMultiBlockTier6);
    }
    
    private void tier7(ModPackModel modPack, ItemStackModel a, ItemStackModel b, ItemStackModel c, ItemStackModel d) {
        ItemModel energyStorageMultiBlockTier7 = new ItemModel("DraconicEvolution:energystorage:7", "Draconic Energy Storage Tier 7");
        
        MultiblockRecipe recipeTier7 = new MultiblockRecipe();
        
        recipeTier7.setItemStacks(new ItemStackModel[][][] 
            {
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, d, d, d, d, d, d, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, d, d, d, d, d, d, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {b, z, z, d, c, c, c, c, a, c, c, c, c, d, z, z, b},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, b, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {z, z, z, d, c, c, c, c, c, c, c, c, c, d, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, d, c, c, c, c, c, c, c, d, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} }, 
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, d, d, d, d, d, d, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, c, c, c, c, c, d, z, z, z, z, z},
                    {z, z, z, z, z, d, d, d, d, d, d, d, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, c, c, c, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, d, d, d, d, d, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} }, 
                {
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, d, d, d, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z, z} }, });
        
        energyStorageMultiBlockTier7.setMultiblock(recipeTier7);
        
        modPack.addItem(energyStorageMultiBlockTier7);
    }
    
    private void resurrectionRitual(ModPackModel modPack) {
        ItemModel resurrectionRitualModel = new ItemModel("DraconicEvolution:resurrection_ritual", "Draconic Resurrection Ritual");
        
        ItemStackModel a = new ItemStackModel(modPack.getItem(RESURRECTION_STONE_ID), 1);
        ItemStackModel b = new ItemStackModel(modPack.getItem(GLOWSTONE_BLOCK_ID), 1);
        ItemStackModel c = new ItemStackModel(modPack.getItem(OBSIDIAN_ID), 1);
        ItemStackModel d = new ItemStackModel(modPack.getItem(PILLAR_QUARTZ_BLOCK_ID), 1);
        ItemStackModel e = new ItemStackModel(modPack.getItem(DIAMOND_BLOCK_ID), 1);
        ItemStackModel f = new ItemStackModel(modPack.getItem(CHARGED_DRACONIUM_BLOCK_ID), 1);
        
        MultiblockRecipe recipe = new MultiblockRecipe();
        
        recipe.setItemStacks(new ItemStackModel[][][]
            {   
                {
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, b, c, b, z, z, z},
                    {z, z, z, c, a, c, z, z, z},
                    {z, z, z, b, c, b, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z} },
                {
                    {z, z, z, z, d, z, z, z, z},
                    {z, d, z, z, z, z, z, d, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {d, z, z, z, z, z, z, z, d},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, d, z, z, z, z, z, d, z},
                    {z, z, z, z, d, z, z, z, z} },
                {
                    {z, z, z, z, e, z, z, z, z},
                    {z, d, z, z, z, z, z, d, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {e, z, z, z, z, z, z, z, e},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, d, z, z, z, z, z, d, z},
                    {z, z, z, z, e, z, z, z, z} },
                {
                    {z, z, z, z, z, z, z, z, z},
                    {z, f, z, z, z, z, z, f, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, z, z, z, z, z, z, z, z},
                    {z, f, z, z, z, z, z, f, z},
                    {z, z, z, z, z, z, z, z, z} } });
        resurrectionRitualModel.setMultiblock(recipe);
        
        modPack.addItem(resurrectionRitualModel);
    }
    
}
