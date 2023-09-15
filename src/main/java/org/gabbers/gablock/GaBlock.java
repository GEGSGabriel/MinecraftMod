package org.gabbers.gablock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("gablock")
public class GaBlock{
  public static final String MODID = "gablock";
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
  public static final RegistryObject<Item> SUPER_MEGA_GABLOCK_ITEM = ITEMS.register("super_mega_gablock", () -> new BlockItem(SUPER_MEGA_GABLOCK.get(), new Item.Properties()));

  public static void register(IEventBus eventBus){
    Block gablock = gaBlock();
    BLOCKS.register("super_mega_gablock",() ->  gablock);

    BLOCKS.register(eventBus);
    ITEMS.register(eventBus);
  }

  public static Block gaBlock() {
    BlockBehaviour.Properties props = BlockBehaviour.Properties.of();
    props.mapColor(MapColor.COLOR_ORANGE);
    Block block = new Block(props);

    return block;
  }

  public GaBlock() {
    IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    register(eventBus);
  }

}
