package evy.evy.vsflyfabric1_20_1.client;
import net.minecraft.client.util.math.MatrixStack;
public interface VsflyNavigationTableScreenC {
    void render(MatrixStack matrices, int mouseX, int mouseY, float delta);
    void renderBackground(MatrixStack matrices);
}