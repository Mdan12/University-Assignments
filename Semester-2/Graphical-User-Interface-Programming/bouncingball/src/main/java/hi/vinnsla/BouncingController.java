package hi.vinnsla;

import java.io.IOException;
import javafx.util.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import hi.vinnsla.Leikur;
import hi.vinnsla.Stefna;

public class BouncingController {
    HashMap<KeyCode, Stefna> map = new HashMap<>();
    @FXML
    private TextField fxStig;
    private Leikur stig;
    @FXML
    private Leikbord fxLeikbord;
    private Pallur fxPallur;
    private Leikur leikur;
    private Timeline t;

    public void orvatakkar(){
        map.put(KeyCode.LEFT, Stefna.VINSTRI);
        map.put(KeyCode.RIGHT, Stefna.HÆGRI);
        fxStig.getScene().addEventFilter(KeyEvent.ANY,      //KeyEvents eru sendar á Scene
                event -> {      // lambda fall - event er parameter
                    try {
                        fxLeikbord.getFxBolti().setStefna(map.get(event.getCode()).getGradur());
                        fxLeikbord.getFxBolti().afram();

                    } catch (NullPointerException e) {
                        event.consume();        // Ef rangur lykill er sleginn inn þá höldum við áfram
                    }
                });
    }

    public void testBolti() {
        for (int i = 0; i < 4; i++) {
            fxLeikbord.getFxPallur().afram();
        }
    }

    public void hefjaLeik() {
        KeyFrame k = new KeyFrame(Duration.millis(50),
                e -> {
                    fxLeikbord.aframPallar();
                    fxLeikbord.afram();
                    stig.haekkaStigin();
                    if (fxLeikbord.erBoltiABotni()) {
                        leikLokid();
                    }

                });
        t = new Timeline(k);
        t.setCycleCount(Timeline.INDEFINITE);   // leikurinn leikur endalaust
        t.play();
    }

    public Timeline getT() {
        return t;
    }
    
   public void initialize(){
        stig=new Leikur();
        testBolti();
        fxStig.textProperty().bind(stig.getStig().asString());
   }
   
   public void leikLokid(){
    t.stop();


   }
}