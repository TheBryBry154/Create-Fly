package evy.evy.vsflyfabric1_20_1.client;
import evy.evy.vsflyfabric1_20_1.client.ModScreenHandlers;
import evy.evy.vsflyfabric1_20_1.VsflyNavigationTableScreenHandlerA;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
public class VsflyNavigationTableScreenHandler extends ScreenHandler implements VsflyNavigationTableScreenHandlerA {
    public VsflyNavigationTableScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.NAVIGATION_TABLE_SCREEN_HANDLER, syncId);
        // Add slots and any necessary initialization here
        // For example:
        // this.addSlot(new Slot(...));
    }
    @Override
    public boolean canUse(PlayerInventory playerInventory) {
        return true; // Add your logic to determine if the player can use this screen handler
    }
    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }
    @Override
    public boolean canUse(PlayerEntity player) {
        return false;
    }
}