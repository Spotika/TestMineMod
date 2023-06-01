package me.spotika4.test_mod.datagen;

import me.spotika4.test_mod.TestMod;
import me.spotika4.test_mod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class HereBlockStates extends BlockStateProvider {
    public HereBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TestMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.RUBY_ORE.get());
    }
}
