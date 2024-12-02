package state_pattern;

class VendidoEstado implements Estado {
    private MaquinaVenda maquina;

    public VendidoEstado(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Máquina sem estoque. Moeda devolvida.");
    }

    @Override
    public void devolverMoeda() {
        System.out.println("Nenhuma moeda para devolver.");
    }

    @Override
    public void apertarMoeda() {
        System.out.println("Sem estoque disponível.");
    }

    @Override
    public void dispensar() {
        System.out.println("Sem estoque para dispensar.");
    }
}