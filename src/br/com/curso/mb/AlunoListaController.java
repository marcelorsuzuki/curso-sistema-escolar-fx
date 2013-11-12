package br.com.curso.mb;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import br.com.curso.model.Aluno;
import br.com.curso.view.StageGeneric;

/**
 * Controller da tela de listagem dos alunos
 * 
 * @author Marcelo
 * 
 */
public class AlunoListaController implements Initializable {

	@FXML
	private AnchorPane root;

	@FXML
	TableView<Aluno> tabelaAluno;

	@FXML
	TableColumn<Aluno, String> nome;

	@FXML
	TableColumn<Aluno, String> ra;

	ObservableList<Aluno> data;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		// Propriedades das células da tabela
		nome.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome"));
		ra.setCellValueFactory(new PropertyValueFactory<Aluno, String>("ra"));

		// Cria um novo objeto ObservableArrayList
		data = FXCollections.observableArrayList();

		// Seta o objeto ObservableArrayList criado para a tabela de aluno.
		tabelaAluno.setItems(data);
	}

	
	/**
	 * Método para a chamanda do evento Action do botão Adiciona. Este método 
	 * chama uma janela de cadastro de aluno para adicionar um novo aluno a lista.
	 * 
	 * @param event Objeto ActionEvent
	 */
	@FXML
	private void adicionaAction(ActionEvent event) {

		StageGeneric stage = new StageGeneric("/br/com/curso/view/aluno_cadastra.fxml");
		stage.setLargura(315);
		stage.setAltura(190);
		stage.setPreviousController(this);
		stage.init();
	}

	
	/**
	 * Método para a chamanda do evento Action do botão Apaga. Este método 
	 * apaga um aluno da tabela.
	 * 
	 * @param event Objeto ActionEvent
	 */
	@FXML
	private void apagaAction(ActionEvent event) {

		//Seleciona a linha
		int selectedIndex = tabelaAluno.getSelectionModel().getSelectedIndex();

		//Apaga a linha
		tabelaAluno.getItems().remove(selectedIndex);
	}


	/**
	 * Método para a chamanda do evento Action do botão Registra Nota. 
	 * Este chama uma janela para registrar as notas do aluno.
	 * 
	 * @param event Objeto ActionEvent
	 */
	@FXML
	private void registraNotaAction(ActionEvent event) {
		StageGeneric stage = new StageGeneric("/br/com/curso/view/disciplina_lista.fxml");
		stage.setLargura(870);
		stage.setAltura(400);
		stage.setPreviousController(this);
		stage.init();
	}
	
	
	/**
	 * Obtém a ObservableList do Controller da tabela Aluno da tela "aluno_lista.fxml"
	 *  
	 * @return Lista contendo os alunos da tabela.
	 */
	public ObservableList<Aluno> getData() {
		return data;
	}
	
}