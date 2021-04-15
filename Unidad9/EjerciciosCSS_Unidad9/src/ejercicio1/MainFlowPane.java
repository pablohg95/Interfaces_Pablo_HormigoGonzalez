package ejercicio1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class MainFlowPane extends Application {

	private FlowPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		try {
			// Carga el diseño del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFlowPane.class.getResource("FlowPaneLayout.fxml"));
			rootLayout = (FlowPane) loader.load();

			// Mostramos la escena del FlowPane de la variable rootLayot
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			scene.getStylesheets().add("ejercicio1/ejercicio1.css");
			//scene.getStylesheets().add("ejercicio1/ejercicio1Horizontal.css");
			primaryStage.setTitle("Ejercicio 1");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}