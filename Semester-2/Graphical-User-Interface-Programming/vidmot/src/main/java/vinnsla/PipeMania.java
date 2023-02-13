package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PipeMania {

    private IntegerProperty stig = new SimpleIntegerProperty();

    public IntegerProperty stigProperty(){
        return stig;
    }

}
