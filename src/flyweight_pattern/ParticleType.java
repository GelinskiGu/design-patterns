package flyweight_pattern;

public class ParticleType {
    private final String name;
    private final String color;
    private final String texture;

    public ParticleType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void render(int x, int y, int velocity) {
        System.out.println("Renderizando partícula '" + name +
                "' na posição (" + x + ", " + y + ") com velocidade " + velocity +
                ". Cor: " + color + ", Textura: " + texture);
    }
}
