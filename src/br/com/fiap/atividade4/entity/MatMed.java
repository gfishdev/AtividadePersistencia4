package br.com.fiap.atividade4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MATMED")
public class MatMed implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5001997925031764163L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMATMED")
	private int id;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "PRECO")
	private double preco;
	
	@Column(name = "FABRICANTE")
	private String fabricante;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPFPACIENTE")
	private Paciente paciente;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "MatMed [id=" + id + ", descricao=" + descricao + ", preco=" + preco + ", fabricante=" + fabricante
				+ ", paciente=" + paciente + "]";
	}

	
	
}
