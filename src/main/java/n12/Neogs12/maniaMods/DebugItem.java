package n12.Neogs12.maniaMods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by neogs on 6/22/15.
 */
public class DebugItem extends Item {
    public DebugItem(String unlocalizedName){
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
