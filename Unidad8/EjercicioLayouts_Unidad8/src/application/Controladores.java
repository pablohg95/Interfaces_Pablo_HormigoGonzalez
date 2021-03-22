package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.control.cell.ComboBoxListCell;


public class Controladores {
	
	@FXML
	private ChoiceBox<Object> choice1;

	@FXML
	private ListView<String> lista1;
	
	public static final ObservableList<String> opcionesLista = FXCollections.observableArrayList();
	public static final ObservableList<String> listaPrincipal = FXCollections.observableArrayList();
	
	@FXML
    private void initialize() {
		choice1.setValue("Select a value...");
		choice1.getItems().addAll("New York","Orlando",new Separator(),"London","Manchester");
		
		opcionesLista.addAll("Objetcs","Classes","Functions","Variables","Compiler","Debugger",
				"Projects","Beans","Libraries","Modules");
		
		for(int i=0;i<10;i++) {
			listaPrincipal.add("Indeterminate (pick a choice)");
		}
		
		lista1.setItems(listaPrincipal);
		lista1.setCellFactory(ComboBoxListCell.forListView(opcionesLista));
	}

}
