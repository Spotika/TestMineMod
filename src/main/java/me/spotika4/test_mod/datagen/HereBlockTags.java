package me.spotika4.test_mod.datagen;

import me.spotika4.test_mod.TestMod;
import me.spotika4.test_mod.setup.Registration;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HereBlockTags extends BlockTagsProvider {

    public HereBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, TestMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.RUBY_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.RUBY_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.RUBY_ORE.get());
    }

    @Override
    public @NotNull String getName() {
        return "Test tags";
    }

}
