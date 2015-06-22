package n12.Neogs12.maniaMods;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by neogs on 6/22/15.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
        Items.createItems();

    }

    public void Init(FMLInitializationEvent e){

    }

    public void postInit(FMLPostInitializationEvent e){

    }

}
