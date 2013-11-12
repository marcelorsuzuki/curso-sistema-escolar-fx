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

public class DisciplinaCadrastroController {
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

	@FXML
	public void rgnotaAction(ActionEvent event) {
		Disciplina p = new Disciplina();
		p.setFalta1(Integer.parseInt(f1.getText()));
		p.setNotaB1(Float.parseFloat(m1.getText()));
		p.setFalta2(Integer.parseInt(f2.getText()));
		p.setNotaB2(Float.parseFloat(m2.getText()));
		p.setFalta3(Integer.parseInt(f3.getText()));
		p.setNotaB3(Float.parseFloat(m3.getText()));
		p.setFalta4(Integer.parseInt(f4.getText()));
		p.setNotaB4(Float.parseFloat(m4.getText()));
		StageGeneric s = getStage();
		ObservableList<Disciplina> data = getTableMedia();
		data.add(p);

		s.close();

	}

	private ObservableList<Disciplina> getTableMedia() {
		StageGeneric stage = getStage();
		DisciplinaListaController controller = (DisciplinaListaController) stage
				.getPreviousController();
		return controller.getData();
	}

	private StageGeneric getStage() {
		return (StageGeneric) root.getScene().getWindow();
	}

}
