package evy.evy.vsflyfabric1_20_1.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;

public class MagnetEffects {
    private static final MinecraftClient client = MinecraftClient.getInstance();

    public static void spawnAttractionParticles(Vec3d position) {
        if (client.world != null) {
            client.world.addParticle(ParticleTypes.ENCHANTED_HIT,
                    position.x, position.y, position.z,
                    0, 0, 0); // Adjust particle velocity as necessary
        }
    }
}
