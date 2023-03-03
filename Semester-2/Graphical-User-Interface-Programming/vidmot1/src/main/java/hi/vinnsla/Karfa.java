package hi.vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Karfa extends Matsedill{
    
    private static IntegerProperty total = new SimpleIntegerProperty();

    public static IntegerProperty totalProperty(){
        return total;
    }

    public int getTotal() {
        return Karfa.total.get();
    }

    public void setTotal(Integer total) {
        Karfa.total.set(total);
    }


    // public String toString(){
    //     return matur + ", " + verd;
    // }
}
