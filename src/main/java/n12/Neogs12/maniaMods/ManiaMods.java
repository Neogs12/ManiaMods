package n12.Neogs12.maniaMods;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ManiaMods.MODID, name = ManiaMods.MODNAME, version = ManiaMods.VERSION)

public class ManiaMods {

    @SidedProxy(clientSide = "n12.Neogs12.maniaMods.ClientProxy", serverSide = "n12.Neogs12.maniaMods.ServerProxy")
    public static CommonProxy proxy;

    public static final String MODID = "maniamods";
    public static final String MODNAME = "Mania Mods";
    public static final String VERSION = "1.0";

    @Instance
    public static ManiaMods instance = new ManiaMods();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        System.out.println("n12: Called PreInitializationEvent");
        this.proxy.preInit(e);

    }

    @EventHandler
    public void init(FMLInitializationEvent e){
        System.out.println("n12: Called InitializationEvent");
        this.proxy.Init(e);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
        System.out.println("n12: Called PostInitializationEvent");
        this.proxy.postInit(e);

    }



}
