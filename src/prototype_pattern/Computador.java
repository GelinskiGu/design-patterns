package prototype_pattern;

public class Computador extends Industria {
    public int waterCooler;

    public Computador() {
    }

    public Computador(Computador aux) {
        super(aux);
        if (aux != null) {
            this.waterCooler = aux.waterCooler;
        }
    }

    @Override
    public Computador clone() {
        return new Computador(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Computador) || !super.equals(object2)) return false;
        Computador industria2 = (Computador) object2;
        return industria2.waterCooler == waterCooler;
    }
}
