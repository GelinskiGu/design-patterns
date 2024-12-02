package state_pattern;

// Classe Contexto (Máquina de Vendas)
class MaquinaVenda {
    private Estado semMoedasEstado;
    private Estado temMoedasEstado;
    private Estado dispensandoEstado;
    private Estado vendidoEstado;

    private Estado estadoAtual;
    private int quant;

    public MaquinaVenda(int quant) {
        semMoedasEstado = new SemMoedasEstado(this);
        temMoedasEstado = new TemMoedaEstado(this);
        dispensandoEstado = new DispensandoEstado(this);
        vendidoEstado = new VendidoEstado(this);

        this.quant = quant;
        estadoAtual = quant > 0 ? semMoedasEstado : vendidoEstado;
    }

    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        estadoAtual.devolverMoeda();
    }

    public void apertarBotao() {
        estadoAtual.apertarMoeda();
        estadoAtual.dispensar();
    }

    void setarEstado(Estado estado) {
        estadoAtual = estado;
    }

    void lancarProduto() {
        if (quant > 0) {
            quant--;
            System.out.println("Produto liberado! Aproveite!");
        }
    }

    public int getQuant() {
        return quant;
    }

    public Estado getSemMoedasEstado() {
        return semMoedasEstado;
    }

    public Estado getTemMoedasEstado() {
        return temMoedasEstado;
    }

    public Estado getDispensandoEstado() {
        return dispensandoEstado;
    }

    public Estado getVendidoEstado() {
        return vendidoEstado;
    }
}