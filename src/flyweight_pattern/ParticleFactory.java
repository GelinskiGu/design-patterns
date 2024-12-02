package flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class ParticleFactory {
    private static final Map<String, ParticleType> particleTypes = new HashMap<>();

    public static ParticleType getParticleType(String name, String color, String texture) {
        String key = name + ":" + color + ":" + texture;
        if (!particleTypes.containsKey(key)) {
            System.out.println("Criando novo tipo de partícula: " + name);
            particleTypes.put(key, new ParticleType(name, color, texture));
        }
        return particleTypes.get(key);
    }
}
