package fr.babaprog.testmod.item;

import fr.babaprog.testmod.TestMod;
import fr.babaprog.testmod.item.custom.CoalCokeItem;
import fr.babaprog.testmod.item.custom.DowsingRodItem;
import fr.babaprog.testmod.item.custom.LevitationSword;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

        // Liste d'item pour les items créés
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        TestMod.MOD_ID);

        public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
                        () -> new DowsingRodItem(
                                        new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB).durability(16)));

        public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)
                                        .food(ModFoods.CUCUMBER)));

        public static final RegistryObject<Item> COAL_COKE_ITEM = ITEMS.register("coal_coke",
                        () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
                        () -> new LevitationSword(ModTiers.CITRINE,
                                        2, 3f, new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
                        () -> new PickaxeItem(ModTiers.CITRINE,
                                        1, 1f, new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
                        () -> new ShovelItem(ModTiers.CITRINE,
                                        1, 1f, new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
                        () -> new AxeItem(ModTiers.CITRINE,
                                        1, 1f, new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_HOUE = ITEMS.register("citrine_houe",
                        () -> new HoeItem(ModTiers.CITRINE,
                                        1, 1f, new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
                        () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.HEAD,
                                        new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
                        () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.CHEST,
                                        new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings",
                        () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.LEGS,
                                        new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
                        () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.FEET,
                                        new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }

}
