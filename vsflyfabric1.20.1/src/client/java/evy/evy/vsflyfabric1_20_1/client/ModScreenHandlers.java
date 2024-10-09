package evy.evy.vsflyfabric1_20_1.client;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModScreenHandlers {
    public static final ScreenHandlerType<VsflyNavigationTableScreenHandler> NAVIGATION_TABLE_SCREEN_HANDLER;

    static {
        NAVIGATION_TABLE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(
                new Identifier("vsflyfabric1_20_1", "navigation_table"),
                VsflyNavigationTableScreenHandler::new
        );
    }
}
