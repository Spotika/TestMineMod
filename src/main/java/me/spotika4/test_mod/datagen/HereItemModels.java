package me.spotika4.test_mod.datagen;

import me.spotika4.test_mod.TestMod;
import me.spotika4.test_mod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class HereItemModels extends ItemModelProvider {

    public HereItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TestMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.RUBY_ORE_ITEM.getId().getPath(), modLoc("block/ruby_ore"));
    }
}
