package strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PagarPix implements PagamentoEscolhido {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader LEITOR = new BufferedReader(new InputStreamReader(System.in));
    private String cpf;
    private String senha;
    private boolean verificado;

    static {
        DATA_BASE.put("qwerty", "123456789-12");
        DATA_BASE.put("asdfgh", "123456789-34");
    }

    @Override
    public void coletarDetalhesPagamento() {
        try {
            while (!verificado) {
                System.out.print("Colocar CPF: ");
                cpf = LEITOR.readLine();
                System.out.print("Colocar senha: ");
                senha = LEITOR.readLine();
                if (verifica()) {
                    System.out.println("Verificação feita.");
                } else {
                    System.out.println("Pessoa não encontrada!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verifica() {
        setVerificado(cpf.equals(DATA_BASE.get(senha)));
        return verificado;
    }

    @Override
    public boolean pagar(int pagamentoQuant) {
        if (verificado) {
            System.out.println("Pagando " + pagamentoQuant + " no Pix.");
            return true;
        } else {
            return false;
        }
    }

    private void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }
}