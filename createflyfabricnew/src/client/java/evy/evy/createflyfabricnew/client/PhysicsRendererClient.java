package evy.evy.createflyfabricnew.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class PhysicsRendererClient {
    public static void renderPhysicsObjects(WorldRenderContext context) {
        MatrixStack matrices = context.matrixStack();
        VertexConsumerProvider vertexConsumers = context.consumers();
        ClientWorld world = context.world();
        BlockRenderManager blockRenderManager = MinecraftClient.getInstance().getBlockRenderManager();

        for (PhysicsEngine.PhysicsObject object : PhysicsEngine.getPhysicsObjects()) {
            matrices.push();
            matrices.translate(
                    object.getX() - context.camera().getPos().x,
                    object.getY() - context.camera().getPos().y,
                    object.getZ() - context.camera().getPos().z
            );

            blockRenderManager.renderBlockAsEntity(
                    object.getBlockState(),
                    matrices,
                    vertexConsumers,
                    0xF000F0,
                    0xF000F0
            );

            matrices.pop();
        }
    }
}
