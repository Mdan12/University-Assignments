package hi.vinnsla;

public enum Stefna {
    VINSTRI(180),
    HÆGRI(0),
    NIÐUR(270);

    private int gradur;

    public int getGradur() {
        return gradur;
    }

    Stefna(int gradur){
        this.gradur = gradur;
    }
}
