package com.powerboat9.biobattle;

import com.powerboat9.biobattle.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "biobattle", name = "BioBattle", version = "1.0")
public class BioBattleMain {
    @SidedProxy(clientSide = "com.powerboat9.biobattle.client.ClientProxy", serverSide = "com.powerboat9.biobattle.server.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    public static void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}