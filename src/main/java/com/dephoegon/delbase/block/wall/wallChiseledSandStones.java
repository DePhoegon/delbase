package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.chiseledSandStoneWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CHISELED_SANDSTONE;

public class wallChiseledSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> OVERRIDE_CHISELED_SAND_STONE_WALL = register("chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> OVERRIDE_RED_CHISELED_SAND_STONE_WALL = register("red_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLOOD_CHISELED_SAND_STONE_WALL = register("blood_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> WHITE_CHISELED_SAND_STONE_WALL = register("white_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> ORANGE_CHISELED_SAND_STONE_WALL = register("orange_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> MAGENTA_CHISELED_SAND_STONE_WALL = register("magenta_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_CHISELED_SAND_STONE_WALL = register("light_blue_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> YELLOW_CHISELED_SAND_STONE_WALL = register("yellow_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIME_CHISELED_SAND_STONE_WALL = register("lime_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> PINK_CHISELED_SAND_STONE_WALL = register("pink_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> GRAY_CHISELED_SAND_STONE_WALL = register("gray_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_CHISELED_SAND_STONE_WALL = register("light_gray_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> CYAN_CHISELED_SAND_STONE_WALL = register("cyan_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> PURPLE_CHISELED_SAND_STONE_WALL = register("purple_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLUE_CHISELED_SAND_STONE_WALL = register("blue_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> GREEN_CHISELED_SAND_STONE_WALL = register("green_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BROWN_CHISELED_SAND_STONE_WALL = register("brown_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLACK_CHISELED_SAND_STONE_WALL = register("black_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));

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
