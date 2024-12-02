package observer_pattern;

interface Auxilio {
    void registraObservador(Observador observer);
    void removeObservador(Observador observer);
    void notificaObservador();
}