import org.bukkit.plugin.java.JavaPlugin;
     
    public class Plugin extends JavaPlugin {
           
            @Override
            public void onDisable() {
               System.out.println("NoSpamChat has been disabled.");
            }
     
            @Override
            public void onEnable() {
                     getServer().getPluginManager().registerEvents(new LoginListener(), this);
                     getServer().getPluginManager().registerEvents(new LeaveListener(), this);
                     getServer().getPluginManager().registerEvents(new DeathListener(), this);

            }
     
    }
