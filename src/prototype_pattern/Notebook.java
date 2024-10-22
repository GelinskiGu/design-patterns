package prototype_pattern;

public class Notebook extends Industria {
    public int faceCam;

    public Notebook() {
    }

    public Notebook(Notebook aux) {
        super(aux);
        if (aux != null) {
            this.faceCam = aux.faceCam;
        }
    }

    @Override
    public Notebook clone() {
        return new Notebook(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Notebook) || !super.equals(object2)) return false;
        Notebook industria2 = (Notebook) object2;
        return industria2.faceCam == faceCam;
    }
}
