package strategy_pattern;

public class Credito {
    private int quant;
    private String numero;
    private String data;
    private String cvv;

    Credito(String numero, String data, String cvv) {
        this.quant = 100_000;
        this.numero = numero;
        this.data = data;
        this.cvv = cvv;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getQuant() {
        return quant;
    }
}