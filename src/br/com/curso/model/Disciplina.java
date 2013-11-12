package br.com.curso.model;



import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Marcelo
 */
public class Disciplina {

	private String nome;
	private float nota[];
	private int falta[];
	private int Falta;
	private float Media;

	public Disciplina() {
		nota = new float[4];
		falta = new int[4];

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


public int getFalta1() {
	return falta[0];
}
public void setFalta1(int falta1) {
	this.falta[0] = falta1;
}
public int getFalta2() {
	return falta[1];
}

public void setFalta2(int falta2) {
this.falta[1] = falta2;
}

public int getFalta3() {
	return falta[2];
}

public void setFalta3(int falta3) {
	this.falta[2] = falta3;
}
public int getFalta4() {
	return falta[3];
}
public void setFalta4(int falta4) {
	this.falta[3] = falta4;
}

public void setNotaB1(float nota) {
		this.nota[0] = nota;
	}

	public float getNotaB1() {
		return nota[0];
	}

	public void setNotaB2(float nota) {
		this.nota[1] = nota;
	}

	public float getNotaB2() {
		return nota[1];
	}

	public void setNotaB3(float nota) {
		this.nota[2] = nota;
	}

	public float getNotaB3() {
		return nota[2];
	}

	public void setNotaB4(float nota) {
		this.nota[3] = nota;
	}

	public float getNotaB4() {
		return nota[3];
	}
	public void setMedia(float Media) {
		this.Media = Media;
	}

	public float getMedia() {
		float soma = 0;
		for (int i = 0; i < 4; i++) {
			soma += nota[i];
		}
		return (soma / 4);
	}
	public void setFalta(int Falta) {
		this.Falta = Falta;
	}

	public int getFalta(){
		int soma = 0;
		for (int i = 0; i < 4; i++) {
			soma += falta[i];
		}
		return soma;

	}
	
	

}