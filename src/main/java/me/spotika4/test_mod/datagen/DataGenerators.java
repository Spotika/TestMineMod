package me.spotika4.test_mod.datagen;

import me.spotika4.test_mod.TestMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;


@Mod.EventBusSubscriber(modid = TestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new HereRecipes(generator));
            generator.addProvider(new HereLootTables(generator));
            HereBlockTags blockTags = new HereBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new HereItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new HereBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new HereItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new HereLanguageProvider(generator, "en_us"));
        }
    }
}

