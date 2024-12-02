package state_pattern;

interface Estado {
    void inserirMoeda();
    void devolverMoeda();
    void apertarMoeda();
    void dispensar();
}