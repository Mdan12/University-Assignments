package hi.verkefni;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.Optional;

public class LoginDialog extends Dialog<String> {
    @FXML
    private TextField fxUsername;
    @FXML
    private PasswordField fxPassword;
    @FXML
    private ButtonType fxConfirm;

    /**
     * disables the button until more information is set
     */
    public LoginDialog() {
        setDialogPane(readLoginDialog());

        ConfirmButtonCondition();

        setResultConverter(b -> {
            if (b.getButtonData() == ButtonBar.ButtonData.OK_DONE) {

                return fxUsername.getText();
            } else {
                return null;
            }
        });
    }

    /**
     * @return try-catch for the logindialog
     */
    private DialogPane readLoginDialog() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-view.fxml"));
        try {
            fxmlLoader.setController(this);
            return fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * binds the password to the username so that user can log in after signing in
     */
    private void ConfirmButtonCondition() {
        Node ConfirmButton = getDialogPane().lookupButton(fxConfirm);
        ConfirmButton.disableProperty()
                .bind(fxUsername.textProperty().isEmpty()
                        .or(fxPassword.textProperty().isEmpty()));
    }

    /**
     * @returns getUser, shows stage until it is closed
     */
    public String getUser() {
        Optional<String> out = showAndWait();
        return out.orElse(null);
    }

}