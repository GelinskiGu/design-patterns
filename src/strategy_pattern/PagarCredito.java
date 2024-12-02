package strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagarCredito implements PagamentoEscolhido {
    private final BufferedReader LER = new BufferedReader(new InputStreamReader(System.in));
    private Credito cartao;

    @Override
    public void coletarDetalhesPagamento() {
        try {
            System.out.print("Numero do cartão: ");
            String numero = LER.readLine();
            System.out.print("Data de expiração 'mm/yy': ");
            String data = LER.readLine();
            System.out.print("Colocar cvv: ");
            String cvv = LER.readLine();
            cartao = new Credito(numero, data, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pagar(int pagamentoQuant) {
        if (cartaoEncontrado()) {
            System.out.println("Pagando " + pagamentoQuant + " no crédito.");
            cartao.setQuant(cartao.getQuant() - pagamentoQuant);
            return true;
        } else {
            return false;
        }
    }

    private boolean cartaoEncontrado() {
        return cartao != null;
    }
}