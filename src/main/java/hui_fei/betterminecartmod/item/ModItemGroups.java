package hui_fei.betterminecartmod.item;

import hui_fei.betterminecartmod.BetterMinecartMod;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETTERMINECART_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(BetterMinecartMod.MOD_ID,"betterminecart_group"),
            ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.betterminecart_group"))
                    .icon(() -> new ItemStack(ModItems.MINECART_CORE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MINECART_CORE);//向物品栏添加物品
                        entries.add(Blocks.CONDUIT);
                        entries.add(Items.DIAMOND);
                    }).build());
    public static void registerModItemGroups(){
        BetterMinecartMod.LOGGER.info("Registering Item Group");
    }
}
