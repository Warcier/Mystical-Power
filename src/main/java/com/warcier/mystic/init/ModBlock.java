package com.warcier.mystic.init;

import com.warcier.mystic.Mystic;
import com.warcier.mystic.blocks.MistBlock;
import com.warcier.mystic.blocks.MistOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mystic.MODID);

    // Blocks
    public static final RegistryObject<Block> MIST_ORE = BLOCKS.register("mist_ore", MistOre::new);
    public static final RegistryObject<Block> MIST_BLOCK = BLOCKS.register("mist_block", MistBlock::new);

}
