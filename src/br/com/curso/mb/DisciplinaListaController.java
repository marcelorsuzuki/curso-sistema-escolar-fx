package br.com.curso.mb;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.curso.model.Aluno;
import br.com.curso.model.Disciplina;
import br.com.curso.view.StageGeneric;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class DisciplinaListaController implements Initializable {
	@FXML
	AnchorPane root; 
	@FXML
	TableView<Disciplina> TableMedia;

	@FXML
	TableColumn<Disciplina, String> diciplina;

	@FXML
	TableColumn<Disciplina, Float> m1;

	@FXML
	TableColumn<Disciplina, Integer> f1;

	@FXML
	TableColumn<Disciplina, Float> m2;

	@FXML
	TableColumn<Disciplina, Integer> f2;

	@FXML
	TableColumn<Disciplina, Float> m3;

	@FXML
	TableColumn<Disciplina, Integer> f3;

	@FXML
	TableColumn<Disciplina, Float> m4;

	@FXML
	TableColumn<Disciplina, Integer> f4;

	@FXML
	TableColumn<Disciplina, Float> mf;

	@FXML
	TableColumn<Disciplina, Integer> ff;

	ObservableList<Disciplina> data;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		diciplina.setCellValueFactory(new PropertyValueFactory<Disciplina, String>("diciplina"));
		m1.setCellValueFactory(new PropertyValueFactory<Disciplina, Float>("notaB1"));
		f1.setCellValueFactory(new PropertyValueFactory<Disciplina, Integer>("falta1"));
		m2.setCellValueFactory(new PropertyValueFactory<Disciplina, Float>("notaB2"));
		f2.setCellValueFactory(new PropertyValueFactory<Disciplina, Integer>("falta2"));
		m3.setCellValueFactory(new PropertyValueFactory<Disciplina, Float>("notaB3"));
		f3.setCellValueFactory(new PropertyValueFactory<Disciplina, Integer>("falta3"));
		m4.setCellValueFactory(new PropertyValueFactory<Disciplina, Float>("notaB4"));
		f4.setCellValueFactory(new PropertyValueFactory<Disciplina, Integer>("falta4"));
		mf.setCellValueFactory(new PropertyValueFactory<Disciplina, Float>("media"));
		ff.setCellValueFactory(new PropertyValueFactory<Disciplina, Integer>("falta"));
		data = FXCollections.observableArrayList();
		TableMedia.setItems(data);

	}

	public ObservableList<Disciplina> getData() {
		return data;
	}
	
}