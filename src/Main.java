import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
// implements EventHandler<ActionEvent>
public class Main extends Application  {
  Button btn;
    @Override
    public void start(Stage primaryStage) {
      primaryStage.setTitle("MKP");
  
  try {
    Parent root = FXMLLoader.load(getClass().getResource("final.fxml"));
  Scene scene = new Scene(root);
  
  
  // Scene scene = new Scene(root, 300, 250);
  
  primaryStage.setTitle("MKP");
        primaryStage.setScene(scene);
        primaryStage.show();
        
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());

      }
      
    }

  



public static void main(String[] args) {
  launch(args);
}

public void bfs() {
  System.out.println("A*");
}

} 