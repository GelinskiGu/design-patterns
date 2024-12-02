package strategy_pattern;

public class Order {
    private int custoTotal = 0;
    private boolean isClosed = false;

    public void processarOrder(PagamentoEscolhido strategy) {
        strategy.coletarDetalhesPagamento();
    }

    public void setCustoTotal(int custo) {
        this.custoTotal += custo;
    }

    public int getCustoTotal() {
        return custoTotal;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}