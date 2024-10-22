package prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    public static void main(String[] args) {
        List<Industria> produtos = new ArrayList<>();
        List<Industria> produtosCopia = new ArrayList<>();

        Computador computador = new Computador();
        computador.producao = 100;
        computador.waterCooler = 50;
        produtos.add(computador);

        Notebook notebook = new Notebook();
        notebook.producao = 150;
        notebook.faceCam = 20;
        produtos.add(notebook);

        Comparador(produtos, produtosCopia);
    }

    private static void Comparador(List<Industria> aux2, List<Industria> shapesCopy) {
        for (Industria aux1 : aux2) {
            shapesCopy.add(aux1.clone());
        }

        for (int i = 0; i < aux2.size(); i++) {
            if (aux2.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": São dois objetos diferentes");
                if (aux2.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": E são identicos");
                } else {
                    System.out.println(i + ": não são identicos");
                }
            } else {
                System.out.println(i + ": São objetos iguais");
            }
        }
    }
}
