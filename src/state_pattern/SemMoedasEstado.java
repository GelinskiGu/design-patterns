package state_pattern;

class SemMoedasEstado implements Estado {
    private MaquinaVenda maquina;

    public SemMoedasEstado(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida. Você pode escolher seu produto.");
        maquina.setarEstado(maquina.getTemMoedasEstado());
    }

    @Override
    public void devolverMoeda() {
        System.out.println("Você ainda não inseriu uma moeda.");
    }

    @Override
    public void apertarMoeda() {
        System.out.println("Insira uma moeda primeiro.");
    }

    @Override
    public void dispensar() {
        System.out.println("Nenhum produto pode ser dispensado sem uma moeda.");
    }
}