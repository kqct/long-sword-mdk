package in.joshl.longsword;

import in.joshl.longsword.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = LongSword.MOD_ID, name = LongSword.MODNAME, version = LongSword.MODVERSION)
public class LongSword {
    public static final String MOD_ID = "in.joshl.longSword";
    public static final String MODNAME = "Long Sword";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "in.joshl.longsword.proxy.ClientProxy", serverSide = "in.joshl.longsword.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LongSword instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
