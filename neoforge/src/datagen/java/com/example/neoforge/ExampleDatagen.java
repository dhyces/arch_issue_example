package com.example.neoforge;

import com.example.ExampleMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@SuppressWarnings("unused")
@Mod(ExampleMod.MOD_ID)
public class ExampleDatagen {
    public ExampleDatagen(IEventBus modBus) {
        modBus.addListener(this::setupDatagen);
    }

    private void setupDatagen(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        generator.addProvider(event.includeClient(), new ItemModelProvider(packOutput, ExampleMod.MOD_ID, event.getExistingFileHelper()) {
            @Override
            protected void registerModels() {
                singleTexture("item/test", new ResourceLocation("item/generated"), new ResourceLocation("block/stone"));
            }
        });
    }
}
