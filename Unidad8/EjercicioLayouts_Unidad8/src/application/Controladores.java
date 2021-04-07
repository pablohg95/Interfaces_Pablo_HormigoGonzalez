package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controladores {
	
	@FXML
	private ChoiceBox<Object> choice1;

	@FXML
	private ListView<String> lista1;
	
	public static final ObservableList<String> opcionesLista = FXCollections.observableArrayList();
	public static final ObservableList<String> listaPrincipal = FXCollections.observableArrayList();
	
	@FXML
    private TreeView<String> treeVista;
	
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
		
		TreeItem<String> padre;
		try {
			ImageView imagen = new ImageView(new Image(new FileInputStream("src\\imgs\\carpeta.png")));
			imagen.setFitHeight(15);
			imagen.setFitWidth(15);
			
			padre = new TreeItem<String>("Inbox",imagen);
			padre.getChildren().add(new TreeItem<String>("Sales"));
			padre.getChildren().add(new TreeItem<String>("Marketing"));
			padre.getChildren().add(new TreeItem<String>("Distribution"));
			padre.getChildren().add(new TreeItem<String>("Costs"));
			
			treeVista.setCellFactory(TextFieldTreeCell.forTreeView());
			
			padre.setExpanded(true); 
	        treeVista.setRoot(padre); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
