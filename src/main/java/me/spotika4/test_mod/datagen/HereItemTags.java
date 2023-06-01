package me.spotika4.test_mod.datagen;

import me.spotika4.test_mod.TestMod;
import me.spotika4.test_mod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class HereItemTags extends ItemTagsProvider {
    public HereItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, TestMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.RUBY_ORE_ITEM.get());
    }

    @Override
    public String getName() {
        return "Test tags";
    }
}
