package observer_pattern;

class MobileDisplay implements Observador {
    private float temperatura;
    private float umidade;

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        display();
    }

    public void display() {
        System.out.println("Exibição no Celular: Temperatura = " + temperatura + "°C, Umidade = " + umidade + "%");
    }
}