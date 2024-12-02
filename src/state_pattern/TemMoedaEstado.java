package state_pattern;

class TemMoedaEstado implements Estado {
    private MaquinaVenda maquina;

    public TemMoedaEstado(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Você já inseriu uma moeda.");
    }

    @Override
    public void devolverMoeda() {
        System.out.println("Moeda devolvida.");
        maquina.setarEstado(maquina.getSemMoedasEstado());
    }

    @Override
    public void apertarMoeda() {
        System.out.println("Botão pressionado. Preparando para liberar o produto...");
        maquina.setarEstado(maquina.getDispensandoEstado());
    }

    @Override
    public void dispensar() {
        System.out.println("Pressione o botão primeiro.");
    }
}