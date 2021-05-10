package eventosValidar;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controlador {
	
	@FXML
	private Button btnMostrar;
	
	@FXML
	private TextField textFieldPrincipal;
	
	@FXML
	private void initialize() {
		
		TextInputDialog textDialog = new TextInputDialog();
		textDialog.setTitle("Ejemplo de diálogo");
		textDialog.setHeaderText("Diálogo para introducir un texto");
		
		DialogPane textFieldDialog = textDialog.getDialogPane();
		
		textFieldDialog.addEventFilter(KeyEvent.KEY_TYPED, e ->{
			if(Character.isLowerCase(e.getCharacter().charAt(0))) {
				e.consume();
			}
		});
		
		textFieldDialog.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent e) {
				if(e.getCode().equals(KeyCode.ENTER) || e.getCode().equals(KeyCode.ESCAPE)) {
					e.consume();
				}
			}
		});
		
		btnMostrar.setOnAction(e ->{
			textDialog.showAndWait().ifPresent(response ->{
				textFieldPrincipal.setText(textDialog.getResult());
				textFieldPrincipal.requestFocus();
			});
		});
		
		textFieldPrincipal.setOnMouseEntered(e->{
			textFieldPrincipal.setCursor(Cursor.HAND);
		});
	}

}
