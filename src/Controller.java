// import java.net.URL;
// import java.util.ResourceBundle;

// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.fxml.Initializable;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;

// public class Controller implements Initializable {
//     @FXML
//     private TextField inputField;

//     @FXML
//     private Label displayLabel;

//     @FXML
//     private void displayText(ActionEvent event) {
//         String text = inputField.getText();
//         displayLabel.setText(text);
//     }
//     @Override
//     public void initialize(URL location, ResourceBundle resources) {
//         // TODO
//     }
// }

// import java.io.IOException;

// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.stage.Stage;
// import javafx.scene.Node; // Import the missing Node class

// public class Controller {
//     @FXML
//         private TextField inputField;
    
//         @FXML
//         private Label displayLabel;

//     @FXML
//     private void displayText(ActionEvent event) {
//         String text = inputField.getText();
//         displayLabel.setText(text);
//     }

//     @FXML
//     private TextField id1;

//     @FXML
//     private TextField id11;

//     @FXML
//     void STARTAstar(ActionEvent event) throws IOException {
//         System.out.println("A*");
//         Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//         Parent root1 = FXMLLoader.load(getClass().getResource("Seane.fxml"));
//         Scene scene = new Scene(root1);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     @FXML
//     void StartBFS(ActionEvent event) {

//     }

//     @FXML
//     void startDFS(ActionEvent event) {

//     }

//     @FXML
//     void stop(ActionEvent event) {

//     }

// }
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nbitems;

    @FXML
    private TextField nbsacs;

     @FXML
    private Label lable1;

    @FXML
    private Label lable11;

    @FXML
    private Label lable111;

    @FXML
    private Label lable2;

    @FXML
    private Label lable21;

    @FXML
    private Label lable211;

    @FXML
    private Label labtemp;

    @FXML
    private Label labtemp1;

    @FXML
    private Label labtemp11;

////////////////////////////////////////////////////////////////////////////
    String chemain = "";
    String chemain2 = "";
    String chemain3 = "";
    List<Sac> sacs = new ArrayList<>();
    List<Item> items = new ArrayList<>();
    Obj node = new Obj(null, null, 0,0);
    List<Obj> bestcombo = new ArrayList<>();
    List<Obj1> bestcomboob1 = new ArrayList<>();
    int Bestbenef = 0;
    long startTime;
    long endTime ;
    long duration;
////////////////////////////////////////////////////////////////////////////

    @FXML
    void clearcontent(ActionEvent event) {
        // nbitems.clear();
        // nbsacs.clear();
        lable1.setText("");
        lable2.setText("");
        chemain = "";

    }

    @FXML
    void startastar(ActionEvent event) {
        lable111.setText("");
        lable211.setText("");
        chemain = "";
        sacs.clear();
        items.clear();
        Bestbenef = 0;


        

        String nbitemss = nbitems.getText();
        String nbsacss = nbsacs.getText();

        try {
            int nbItemsInt = Integer.parseInt(nbitemss);
            int nbsacsInt = Integer.parseInt(nbsacss);
            System.out.println("nbItemsInt: " + nbItemsInt);
            System.out.println("nbsacsInt: " + nbsacsInt);
            nbsacsInt+=1;
            
             sacs =Data.getSacs(nbsacsInt);
             items = Data.getItems(nbItemsInt);
             System.out.println("sacs: " + sacs.size());
             System.out.println("items: " + items.size());
             Obj1 node1 = new Obj1(null, null, 0,0,0);

             
                 startTime = System.nanoTime();
                 Retresult1 bestresult = MkpAstar.Starsolver(node1,items.size(),sacs,items,bestcomboob1,Bestbenef);;
                 endTime = System.nanoTime();

           duration = endTime - startTime;
           labtemp11.setText("Time: "+duration/1000000+" ms");
           System.out.println("Bestbenef "+bestresult.value);

           lable111.setText("Best value "+bestresult.value);
            
           
           for (Obj1 obj : bestresult.path) {
               if (obj.sac.nom!=sacs.size()-1) {
                   
                chemain=chemain+"S " +obj.sac.nom +" - "+"I " +obj.item.nom  +"\n";
               System.out.println("S " +obj.sac.nom +" - "+"I " +obj.item.nom  );
           }
           lable211.setText(chemain);

       }




        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    @FXML
    void startbfs(ActionEvent event) {
        lable1.setText("");
        lable2.setText("");
        chemain = "";
        sacs.clear();
        items.clear();
        Bestbenef = 0;
        

        String nbitemss = nbitems.getText();
        String nbsacss = nbsacs.getText();
        
        
        try {
            int nbItemsInt = Integer.parseInt(nbitemss);
            int nbsacsInt = Integer.parseInt(nbsacss);
            System.out.println("nbItemsInt: " + nbItemsInt);
            System.out.println("nbsacsInt: " + nbsacsInt);
            nbsacsInt+=1;
            
             sacs =Data.getSacs(nbsacsInt);
             items = Data.getItems(nbItemsInt);
             System.out.println("sacs: " + sacs.size());
                System.out.println("items: " + items.size());
             
                 startTime = System.nanoTime();
                 Retresult bestresult = MkpBfs.bfs(node,items.size(),sacs,items,bestcombo,Bestbenef );
                 endTime = System.nanoTime();

           duration = endTime - startTime;
           labtemp.setText("Time: "+duration/1000000+" ms");
           System.out.println("Bestbenef "+bestresult.value);

           lable1.setText("Best value "+bestresult.value);
            
           
           for (Obj obj : bestresult.path) {
               if (obj.sac.nom!=sacs.size()-1) {
                   
                chemain=chemain+"S " +obj.sac.nom +" - "+"I " +obj.item.nom  +"\n";
               System.out.println("S " +obj.sac.nom +" - "+"I " +obj.item.nom  );
           }
           lable2.setText(chemain);

       }




        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    

    }

    @FXML
    void startdfs(ActionEvent event) {
        lable11.setText("");
        lable21.setText("");
        chemain = "";
        sacs.clear();
        items.clear();
        Bestbenef = 0;


        

        String nbitemss = nbitems.getText();
        String nbsacss = nbsacs.getText();


        try {
            int nbItemsInt = Integer.parseInt(nbitemss);
            int nbsacsInt = Integer.parseInt(nbsacss);
            System.out.println("nbItemsInt: " + nbItemsInt);
            System.out.println("nbsacsInt: " + nbsacsInt);
            nbsacsInt+=1;
            
             sacs =Data.getSacs(nbsacsInt);
             items = Data.getItems(nbItemsInt);
             System.out.println("sacs: " + sacs.size());
                System.out.println("items: " + items.size());
             
                 startTime = System.nanoTime();
                 Retresult bestresult = MkpDFS.dfs(node,items.size(), sacs,items,bestcombo,Bestbenef);
                 endTime = System.nanoTime();

           duration = endTime - startTime;
           labtemp1.setText("Time: "+duration/1000000+" ms");
           System.out.println("Bestbenef "+bestresult.value);

           lable11.setText("Best value "+bestresult.value);
            
           
           for (Obj obj : bestresult.path) {
               if (obj.sac.nom!=sacs.size()-1) {
                   
                chemain=chemain+"S " +obj.sac.nom +" - "+"I " +obj.item.nom  +"\n";
               System.out.println("S " +obj.sac.nom +" - "+"I " +obj.item.nom  );
           }
           lable21.setText(chemain);

       }




        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

















    

}
