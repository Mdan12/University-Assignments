package hi.vinnsla;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Pallur extends ImageView {

    private Leikbord leikbord;

    @FXML
    private Pallur fxPallur;

    public Pallur(){
        FXML_Lestur.lesa(this, "pallur-view.fxml");
    }

    public Pallur getfxPallur() {
        return this.fxPallur;
    }

    public void setfxPallur(Pallur pallur) {
        this.fxPallur = pallur;
    }


    public void afram(){
        leikbord = (Leikbord) getParent();
        
        leikbord = (Leikbord) this.getParent();
        if (fxPallur.getLayoutY() <= 0){
            int a = (int) (Math.random() * leikbord.getWidth()-fxPallur.getFitWidth());
            int b = (int) (Math.random() * leikbord.getWidth()-fxPallur.getFitWidth());
            fxPallur.setLayoutY(b + leikbord.getHeight());
            fxPallur.setLayoutX(a);
        }
        fxPallur.setLayoutY(fxPallur.getLayoutY()-4);
    }
}
