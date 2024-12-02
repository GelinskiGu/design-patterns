package flyweight_pattern;

public class Particle {
    private final int x;
    private final int y;
    private final int velocity;
    private final ParticleType type;

    public Particle(int x, int y, int velocity, ParticleType type) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.type = type;
    }

    public void render() {
        type.render(x, y, velocity);
    }
}
