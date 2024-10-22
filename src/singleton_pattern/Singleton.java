package singleton_pattern;

public class Singleton {
    private static Singleton instancia;
    public String valor;

    private Singleton(String valor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }

    public static Singleton Instancia(String valor) {
        if (instancia == null) {
            instancia = new Singleton(valor);
        }
        return instancia;
    }
}
