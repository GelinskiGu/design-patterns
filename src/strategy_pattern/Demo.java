package strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static Map<Integer, Integer> precoProdutos = new HashMap<>();
    private static BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    private static Order ordenador = new Order();
    private static PagamentoEscolhido strategy;

    static {
        precoProdutos.put(1, 10);
        precoProdutos.put(2, 5);
    }

    public static void main(String[] args) throws IOException {
        while (!ordenador.isClosed()) {
            int custo;

            String continuaEscolha;
            do {
                System.out.print("Selecione comida:" + "\n" +
                        "1 - Açucar" + "\n" +
                        "2 - Farinha" + "\n");
                int escolha = Integer.parseInt(leitor.readLine());
                custo = precoProdutos.get(escolha);
                System.out.print("Somando: ");
                int contador = Integer.parseInt(leitor.readLine());
                ordenador.setCustoTotal(custo * contador);
                System.out.print("Quer continuar comprando? S/N: ");
                continuaEscolha = leitor.readLine();
            } while (continuaEscolha.equalsIgnoreCase("S"));

            if (strategy == null) {
                System.out.println("Escolher método de pagamento:" + "\n" +
                        "1 - Pix" + "\n" +
                        "2 - Credito");
                String metodoPagamento = leitor.readLine();

                if (metodoPagamento.equals("1")) {
                    strategy = new PagarPix();
                } else {
                    strategy = new PagarCredito();
                }
            }

            ordenador.processarOrder(strategy);

            System.out.print("Pagar " + ordenador.getCustoTotal() + " ou continuar comprando? P/C: ");
            String proseguir = leitor.readLine();
            if (proseguir.equalsIgnoreCase("P")) {
                if (strategy.pagar(ordenador.getCustoTotal())) {
                    System.out.println("Pagamento concluido.");
                } else {
                    System.out.println("Pagamento recusado.");
                }
                ordenador.setClosed();
            }
        }
    }
}