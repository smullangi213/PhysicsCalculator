import javafx.fxml.*;
import javafx.scene.control.*;
import java.lang.Math;
public class PhysicsCalculatorController {
    //create necessary objects to control the application
    @FXML
    private ToggleButton calcTypeBtn;
    
    @FXML
    private TextField obj1Field;
    
    @FXML
    private TextField obj2Field;
     
    @FXML
    private TextField distanceField;
    
    @FXML
    private Button calcBtn;
    
    @FXML
    private Label answerField;
    
    //The constant of the equation, if the user wants gravitational or electrostatic force calculation
    private double eqConstant = 6.67E-11;

    public void calcTypeBtnListener()
    {
      //toggle the type of calculation for the application
      if (calcTypeBtn.getText().equals("Gravitational Calculator")) {
         calcTypeBtn.setText("Electrostatic Calculator");
         eqConstant = 8.99E9;
      }
      else {
         calcTypeBtn.setText("Gravitational Calculator");
         eqConstant = 6.67E-11;
      }
    }
    public void calcBtnListener ()
    {
      //collect each object's properties and distance inputted
      double obj1 = Double.parseDouble(obj1Field.getText());
      double obj2 = Double.parseDouble(obj2Field.getText());
      double distance = Double.parseDouble(distanceField.getText());
      
      //solve force
      double answer = (obj1 * obj2 * eqConstant) / Math.pow(distance,2); 
      
      //display force with a readable format
      answerField.setText(String.format("Force: %.3f Newtons", answer));
    }
    
    public void initialize (){}
}
