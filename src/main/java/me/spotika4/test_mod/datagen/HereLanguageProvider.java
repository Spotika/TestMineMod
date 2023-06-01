package me.spotika4.test_mod.datagen;


import me.spotika4.test_mod.TestMod;
import me.spotika4.test_mod.setup.ModSetup;
import me.spotika4.test_mod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class HereLanguageProvider extends LanguageProvider {
    public HereLanguageProvider(DataGenerator gen, String locale) {
        super(gen, TestMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + ModSetup.TAB_NAME, "Test");
        add(Registration.RUBY_ORE.get(), "Ruby ore");
        add(Registration.RUBY_ORE_ITEM.get(), "Ruby ore");
    }
}
