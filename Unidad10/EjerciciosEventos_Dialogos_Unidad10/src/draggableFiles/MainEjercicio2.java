package draggableFiles;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainEjercicio2 extends Application{
	
	private AnchorPane rootLayout;

	@Override
	public void start(Stage primaryStage){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainEjercicio2.class.getResource("/draggableFiles/FXMLEjercicio2.fxml"));
			rootLayout = (AnchorPane)loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ejercicio 2");
			primaryStage.setResizable(false);
			primaryStage.show();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
