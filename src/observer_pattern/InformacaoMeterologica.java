package observer_pattern;

import java.util.ArrayList;
import java.util.List;

class InformacaoMeterologica implements Auxilio {
    private List<Observador> observadores;
    private float temperatura;
    private float humidade;
    private float pressao;

    public InformacaoMeterologica() {
        observadores = new ArrayList<>();
    }

    @Override
    public void registraObservador(Observador observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObservador(Observador observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificaObservador() {
        for (Observador observador : observadores) {
            observador.update(temperatura, humidade, pressao);
        }
    }

    public void Medidas(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.humidade = umidade;
        this.pressao = pressao;
        notificaObservador();
    }
}