package com.anorak.ingamecalc;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = IGC.MODNAME, modid = IGC.MODID, version = IGC.VERSION)
public class IGC {
    public static final String MODNAME = "In Game Calculator";
    public static final String MODID = "ingamecalc";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance(MODID)
    public IGC instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
