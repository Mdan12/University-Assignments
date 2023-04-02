package hi.vinnsla;

import hi.vinnsla.Bolti;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Leikbord extends Pane {

    @FXML
    private Bolti fxBolti;

    @FXML
    private Pallur fxPallur, fxPallur1, fxPallur2, fxPallur3, fxPallur4, fxPallur5, fxPallur6;

    ObservableList<Pallur> fxPallar = FXCollections.observableArrayList();

    public Pallur getFxPallur() {
        return this.fxPallur;
    }

    public void setFxPallur(Pallur fxPallur) {
        this.fxPallur = fxPallur;
    }

    public Bolti getFxBolti() {
        return fxBolti;
    }

    public void setFxBolti(Bolti fxBolti) {
        this.fxBolti = fxBolti;
    }


    public Leikbord(){
        FXML_Lestur.lesa(this, "leikbord-view.fxml");
        fxPallar.add(fxPallur);
        fxPallar.add(fxPallur1);
        fxPallar.add(fxPallur2);
        fxPallar.add(fxPallur3);
        fxPallar.add(fxPallur4);
        fxPallar.add(fxPallur5);
        fxPallar.add(fxPallur6);

    }

    public void afram(){
        if (!erBoltiABotni() && fxBolti.getCorn()==null){
            fxBolti.setRotate(Stefna.NIÐUR.getGradur());
            fxBolti.afram();   
        }
        if (haegriendi() && !erBoltiABotni()){
            fxBolti.setLayoutX(0);
            fxBolti.afram();
        }
        if (vinstriendi() && !erBoltiABotni()){
            fxBolti.setLayoutX(getWidth()-fxBolti.getFitWidth());
            fxBolti.afram();
        }
    }

    public boolean erBoltiABotni(){
        if(fxBolti.getLayoutY() >= getHeight()-fxBolti.getFitHeight()){    
            return true;
        }
        return false;
    }

    public void aframPallar() {
        for (Pallur homo : fxPallar){
            homo.afram();
            athugaBoltiAPalli(homo);
        }

    }

    public Boolean haegriendi(){
        if(fxBolti.getLayoutX()>= getWidth()-fxBolti.getFitWidth()){
            return true;
        }
        return false;
    }

    public Boolean vinstriendi(){
        if(fxBolti.getLayoutX()<0){
            return true;
        }
        return false;
    }

    public void setjaBoltaAPall (Pallur p){
        fxBolti.setCorn(p);
    }

    public void hendaBoltaAfPalli (Pallur p){
        fxBolti.setCorn(null);
    }

    public void athugaBoltiAPalli(Pallur p){
        if(fxBolti.getBoundsInParent().intersects(p.getBoundsInParent())){
            setjaBoltaAPall(p);
            fxBolti.setLayoutY(fxBolti.getCorn().getLayoutY() - fxBolti.getFitHeight());
        } else if (p == fxBolti.getCorn()){
            hendaBoltaAfPalli(p);
        }
    } 
}
