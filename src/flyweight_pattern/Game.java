package flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Particle> particles = new ArrayList<>();

    public void addParticle(int x, int y, int velocity, String name, String color, String texture) {
        ParticleType type = ParticleFactory.getParticleType(name, color, texture);
        particles.add(new Particle(x, y, velocity, type));
    }

    public void render() {
        for (Particle particle : particles) {
            particle.render();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.addParticle(10, 20, 5, "Bala", "Prata", "Lisa");
        game.addParticle(15, 25, 7, "Bala", "Prata", "Lisa");
        game.addParticle(30, 40, 10, "Estilhaço", "Vermelho", "Fragmentado");
        game.addParticle(50, 60, 12, "Bala", "Prata", "Lisa");

        game.render();
    }
}
