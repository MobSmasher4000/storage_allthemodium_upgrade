package org.zombie.storage_allthemodium_upgrade.datagen;

import com.thevortex.allthemodium.registry.ModRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;
//import org.zombie.backpack_allthemodium_upgrade.item.ModItems;
import org.zombie.storage_allthemodium_upgrade.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STORAGE_STACK_UPGRADE_TIER_6.get())
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .define('A', ModRegistry.ALLTHEMODIUM_BLOCK.get())
                .define('S', net.p3pp3rf1y.sophisticatedstorage.init.ModItems.STACK_UPGRADE_TIER_5.get())
                .unlockedBy("has_allthemodium_block",has((ItemLike) ModRegistry.ALLTHEMODIUM_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STORAGE_STACK_UPGRADE_TIER_7.get())
                .pattern("VVV")
                .pattern("VSV")
                .pattern("VVV")
                .define('V', ModRegistry.VIBRANIUM_BLOCK.get())
                .define('S', ModItems.STORAGE_STACK_UPGRADE_TIER_6.get())
                .unlockedBy("has_vibranium_block",has((ItemLike) ModRegistry.VIBRANIUM_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STORAGE_STACK_UPGRADE_TIER_8.get())
                .pattern("UUU")
                .pattern("USU")
                .pattern("UUU")
                .define('U', ModRegistry.UNOBTAINIUM_BLOCK.get())
                .define('S', ModItems.STORAGE_STACK_UPGRADE_TIER_7.get())
                .unlockedBy("has_unobtainium_block",has((ItemLike) ModRegistry.UNOBTAINIUM_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STORAGE_STACK_UPGRADE_TIER_6.get(),3)
                .pattern("PUP")
                .pattern(" P ")
                .pattern("P P")
                .define('P', Items.OAK_PLANKS)
                .define('U', org.zombie.backpack_allthemodium_upgrade.item.ModItems.STACK_UPGRADE_TIER_5.get())
                .unlockedBy("has_stack_upgrade_5",has(org.zombie.backpack_allthemodium_upgrade.item.ModItems.STACK_UPGRADE_TIER_5.get()))
                .save(recipeOutput,"backpack_stack_upgrade_5_to_storage_stack_upgrade_6");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STORAGE_STACK_UPGRADE_TIER_7.get(),3)
                .pattern("PUP")
                .pattern(" P ")
                .pattern("P P")
                .define('P', Items.OAK_PLANKS)
                .define('U', org.zombie.backpack_allthemodium_upgrade.item.ModItems.STACK_UPGRADE_TIER_6.get())
                .unlockedBy("has_stack_upgrade_6",has(org.zombie.backpack_allthemodium_upgrade.item.ModItems.STACK_UPGRADE_TIER_6.get()))
                .save(recipeOutput,"backpack_stack_upgrade_6_to_storage_stack_upgrade_7");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STORAGE_STACK_UPGRADE_TIER_8.get(),3)
                .pattern("PUP")
                .pattern(" P ")
                .pattern("P P")
                .define('P', Items.OAK_PLANKS)
                .define('U', org.zombie.backpack_allthemodium_upgrade.item.ModItems.STACK_UPGRADE_TIER_7.get())
                .unlockedBy("has_stack_upgrade_7",has(org.zombie.backpack_allthemodium_upgrade.item.ModItems.STACK_UPGRADE_TIER_7.get()))
                .save(recipeOutput,"backpack_stack_upgrade_7_to_storage_stack_upgrade_8");

    }
}
