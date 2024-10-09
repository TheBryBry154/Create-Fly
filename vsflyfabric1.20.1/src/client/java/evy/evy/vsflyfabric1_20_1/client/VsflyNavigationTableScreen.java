package evy.evy.vsflyfabric1_20_1.client;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.ScreenHandler;
public class VsflyNavigationTableScreen extends HandledScreen<VsflyNavigationTableScreenHandler> {
    private final PlayerInventory playerInventory;
    public VsflyNavigationTableScreen(VsflyNavigationTableScreenHandler handler, PlayerInventory playerInventory, Text title) {
        super(handler, playerInventory, title);
        this.playerInventory = playerInventory;
    }
    @Override
    protected void init() {
        super.init();
        // Add your widgets (buttons, labels, etc.) here
        this.addDrawableChild(ButtonWidget.builder(Text.of("Example Button"), button -> {
                    // Handle button click
                    this.onExampleButtonClick();
                })
                .dimensions(10, 10, 100, 20)
                .build());
    }
    private void onExampleButtonClick() {
        // Implement your button click logic here
        // For example, send a packet to the server or update the GUI
    }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context); // Render the background
        super.render(context, mouseX, mouseY, delta); // Render the title and widgets
        // Add additional rendering logic here, such as rendering text or additional elements
        context.drawText(this.textRenderer, "Navigation Table", this.width / 2, 20, 0xFFFFFF, true);
    }
    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        // Implement your background drawing logic here
    }
    @Override
    public void renderBackground(DrawContext context) {
        // Optionally implement your custom background rendering logic here
        // For now, you can use the default background
        super.renderBackground(context);
    }
}