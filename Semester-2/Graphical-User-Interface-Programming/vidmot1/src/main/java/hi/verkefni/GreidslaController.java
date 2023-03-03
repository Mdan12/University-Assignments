package hi.verkefni;

import hi.vinnsla.Karfa;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class GreidslaController {
    @FXML
    ListView fxKarfa;
    @FXML
    TextField fxTotal;

    private PontunController pontun;
    /**
     * @param actionEvent when clicked will clear the karfa and the TotalCost
     *                    TotalCost will remain the same until a new product is chosen
     */
    @FXML
    public void fxStadfestahandler (ActionEvent actionEvent){
        PontunController.karfa.getVeitingar().clear();
        Karfa.totalProperty().set(0);
        ViewSwitcher.switchTo(View.PONTUN);
    }



    /**
     * when clicked Cancel, the view switches back to the Pontun view
     */
    @FXML
    public void fxTilBaka(ActionEvent actionEvent){ ViewSwitcher.switchTo(View.PONTUN);
    }

    public void initialize(){
        fxTotal.textProperty().bind(Karfa.totalProperty().asString());

    }
}