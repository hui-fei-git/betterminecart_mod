package hui_fei.betterminecartmod.item;

import hui_fei.betterminecartmod.BetterMinecartMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MINECART_CORE = registerItems("minecart_core",new Item(new Item.Settings()));

    private static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BetterMinecartMod.MOD_ID,id), item);//物品注册
    }
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(MINECART_CORE);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);//物品加入到原版物品栏（原材料栏）
        BetterMinecartMod.LOGGER.info("Registering Items");//打印日志
    }
}
