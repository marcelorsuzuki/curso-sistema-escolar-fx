package br.com.curso.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Table extends Stage {
	
	public void init() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("table.fxml"));
			Scene scene = new Scene(root, 600, 400);
			this.setScene(scene);
			this.show();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}	

}
