package is.hi.verkefni;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import vinnsla.Pipa;
import vinnsla.PipeMania;



public class PipeManiaController {

    private PipeMania pipemania;
    private static final int F = 5;
    private final Pipa[][] pipulogn = new Pipa[F][F];

    @FXML
    private Label fxStig;

    public void initialize(){
        pipemania = new PipeMania();
        fxStig.textProperty().bind(pipemania.stigProperty().asString());
    }

    public class fxVeljaReit{

    }
    public class fxAthFlaedir{

    }

}
