package prototype_pattern;

public abstract class Industria {
    public int producao;

    public Industria() {
    }

    public Industria(Industria aux) {
        if (aux != null) {
            this.producao = aux.producao;
        }
    }

    public abstract Industria clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Industria)) return false;
        Industria industria2 = (Industria) object2;
        return industria2.producao == producao;
    }
}
