package org.gabbers.gablock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod(GaBlock.MODID)
public class GaBlock{
    public static final String MODID = "gablock";
public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
public static final RegistryObject<Block> SUPER_MEGA_GABLOCK = BLOCKS.register("super_mega_gablock", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
public static final RegistryObject<Item> SUPER_MEGA_GABLOCK_ITEM = ITEMS.register("super_mega_gablock", () -> new BlockItem(SUPER_MEGA_GABLOCK.get(), new Item.Properties()));
}