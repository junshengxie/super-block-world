package com.dayofpi.super_block_world.item;

import com.dayofpi.super_block_world.SuperBlockWorld;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SuperBlockWorld.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POWER_STAR.get())).title(Component.translatable("itemGroup.super_block_world")).displayItems((itemDisplayParameters, output) -> {
        output.accept(ModItems.TOADSTOOL_GRASS.get());
        output.accept(ModItems.TOADSTOOL_SOIL.get());
        output.accept(ModItems.COARSE_TOADSTOOL_SOIL.get());
        output.accept(ModItems.TOADSTOOL_PATH.get());
        output.accept(ModItems.BRONZE_ORE.get());
        output.accept(ModItems.RAW_BRONZE_BLOCK.get());
        output.accept(ModItems.BRONZE_BLOCK.get());
        output.accept(ModItems.BRONZE_STAIRS.get());
        output.accept(ModItems.BRONZE_SLAB.get());
        output.accept(ModItems.VANILLATE.get());
        output.accept(ModItems.VANILLATE_STAIRS.get());
        output.accept(ModItems.VANILLATE_SLAB.get());
        output.accept(ModItems.VANILLATE_WALL.get());
        output.accept(ModItems.TOPPED_VANILLATE.get());
        output.accept(ModItems.VANILLATE_CRUMBLE.get());
        output.accept(ModItems.VANILLATE_BRICKS.get());
        output.accept(ModItems.VANILLATE_BRICK_STAIRS.get());
        output.accept(ModItems.VANILLATE_BRICK_SLAB.get());
        output.accept(ModItems.VANILLATE_BRICK_WALL.get());
        output.accept(ModItems.VANILLATE_TILES.get());
        output.accept(ModItems.VANILLATE_TILE_STAIRS.get());
        output.accept(ModItems.VANILLATE_TILE_SLAB.get());
        output.accept(ModItems.VANILLATE_TILE_WALL.get());
        output.accept(ModItems.TOADSTONE.get());
        output.accept(ModItems.TOADSTONE_STAIRS.get());
        output.accept(ModItems.TOADSTONE_SLAB.get());
        output.accept(ModItems.TOADSTONE_WALL.get());
        output.accept(ModItems.TOADSTONE_BRICKS.get());
        output.accept(ModItems.TOADSTONE_BRICK_STAIRS.get());
        output.accept(ModItems.TOADSTONE_BRICK_SLAB.get());
        output.accept(ModItems.TOADSTONE_BRICK_WALL.get());
        output.accept(ModItems.SMOOTH_TOADSTONE.get());
        output.accept(ModItems.SMOOTH_TOADSTONE_STAIRS.get());
        output.accept(ModItems.SMOOTH_TOADSTONE_SLAB.get());
        output.accept(ModItems.HARDSTONE.get());
        output.accept(ModItems.HARDSTONE_STAIRS.get());
        output.accept(ModItems.HARDSTONE_SLAB.get());
        output.accept(ModItems.HARDSTONE_WALL.get());
        output.accept(ModItems.HARDSTONE_BRICKS.get());
        output.accept(ModItems.CRACKED_HARDSTONE_BRICKS.get());
        output.accept(ModItems.HARDSTONE_BRICK_STAIRS.get());
        output.accept(ModItems.HARDSTONE_BRICK_SLAB.get());
        output.accept(ModItems.HARDSTONE_BRICK_WALL.get());
        output.accept(ModItems.SMOOTH_HARDSTONE.get());
        output.accept(ModItems.SMOOTH_HARDSTONE_STAIRS.get());
        output.accept(ModItems.SMOOTH_HARDSTONE_SLAB.get());
        output.accept(ModItems.PACKED_CLOUD.get());
        output.accept(ModItems.CLOUD_STAIRS.get());
        output.accept(ModItems.CLOUD_SLAB.get());
        output.accept(ModItems.MOON_ROCK.get());
        output.accept(ModItems.RAINBOW_TILES.get());
        output.accept(ModItems.RAINBOW_TILE_STAIRS.get());
        output.accept(ModItems.RAINBOW_TILE_SLAB.get());
        output.accept(ModItems.RAINBOW_TILE_WALL.get());
        output.accept(ModItems.STAR_CLUSTER.get());
        output.accept(ModItems.AMANITA_LOG.get());
        output.accept(ModItems.AMANITA_WOOD.get());
        output.accept(ModItems.STRIPPED_AMANITA_LOG.get());
        output.accept(ModItems.STRIPPED_AMANITA_WOOD.get());
        output.accept(ModItems.AMANITA_PLANKS.get());
        output.accept(ModItems.AMANITA_STAIRS.get());
        output.accept(ModItems.AMANITA_SLAB.get());
        output.accept(ModItems.AMANITA_SIGN.get());
        output.accept(ModItems.AMANITA_HANGING_SIGN.get());
        output.accept(ModItems.AMANITA_LEAVES.get());
        output.accept(ModItems.FRUITING_AMANITA_LEAVES.get());
        output.accept(ModItems.AMANITA_SAPLING.get());
        output.accept(ModItems.WHITE_FLOWERBED.get());
        output.accept(ModItems.YELLOW_FLOWERBED.get());
        output.accept(ModItems.WHITE_BRONZE.get());
        output.accept(ModItems.LIGHT_GRAY_BRONZE.get());
        output.accept(ModItems.GRAY_BRONZE.get());
        output.accept(ModItems.BLACK_BRONZE.get());
        output.accept(ModItems.BROWN_BRONZE.get());
        output.accept(ModItems.RED_BRONZE.get());
        output.accept(ModItems.ORANGE_BRONZE.get());
        output.accept(ModItems.YELLOW_BRONZE.get());
        output.accept(ModItems.LIME_BRONZE.get());
        output.accept(ModItems.GREEN_BRONZE.get());
        output.accept(ModItems.CYAN_BRONZE.get());
        output.accept(ModItems.LIGHT_BLUE_BRONZE.get());
        output.accept(ModItems.BLUE_BRONZE.get());
        output.accept(ModItems.PURPLE_BRONZE.get());
        output.accept(ModItems.MAGENTA_BRONZE.get());
        output.accept(ModItems.PINK_BRONZE.get());
        output.accept(ModItems.WHITE_WARP_PIPE.get());
        output.accept(ModItems.LIGHT_GRAY_WARP_PIPE.get());
        output.accept(ModItems.GRAY_WARP_PIPE.get());
        output.accept(ModItems.BLACK_WARP_PIPE.get());
        output.accept(ModItems.BROWN_WARP_PIPE.get());
        output.accept(ModItems.RED_WARP_PIPE.get());
        output.accept(ModItems.ORANGE_WARP_PIPE.get());
        output.accept(ModItems.YELLOW_WARP_PIPE.get());
        output.accept(ModItems.LIME_WARP_PIPE.get());
        output.accept(ModItems.GREEN_WARP_PIPE.get());
        output.accept(ModItems.CYAN_WARP_PIPE.get());
        output.accept(ModItems.LIGHT_BLUE_WARP_PIPE.get());
        output.accept(ModItems.BLUE_WARP_PIPE.get());
        output.accept(ModItems.PURPLE_WARP_PIPE.get());
        output.accept(ModItems.MAGENTA_WARP_PIPE.get());
        output.accept(ModItems.PINK_WARP_PIPE.get());
        output.accept(ModItems.WHITE_PIPE_BODY.get());
        output.accept(ModItems.LIGHT_GRAY_PIPE_BODY.get());
        output.accept(ModItems.GRAY_PIPE_BODY.get());
        output.accept(ModItems.BLACK_PIPE_BODY.get());
        output.accept(ModItems.BROWN_PIPE_BODY.get());
        output.accept(ModItems.RED_PIPE_BODY.get());
        output.accept(ModItems.ORANGE_PIPE_BODY.get());
        output.accept(ModItems.YELLOW_PIPE_BODY.get());
        output.accept(ModItems.LIME_PIPE_BODY.get());
        output.accept(ModItems.GREEN_PIPE_BODY.get());
        output.accept(ModItems.CYAN_PIPE_BODY.get());
        output.accept(ModItems.LIGHT_BLUE_PIPE_BODY.get());
        output.accept(ModItems.BLUE_PIPE_BODY.get());
        output.accept(ModItems.PURPLE_PIPE_BODY.get());
        output.accept(ModItems.MAGENTA_PIPE_BODY.get());
        output.accept(ModItems.PINK_PIPE_BODY.get());
        output.accept(ModItems.WHITE_FLAG.get());
        output.accept(ModItems.LIGHT_GRAY_FLAG.get());
        output.accept(ModItems.GRAY_FLAG.get());
        output.accept(ModItems.BLACK_FLAG.get());
        output.accept(ModItems.BROWN_FLAG.get());
        output.accept(ModItems.RED_FLAG.get());
        output.accept(ModItems.ORANGE_FLAG.get());
        output.accept(ModItems.YELLOW_FLAG.get());
        output.accept(ModItems.LIME_FLAG.get());
        output.accept(ModItems.GREEN_FLAG.get());
        output.accept(ModItems.CYAN_FLAG.get());
        output.accept(ModItems.LIGHT_BLUE_FLAG.get());
        output.accept(ModItems.BLUE_FLAG.get());
        output.accept(ModItems.PURPLE_FLAG.get());
        output.accept(ModItems.MAGENTA_FLAG.get());
        output.accept(ModItems.PINK_FLAG.get());
        output.accept(ModItems.RAINBOW_FLAG.get());
        output.accept(ModItems.FLAGPOLE.get());
        output.accept(ModItems.WARP_PAINTING.get());
        output.accept(ModItems.WARP_LINK.get());
        output.accept(ModItems.AMANITA_BOAT.get());
        output.accept(ModItems.AMANITA_CHEST_BOAT.get());
        output.accept(ModItems.SHY_GUY_MASK.get());
        output.accept(ModItems.HAMMER.get());
        output.accept(ModItems.SUPER_PICKAXE.get());
        output.accept(ModItems.YOSHI_FRUIT.get());
        output.accept(ModItems.YOSHI_COOKIE.get());
        output.accept(ModItems.RAW_BRONZE.get());
        output.accept(ModItems.BRONZE_INGOT.get());
        output.accept(ModItems.POWER_STAR.get());
        output.accept(ModItems.POWER_SHARD.get());
        output.accept(ModItems.YELLOW_STAR_BIT.get());
        output.accept(ModItems.GREEN_STAR_BIT.get());
        output.accept(ModItems.BLUE_STAR_BIT.get());
        output.accept(ModItems.PURPLE_STAR_BIT.get());
        output.accept(ModItems.SUBCON_THREAD.get());
        output.accept(ModItems.SHY_GUY_SPAWN_EGG.get());
    }).build());
}
