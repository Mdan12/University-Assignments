package hi.verkefni;

import hi.vinnsla.Vidskiptavinur;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.Optional;

public class VidskiptavinurDialog extends Dialog<Vidskiptavinur> {
    @FXML
    private TextField fxUsername;
    @FXML
    private TextField fxAddress;
    @FXML
    private ButtonType fxConfirm;

    /**
     * the confirm button conditions are set here when both slots are full button is able-d
     */
    public VidskiptavinurDialog() {
        setDialogPane(readVidskiptavinurDialog());
        ConfirmButtonCondition();
        setResultConverter(b -> {
            if (b.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                return new Vidskiptavinur(fxUsername.getText(), fxAddress.getText());
            } else {
                return null;
            }
        });
    }

    /**
     * @return gets info from vidskiptavinur view fxml and try catches exceptions
     */
    private DialogPane readVidskiptavinurDialog() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vidskiptavinur-view.fxml"));
        try {
            fxmlLoader.setController(this);
            return fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * lookup and binds username and address
     */
    private void ConfirmButtonCondition() {
        Node ConfirmButton = getDialogPane().lookupButton(fxConfirm);
        ConfirmButton.disableProperty()
                .bind(fxUsername.textProperty().isEmpty()
                        .or(fxAddress.textProperty().isEmpty()));
    }

    /**
     * @return dialog anf stage is shown until cancelled
     */
    public Vidskiptavinur getVidskiptavinur() {
        Optional<Vidskiptavinur> utkoma = showAndWait();
        return utkoma.orElse(null);
    }

}