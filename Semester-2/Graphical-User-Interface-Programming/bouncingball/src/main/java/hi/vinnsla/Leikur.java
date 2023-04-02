package hi.vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Leikur {
    private IntegerProperty stig = new SimpleIntegerProperty(0);

    public IntegerProperty getStig() {
        return this.stig;
    }

    public void haekkaStigin() {
        this.stig.set(this.stig.getValue()+1);
    }



}