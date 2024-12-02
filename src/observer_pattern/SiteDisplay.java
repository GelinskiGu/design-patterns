package observer_pattern;

class SiteDisplay implements Observador {
    private float umidade;

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.umidade = umidade;
        display();
    }

    public void display() {
        System.out.println("Site: Umidade Atual = " + umidade + "%");
    }
}