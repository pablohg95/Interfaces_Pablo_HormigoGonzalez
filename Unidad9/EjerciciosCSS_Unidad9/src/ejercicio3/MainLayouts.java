package ejercicio3;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainLayouts extends Application {
	
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts.class.getResource("MainLayouts.fxml"));
			rootLayout = (BorderPane)loader.load();
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add("ejercicio3/estilosej3.css");
			primaryStage.setTitle("Ejercicio3CSS_Unidad9");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
