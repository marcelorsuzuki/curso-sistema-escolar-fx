package br.com.curso.mb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import br.com.curso.model.Aluno;
import br.com.curso.view.StageGeneric;

/**
 * Controller da tela de cadastro de alunos.
 * 
 * @author Marcelo
 *
 */
public class AlunoCadastroController {
	
	@FXML
	private AnchorPane root;
	
	@FXML
	private TextField nome;
	
	@FXML
	private TextField ra;
	
	/**
	 * Método para a chamada do evento Action do botão Cadastrar.
	 * Este método cadastra um novo objeto aluno na tabela.
	 * 
	 * @param event Objeto ActionEvent
	 */
	@FXML
	public void cadastrarAction(ActionEvent event) {

		//Cria um objeto Aluno e seta seus atributos
    	Aluno p = new Aluno();
    	p.setNome(nome.getText());
    	p.setRa(ra.getText());
    	
    	//Obtém a tabela de aluno da janela aluno_lista.fxml, e adiciona
    	//o objeto Aluno criado nesta lista.
    	ObservableList<Aluno> data = getTableAluno();
    	data.add(p);

    	//Obtém o Stage (janela) referente a este handler para fechá-la.
    	StageGeneric s = getStage();
    	s.close();
	}
	
	
	/**
	 * Obtém a ObservableList do Controller da tabela Aluno da tela "aluno_lista.fxml"
	 *  
	 * @return Lista contendo os alunos da tabela.
	 */
	private ObservableList<Aluno> getTableAluno() { 
        StageGeneric stage =  getStage(); 
        AlunoListaController controller = (AlunoListaController) stage.getPreviousController(); 
        return controller.getData(); 
	} 	

	
	/**
	 * Obtém a janela deste Controller
	 *  
	 * @return Objeto Stage (janela) referente a este controller.
	 */
	private StageGeneric getStage() {
		return (StageGeneric) root.getScene().getWindow();
	}
}
