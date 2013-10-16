package br.com.curso.application;

import javafx.application.Application;
import javafx.stage.Stage;
import br.com.curso.view.Table;

public class SistemaEscolar extends Application {

		
	@Override
	public void start(Stage primaryStage) {
		try {
			Table stage = new Table();
			stage.init();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
