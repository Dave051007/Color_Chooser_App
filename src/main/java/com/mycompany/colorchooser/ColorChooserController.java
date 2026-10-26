import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class ColorChooserController {

    @FXML
    private Slider alphaSlider;

    @FXML
    private TextField alphaTextField;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField blueTextField;

    @FXML
    private Rectangle colorRectangle;

    @FXML
    private Slider greenSlider;

    @FXML
    private TextField greenTextField;

    @FXML
    private Slider redSlider;

    @FXML
    private TextField redTextField;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    @FXML
    public void initialize() {
        redTextField.textProperty().bind(
                redSlider.valueProperty().asString("%.0f"));
        
        greenTextField.textProperty().bind(
                greenSlider.valueProperty().asString("%.0f"));
    }    
}
