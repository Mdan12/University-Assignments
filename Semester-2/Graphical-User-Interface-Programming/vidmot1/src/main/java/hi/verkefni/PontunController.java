package hi.verkefni;

import java.io.IOException;

import hi.vinnsla.Karfa;
import hi.vinnsla.Veitingar;
import hi.vinnsla.Vidskiptavinur;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PontunController {
    @FXML
    static Karfa karfa;
    public static int activeindex=0;
    public static int activeindex1=0;
    @FXML
    private TextField fxTotal;
    Veitingar veitingar;
    Vidskiptavinur vidskiptavinur;
    @FXML
    private MatsedillView foodlist;
    static String newUser;
    public TextField currentUser;


    @FXML
    public ListView<Veitingar> fxCart;
    @FXML
    public void fxSetjaKorfuHandler(ActionEvent actionEvent){
        if (activeindex!=-1){
            Veitingar currentVeitingar = foodlist.getVeiting(activeindex);
            karfa.getVeitingar().add(foodlist.getVeiting(activeindex));
            karfa.setTotal(karfa.getTotal()+currentVeitingar.getVerd());
        }
        
    }
    @FXML
    public void fxTakaUrKorfuHandler(ActionEvent actionEvent){
        if (activeindex1!=-1 && karfa.getVeitingar().size() != 0){
            Veitingar currentVeitingar = karfa.getVeitingar().get(activeindex1);
            karfa.getVeitingar().remove(activeindex1);
            karfa.setTotal(karfa.getTotal()-currentVeitingar.getVerd());
        }
        if (activeindex1 != 0){
            activeindex1=0;
        }

    }
    @FXML
    protected void fxInnskraningHandler(){
        LoginDialog lg = new LoginDialog();
        newUser = lg.getUser();

        if(newUser != null && vidskiptavinur !=null ){
            if(vidskiptavinur.getName().equals(newUser)){
                currentUser.setText(newUser);
            } else{
                Platform.exit();
            }
        }

    }

    @FXML
    protected void fxNyskraningHandler(){
        VidskiptavinurDialog s = new VidskiptavinurDialog();
        Vidskiptavinur newUser= s.getVidskiptavinur();
        if(newUser != null){
            vidskiptavinur = newUser;
        }else{
            Platform.exit();
        }
    }

    @FXML
    public void fxGreidaHandler(ActionEvent actionEvent) throws IOException {
        ViewSwitcher.switchTo(View.GREIDSLA);
    }

    public void initialize(){
        foodlist.getSelectionModel().selectedItemProperty().addListener((observable) ->{
            activeindex=foodlist.getSelectionModel().getSelectedIndex();
        }); 
        karfa = new Karfa();
        fxCart.setItems(karfa.getVeitingar());
        

        fxCart.getSelectionModel().selectedItemProperty().addListener((observable) ->{
            activeindex1=fxCart.getSelectionModel().getSelectedIndex();
            System.out.println(activeindex1);
            System.out.println(fxCart.getItems());
        }); 

        fxTotal.textProperty().bind(Karfa.totalProperty().asString());
    }
}
