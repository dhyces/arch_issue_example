package com.example;

import net.minecraft.resources.ResourceLocation;

public final class ExampleMod {
    public static final String MOD_ID = "bug_example";
    public static ResourceLocation loc(String id) {
        return new ResourceLocation(MOD_ID, id);
    }

    public static void init() {
        // Write common init code here.
    }
}
