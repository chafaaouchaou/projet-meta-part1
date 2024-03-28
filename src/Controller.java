import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;
// import STYLESHEET_CASPIAN


public class Controller implements Initializable {

    @FXML
    private TextField profdfs;

    @FXML
    private ListView<String> sacsListView;

    @FXML
    private ListView<String> itemsListView;

    private File selectedSacsFile;
    private File selectedItemsFile;

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
    Obj node = new Obj(null, null, 0, 0);
    List<Obj> bestcombo = new ArrayList<>();
    List<Obj1> bestcomboob1 = new ArrayList<>();
    int Bestbenef = 0;
    long startTime;
    long endTime;
    long duration;
    ////////////////////////////////////////////////////////////////////////////

    @FXML
    void clearcontent(ActionEvent event) {
        // nbitems.clear();
        // nbsacs.clear();
        lable1.setText("");
        lable2.setText("");
        chemain = "";
        lable11.setText("");
        lable111.setText("");
        lable21.setText("");
        lable211.setText("");
        labtemp.setText("");
        labtemp1.setText("");
        labtemp11.setText("");

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

            if (selectedSacsFile == null || selectedItemsFile == null) {
                // Display an error message if the user hasn't selected both files
                // You can show this message in a label or dialog box
                System.out.println("Please select both Sacs and Items files.");
                return;
            }


            sacs = Data.getSacs(nbsacsInt, "src\\csv\\"+selectedSacsFile.getName());
            sacs.add(new Sac(nbsacsInt, 0));
            items = Data.getItems(nbItemsInt, "src\\csv\\"+selectedItemsFile.getName());

            for (Sac sac : sacs) {
                System.out.println("sac: " + sac.nom + " - " + sac.Capasite);

            }

            for (Item item : items) {
                System.out.println("item: " + item.nom + " - " + item.poids + " - " + item.valeur);

            }

            int totalv = 0;
            for (Item item : items) {
                totalv += item.valeur;
            }

            Obj1 node1 = new Obj1(null, null, 0, 0, totalv);

            startTime = System.nanoTime();
            Retresult1 bestresult = MkpAstar.Starsolver(node1, items.size(), sacs, items, bestcomboob1, Bestbenef);
            endTime = System.nanoTime();

            duration = endTime - startTime;
            labtemp11.setText("Time: " + duration / 1000000 + " ms");
            System.out.println("Bestbenef " + bestresult.value);

            lable111.setText("Best value " + bestresult.value);

            for (Obj1 obj : bestresult.path) {
                if (obj.sac.nom != sacs.size() - 1) {

                    chemain = chemain + "S " + obj.sac.nom + " - " + "I " + obj.item.nom + "\n";
                    System.out.println("S " + obj.sac.nom + " - " + "I " + obj.item.nom);
                }
                lable211.setText(chemain);

            }
            bestresult.path.clear();

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
            // System.out.println("nbItemsInt: " + nbItemsInt);
            // System.out.println("nbsacsInt: " + nbsacsInt);
            // nbsacsInt += 1;

            if (selectedSacsFile == null || selectedItemsFile == null) {
                // Display an error message if the user hasn't selected both files
                // You can show this message in a label or dialog box
                System.out.println("Please select both Sacs and Items files.");
                return;
            }


            sacs = Data.getSacs(nbsacsInt, "src\\csv\\"+selectedSacsFile.getName());
            sacs.add(new Sac(nbsacsInt, 0));
            items = Data.getItems(nbItemsInt, "src\\csv\\"+selectedItemsFile.getName());

            startTime = System.nanoTime();

            Retresult bestresult = MkpBfs.bfs(node, items.size(), sacs, items, bestcombo, Bestbenef);
            endTime = System.nanoTime();

            duration = endTime - startTime;
            labtemp.setText("Time: " + duration / 1000000 + " ms");
            // System.out.println("Bestbenef "+bestresult.value);

            lable1.setText("Best value " + bestresult.value);

            for (Obj obj : bestresult.path) {
                if (obj.sac.nom != sacs.size() - 1) {

                    chemain = chemain + "S " + obj.sac.nom + " - " + "I " + obj.item.nom + "\n";
                    // System.out.println("S " +obj.sac.nom +" - "+"I " +obj.item.nom );
                }
                lable2.setText(chemain);

            }
            bestresult.path.clear();

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
        String profdfss = profdfs.getText();
        int profdfssInt = -1;
            
            try {
                
                profdfssInt = Integer.parseInt(profdfss);
                
            } catch (Exception e) {
                profdfssInt= -1;
            }
        

        try {
            int nbItemsInt = Integer.parseInt(nbitemss);
            int nbsacsInt = Integer.parseInt(nbsacss);

            if (selectedSacsFile == null || selectedItemsFile == null) {
                System.out.println("Please select both Sacs and Items files.");
                return;
            }


            sacs = Data.getSacs(nbsacsInt, "src\\csv\\"+selectedSacsFile.getName());
            sacs.add(new Sac(nbsacsInt, 0));
            items = Data.getItems(nbItemsInt, "src\\csv\\"+selectedItemsFile.getName());


            startTime = System.nanoTime();
            Retresult bestresult = MkpDFS.dfs(node, items.size(), sacs, items, bestcombo, Bestbenef,profdfssInt);
            endTime = System.nanoTime();

            duration = endTime - startTime;
            labtemp1.setText("Time: " + duration / 1000000 + " ms");
            System.out.println("Bestbenef " + bestresult.value);

            lable11.setText("Best value " + bestresult.value);

            for (Obj obj : bestresult.path) {
                if (obj.sac.nom != sacs.size() - 1) {

                    chemain = chemain + "S " + obj.sac.nom + " - " + "I " + obj.item.nom + "\n";
                    System.out.println("S " + obj.sac.nom + " - " + "I " + obj.item.nom);
                }
                lable21.setText(chemain);

            }
            bestresult.path.clear();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @FXML
    private void startProcessing() {
        if (selectedSacsFile == null || selectedItemsFile == null) {
            // Display an error message if the user hasn't selected both files
            // You can show this message in a label or dialog box
            System.out.println("Please select both Sacs and Items files.");
            return;
        }

        // Call your processing method with the selected files
        System.out.println("Selected Sacs File: " + selectedSacsFile.getName());
        System.out.println("Selected Items File: " + selectedItemsFile.getName());

        // Add your processing logic here
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Initialize the ListView items
        
        String rep = "src/csv";
        List<File> fichiersSacs = Detectcsv.listerFichiersParMotCle(rep, "sacs");
        List<File> fichiersItems = Detectcsv.listerFichiersParMotCle(rep, "items");

        for (File file : fichiersSacs) {
            sacsListView.getItems().add(file.getName());
        }

        for (File file : fichiersItems) {
            itemsListView.getItems().add(file.getName());
        }

        // Set event handlers for ListView selection
        sacsListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedSacsFile = new File(rep + File.separator + newValue);
        });

        itemsListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedItemsFile = new File(rep + File.separator + newValue);
        });
    }

}
