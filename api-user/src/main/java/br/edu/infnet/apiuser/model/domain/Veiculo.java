package br.edu.infnet.apiuser.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TVeiculo")
public class Veiculo extends Carga {

	private String chassi;
	private String montadora;
	private String modelo;

	@Override
	public String retornaNavio() {
		return "O navio do veiculo " + this.chassi + " é o " + super.getNavio() + "!";
	}

	public Veiculo(String navio, String documento, String porto) {
		super(navio, documento, porto);

	}

//	public Veiculo(String navio, String documento, String porto, String chassi, String montadora, String modelo) {
//		this();
//		this.chassi = chassi;
//		this.montadora = montadora;
//		this.modelo = modelo;
//	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(";");
		sb.append(this.chassi);
		sb.append(";");
		sb.append(this.montadora);
		sb.append(";");
		sb.append(this.modelo);
		return super.toString() + sb.toString();
	}

	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {

		this.chassi = chassi;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
