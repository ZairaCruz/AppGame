package br.com.laboratorio;


import java.io.Serializable;




import javax.faces.bean.ManagedBean;


@ManagedBean (name="bean")
public class GameBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private boolean perg1;
	private boolean perg2;
	private boolean perg3;
	private boolean perg4;
	private boolean perg5;
	private int soma = 0;
	private String resultado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isPerg1() {
		return perg1;
	}
	public void setPerg1(boolean perg1) {
		this.perg1 = perg1;
	}
	public boolean isPerg2() {
		return perg2;
	}
	public void setPerg2(boolean perg2) {
		this.perg2 = perg2;
	}
	public boolean isPerg3() {
		return perg3;
	}
	public void setPerg3(boolean perg3) {
		this.perg3 = perg3;
	}
	public boolean isPerg4() {
		return perg4;
	}
	public void setPerg4(boolean perg4) {
		this.perg4 = perg4;
	}
	public boolean isPerg5() {
		return perg5;
	}
	public void setPerg5(boolean perg5) {
		this.perg5 = perg5;
	}
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String verificar(){
		if(perg1){
			soma += 1;
		}
		if(perg2){
			soma += 1;
		}
		if(perg3){
			soma += 1;
		}
		if(perg4){
			soma += 1;
		}
		if(perg5){
			soma += 1;
		}
		
		if(soma <= 1){
			this.resultado = "Inocente";
		}
		if(soma == 2){
			this.resultado = "Suspeito(a)";
		}
		if(soma == 3 || soma == 4){
			this.resultado = "Cúmplice";
		}
		if(soma == 5){
			this.resultado = "Assassino(a)";
		}		
		return "result";
	}
		
}
