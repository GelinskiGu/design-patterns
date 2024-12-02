package strategy_pattern;

public interface PagamentoEscolhido {
    boolean pagar(int pagamentoQuant);
    void coletarDetalhesPagamento();
}
