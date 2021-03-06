package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.cutSandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class stairCutSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> CUT_SAND_STONE_STAIR = register("cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> RED_CUT_SAND_STONE_STAIR = register("red_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BLOOD_CUT_SAND_STONE_STAIR = register("blood_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> WHITE_CUT_SAND_STONE_STAIR = register("white_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> ORANGE_CUT_SAND_STONE_STAIR = register("orange_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> MAGENTA_CUT_SAND_STONE_STAIR = register("magenta_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_CUT_SAND_STONE_STAIR = register("light_blue_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> YELLOW_CUT_SAND_STONE_STAIR = register("yellow_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> LIME_CUT_SAND_STONE_STAIR = register("lime_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> PINK_CUT_SAND_STONE_STAIR = register("pink_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> GRAY_CUT_SAND_STONE_STAIR = register("gray_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_CUT_SAND_STONE_STAIR = register("light_gray_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> CYAN_CUT_SAND_STONE_STAIR = register("cyan_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> PURPLE_CUT_SAND_STONE_STAIR = register("purple_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BLUE_CUT_SAND_STONE_STAIR = register("blue_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> GREEN_CUT_SAND_STONE_STAIR = register("green_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BROWN_CUT_SAND_STONE_STAIR = register("brown_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BLACK_CUT_SAND_STONE_STAIR = register("black_cut_sand_stone_stair",
            () -> new cutSandStoneStair("","",""));
    
    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
