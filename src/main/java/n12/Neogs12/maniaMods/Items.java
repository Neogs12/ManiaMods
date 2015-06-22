package n12.Neogs12.maniaMods;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by neogs on 6/22/15.
 */
public final class Items {
    public static Item DebugItem;

    public static void createItems(){
        GameRegistry.registerItem(DebugItem = new DebugItem("debug_item"), "debug_item");

    }
}
