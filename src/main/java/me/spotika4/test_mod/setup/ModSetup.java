package me.spotika4.test_mod.setup;

import me.spotika4.test_mod.TestMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;

public class ModSetup {

    public static void init(final FMLCommonSetupEvent event) {
    }

    public static final String TAB_NAME = "test_mod";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Registration.RUBY_ORE_ITEM.get());
        }
    };
}
