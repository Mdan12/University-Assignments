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
    private String sign;
    private double second = 0.0;

    @FXML
    public void inntakTalaActionPerformed(ActionEvent actionEvent){
        if (fyrst == 0 && sign == null){
            int tala = Integer.parseInt(((Node) actionEvent.getSource()).getId());
            fxUttak.appendText(tala+"");
        } 
        else {
            fxUttak.setText(second+"");
            int tala = Integer.parseInt(((Node) actionEvent.getSource()).getId());
            
            fxUttak.appendText(tala+"");
        }
        
    }

    public Boolean intOrDouble(double n){
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

    public double signs(double fyrst, String sign, double second){
        switch (sign){
            case "plus":
                return fyrst + second;
            case "minus":
                return fyrst - second;
            case "multiply":
                return fyrst * second;
            case "division":
                return fyrst / second;
            case "percentage":
                return fyrst/100;
            default:
                break;
            }
            return 0;
    }

     @FXML
    private void hreinsaHandler(ActionEvent event) {
        fxUttak.setText("");
        fyrst = 0;
    }

    @FXML
    public void equalsHandler(ActionEvent actionEvent){

    }

    @FXML
    public void plusHandler(ActionEvent actionEvent){
        sign = "plus";
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
        fyrst = Double.valueOf(fxUttak.getText());
        if(!intOrDouble(fyrst)){
            int fyrst1 = (int) fyrst;
            fyrst1 = fyrst1 * -1;
            fxUttak.setText(fyrst1+"");
            fyrst = fyrst1;
            System.out.println(fyrst);
            return;
        }
        fyrst = fyrst * -1;
        fxUttak.setText(fyrst+"");
        
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
