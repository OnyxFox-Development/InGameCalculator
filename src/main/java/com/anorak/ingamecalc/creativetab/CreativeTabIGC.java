package com.anorak.ingamecalc.creativetab;

import com.anorak.ingamecalc.IGC;
import com.anorak.ingamecalc.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabIGC
{
    public static final CreativeTabs IGC_TAB = new CreativeTabs(IGC.MODID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.calculator);
        }
    };
}
