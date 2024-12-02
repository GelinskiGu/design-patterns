package state_pattern;

public class Main {
    public static void main(String[] args) {
        MaquinaVenda maquina = new MaquinaVenda(2);

        maquina.inserirMoeda();
        maquina.apertarBotao();

        maquina.inserirMoeda();
        maquina.apertarBotao();

        maquina.inserirMoeda();
        maquina.apertarBotao();
    }
}