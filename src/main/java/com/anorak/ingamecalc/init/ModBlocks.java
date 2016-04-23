package com.anorak.ingamecalc.init;

import com.anorak.ingamecalc.block.BlockCalculator;
import com.anorak.ingamecalc.block.BlockGeneric;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    public static final Block calculator = new BlockCalculator();

    public static void init()
    {
        GameRegistry.registerBlock(calculator, "calculator");
    }
}
