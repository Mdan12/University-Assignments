package hi.verkefni;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField fxUttak;
    private double fyrst = 0.0;

    @FXML
    public void inntakTalaActionPerformed(ActionEvent actionEvent){
        if (fyrst == 0){
            int tala = Integer.parseInt(((Node) actionEvent.getSource()).getId());
            fxUttak.appendText(tala+"");
        } else {
            int tala = Integer.parseInt(((Node) actionEvent.getSource()).getId());
            fxUttak.appendText(tala+"");
        }
        
    }

    public boolean intOrDouble(double n){
        fyrst = Double.parseDouble(fxUttak.getText());  
        int intValue = (int)fyrst;
        double minus = fyrst-intValue;
        if(minus != 0.0){
            return true;
        }
        else{
            return false;
        }
    }

     @FXML
    private void hreinsaHandler(ActionEvent event) {
        fxUttak.setText("");
    }

    @FXML
    public void equalsHandler(ActionEvent actionEvent){

    }

    @FXML
    public void plusHandler(ActionEvent actionEvent){
        if (fyrst == 0.0){
            intOrDouble(fyrst);

        }
        else{
            fyrst += Double.valueOf(fxUttak.getText());
            int intValue = (int)fyrst;
            double minus = fyrst-intValue;
            if(minus != 0.0){
                fxUttak.setText(fyrst+"");
            }
            else{
                fxUttak.setText(intValue+"");
            }
        }
    }

    @FXML
    public void minusHandler(ActionEvent actionEvent){
    }

    @FXML
    public void plusMinusHandler(ActionEvent actionEvent){
        if (fyrst!=0){
            System.out.println(fxUttak.getText());
            fyrst = fyrst * -1;
            fxUttak.setText(fyrst+"");
        }
    }

    @FXML
    public void multiplyHandler(ActionEvent actionEvent){
    }

    @FXML
    public void divisionHandler(ActionEvent actionEvent){

    }

    @FXML
    public void percentageHandler(ActionEvent actionEvent){

    }

    @FXML
    public void dotHandler(ActionEvent actionEvent){
        fxUttak.appendText(".");
    }

}
