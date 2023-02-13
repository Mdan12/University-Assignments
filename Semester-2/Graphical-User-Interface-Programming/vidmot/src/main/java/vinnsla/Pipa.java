package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pipa {

    private Att inn;
    private Att ut;

    public Att getInn() {
        return this.inn;
    }

    public void setInn(Att inn) {
        this.inn = inn;
    }

    public Att getUt() {
        return this.ut;
    }

    public void setUt(Att ut) {
        this.ut = ut;
    }

    public enum Att {V, N, A, S, Att}

    private final StringProperty opin = new SimpleStringProperty();

    public final StringProperty opin() {
        return this.opin;
    }

    public Pipa(Att x, Att y){
        this.inn = x;
        this.ut = y;
    }

    public boolean flaedir(Pipa s){
        if ((ut.ordinal() +2)%4==s.inn.ordinal()) return true;
        else if ((ut.ordinal() +2)%4== s.ut.ordinal()){
            Att tmp = s.ut;
            s.ut = s.inn;
            s.inn = tmp;
            return true;
        }
        return false;
    }





}
