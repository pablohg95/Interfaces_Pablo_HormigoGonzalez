package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class MainLayouts extends Application {
	
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts.class.getResource("MainLayouts.fxml"));
			rootLayout = (BorderPane)loader.load();
			Scene scene = new Scene(rootLayout);
			primaryStage.setTitle("ControlesAvanzados_Unidad8");
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
