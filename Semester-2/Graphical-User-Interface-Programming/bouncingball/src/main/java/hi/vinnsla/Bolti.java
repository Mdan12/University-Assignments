package hi.vinnsla;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Bolti extends ImageView implements Leikhlutur{

    private Leikbord leikbord;
    private Pallur Corn = null;
    
    @FXML
    private Bolti fxBolti;

    public Pallur getCorn() {
        return this.Corn;
    }

    public void setCorn(Pallur Corn) {
        this.Corn = Corn;
    }

    
    public void setStefna(int gradur){
        fxBolti.setRotate(gradur);
    }

    public Bolti getfxBolti() {
        return this.fxBolti;
    }

    public void setfxBolti(Bolti fxBolti) {
        this.fxBolti = fxBolti;
    }
    
    public Bolti(){
        FXML_Lestur.lesa(this, "bolti-view.fxml");
    }

    public void afram(){
        if (fxBolti.getRotate() == Stefna.HÆGRI.getGradur()){
            fxBolti.setLayoutX(fxBolti.getLayoutX()+15);
        }
        else if (fxBolti.getRotate() == Stefna.VINSTRI.getGradur()){
            fxBolti.setLayoutX(fxBolti.getLayoutX()-15);
        }
        else if (fxBolti.getRotate() == Stefna.NIÐUR.getGradur()){
            fxBolti.setLayoutY(fxBolti.getLayoutY()+10);
        }
    }


}
