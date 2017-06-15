package br.com.fiap.atividade4.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE")
public class Paciente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5394012692827366502L;

	@Id
	@Column(name = "CPFPACIENTE")
	private String cpf;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "DATANASC")
	private Date datanasc;
	
	@Column(name = "TELEFONE")
	private String telefone;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "paciente")
	private Set<AgendaPaciente> agendaPacientes = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "paciente")
	private Set<MatMed> matMeds = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "paciente")
	private Set<Procedimento> procedimentos = new HashSet<>();

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Set<AgendaPaciente> getAgendaPacientes() {
		return agendaPacientes;
	}

	public void setAgendaPacientes(Set<AgendaPaciente> agendaPacientes) {
		this.agendaPacientes = agendaPacientes;
	}

	public Set<MatMed> getMatMeds() {
		return matMeds;
	}

	public void setMatMeds(Set<MatMed> matMeds) {
		this.matMeds = matMeds;
	}

	public Set<Procedimento> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(Set<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}

	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", nome=" + nome + ", datanasc=" + datanasc + ", telefone=" + telefone
				+ ", agendaPacientes=" + agendaPacientes + ", getMatMeds()=" + getMatMeds() + ", getProcedimentos()="
				+ getProcedimentos() + "]";
	}
	
	
	
}
