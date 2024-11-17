package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import co.edu.uniquindio.poo.Model.Concesionario;
import co.edu.uniquindio.poo.ViewController.BienvenidoVC;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    public static Concesionario concesionario = new Concesionario("UQ");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Bienvenido");
        openViewPrincipal();
    }

    private void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/primary.fxml"));
            SplitPane rootLayout = (SplitPane) loader.load();
            BienvenidoVC BienvenidoVC = loader.getController();
            BienvenidoVC.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    

    public void inicializarData(){
    }

}