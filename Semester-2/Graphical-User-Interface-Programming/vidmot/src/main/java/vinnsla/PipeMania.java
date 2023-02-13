package vinnsla;

import is.hi.verkefni.Pipukista;

//import ...

import javafx.beans.binding.BooleanExpression;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;

public class PipeMania {

    private static final int F = 5;
    private final Pipa[][] pipulogn = new Pipa[F][F];
    private IntegerProperty stig = new SimpleIntegerProperty();

    private final ObjectProperty<Pipa> nuverandiPipa = new SimpleObjectProperty<Pipa>();

    private Pipukista myChest;

    public Pipemania(int fjoldipipa) {
        myChest = new Pipukista(fjoldipipa);
    }

    public IntegerProperty stigProperty() {
        return stig;
    }

    public Pipa[][] getPipulogn() {
        return pipulogn;
    }

    public int getStig() {
        return stig.get();
    }

    public void setStig(int stig) {
        this.stig.set(stig);
    }

    public ObservableList<Pipa> getMyChest() {
        return myChest.getKista();
    }

    public Pipukista getP(){
        return myChest;
    }

    public void setMyChest(Pipukista myChest) {
        this.myChest = myChest;
    }


    public Pipa getNuverandiPipa() {
        return nuverandiPipa.get();
    }

    public ObjectProperty<Pipa> nuverandiPipaProperty() {
        return nuverandiPipa;
    }

    public void setNuverandiPipa(Pipa nuverandiPipa) {
        this.nuverandiPipa.set(nuverandiPipa);
    }

    public void setNaestaPipa(int i, int j){
        Pipa temp = myChest.naestaPipa();
        this.pipulogn[i][j] = temp;
        setNuverandiPipa(temp);
    }

    public void flaedir(){
        //uppfÃ¦ra stig aaaaaa
        //.flaedir();
    }

}
