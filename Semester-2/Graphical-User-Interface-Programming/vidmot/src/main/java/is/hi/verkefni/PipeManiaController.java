package is.hi.verkefni;
import java.util.Observable;

import javax.swing.Action;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import vinnsla.Pipa;
import vinnsla.PipeMania;



public class PipeManiaController {

    private PipeMania pipemania;
    private static final int F = 5;
    private final Pipa[][] pipulogn = new Pipa[F][F];
    private int last_x;
    private int last_y;

    

    public void birtaMyndir(ObservableList<Pipa> q){
        int i = 3;
        ObservableList<Pipa> q = pipemania.getPipukista();
        for (Pipa p : q){
            fxButar.getChildren().get(i).getStyleClass().clear();
            fxButar.getChildren.get(i--). getStyleClass().add(getStyleClass().add(getMyndStyleClass(p)));
        }

    @FXML
    private Label fxStig;

    @FXML
    private GridPane fxBord;

    @FXML
    public Button fxButar;

    public void initialize(){
        pipemania = new PipeMania();
        fxStig.textProperty().bind(pipemania.stigProperty().asString());
        q.addListener((ListChangeListener<Pipa>) change -> (
        if (change.next() && change.wasAdded()){
            birtaMyndir(q);
        }
    ))
    }

    public void fxVeljaReit(ActionEvent actionEvent){

    }
    public void fxAthFlaedir(ActionEvent actionEvent){

    }
    public void ytaAHnap(ActionEvent actionEvent){
        Pipa p = Pipukista.next();
        Button hnappur = ( Button ) actionEvent.getSource();
        hnappur.getMyndStyleClass().add(getStilKlasi(p));
        last_x = GridPane.getColumnIndex(hnappur);
        last_y = GridPane.getRowIndex(hnappur);
        pipukista.naestaPipa(last_x, last_y);
    }

    public void fxButar(ActionEvent actionEvent){
    }

    public String getStilKlasi(Pipa p){
        return ("."+p.getInn()+p.getUt());
    }
    mania.nuverandiPipaProperty().addListener((observable, oldValue, newValue) ->
    Button hnappur = ( (Button) fxBord.getChildren().get(last_x * 5 + last_y)));
    hnappur.getStyleClass().add(getMyndStyleClass(newValue));
}
