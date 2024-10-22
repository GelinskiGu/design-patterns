package singleton_pattern;

public class Problema {
    public static void main(String[] args) {
        Singleton singleton = Singleton.Instancia("TREM");
        Singleton singleton2 = Singleton.Instancia("BARCO");

        System.out.println(singleton.valor);
        System.out.println(singleton2.valor);
    }
}
