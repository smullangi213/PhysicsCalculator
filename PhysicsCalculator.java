import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PhysicsCalculator extends Application
{
   public void start (Stage stage) throws Exception
   {
      Parent parent = FXMLLoader.load (getClass().getResource("PhysicsCalculator.fxml"));
      
      Scene scene = new Scene (parent);
      
      stage.setTitle ("Physics Gravitational and Electromagnetic Force Calculator");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String [] args)
   {
      launch(args);
   }
}