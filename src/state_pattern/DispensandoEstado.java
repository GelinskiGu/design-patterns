package state_pattern;

class DispensandoEstado implements Estado {
    private MaquinaVenda maquina;

    public DispensandoEstado(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde, já estamos dispensando seu produto.");
    }

    @Override
    public void devolverMoeda() {
        System.out.println("Não é possível devolver a moeda após pressionar o botão.");
    }

    @Override
    public void apertarMoeda() {
        System.out.println("Já estamos processando seu pedido.");
    }

    @Override
    public void dispensar() {
        maquina.lancarProduto();
        if (maquina.getQuant() > 0) {
            maquina.setarEstado(maquina.getSemMoedasEstado());
        } else {
            System.out.println("Sem estoque! Vendemos o último produto.");
            maquina.setarEstado(maquina.getVendidoEstado());
        }
    }
}