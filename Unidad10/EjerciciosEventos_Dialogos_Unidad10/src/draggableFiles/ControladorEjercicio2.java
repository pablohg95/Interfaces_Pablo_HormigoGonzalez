package draggableFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;

public class ControladorEjercicio2 {
	
	@FXML
	private Label labelOrigen;
	
	@FXML
	private Label labelDestino;
	
	@FXML
	private ImageView imagen;
	
	@FXML
	private void initialize() {
		
		labelOrigen.setOnDragDetected((event) ->{
			Dragboard db = labelOrigen.startDragAndDrop(TransferMode.MOVE);
			
			ClipboardContent content = new ClipboardContent();
			content.putString(labelOrigen.getText());
			db.setContent(content);
		});
		
		labelDestino.setOnDragOver((event) ->{
			if(event.getGestureSource() != labelDestino && event.getDragboard().hasString()) {
				event.acceptTransferModes(TransferMode.MOVE);
			}
		});
		
		labelDestino.setOnDragDropped((event) -> {
            Dragboard db = event.getDragboard();
            boolean success = false;
            if (db.hasString()) {
                labelDestino.setText(db.getString());
                
                success = true;
            }
            event.setDropCompleted(success);        
        });
		
		labelOrigen.setOnDragDone((event) -> {
            if (event.getTransferMode() == TransferMode.MOVE) {
            	labelOrigen.setText("Operacion drag terminada");
            }
        });
		
	}
	
	@FXML
	private void handlerDragOver(DragEvent event) {
		if(event.getDragboard().hasFiles())
			event.acceptTransferModes(TransferMode.ANY);
	}
	
	@FXML
	private void handleDrop(DragEvent event) {
		List<File> files = event.getDragboard().getFiles();
		try {
			Image img = new Image(new FileInputStream(files.get(0)));
			imagen.setImage(img);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
