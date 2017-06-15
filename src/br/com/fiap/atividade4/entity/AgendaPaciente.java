package br.com.fiap.atividade4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AGENDAPACIENTE")
public class AgendaPaciente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8274072630277167846L;

	@Id
	@Column(name = "AGENDAID")
	private int agenda_id;
	
	@Column(name = "PACIENTECPF")
	private String paciente_cpf;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDAGENDA")
	private Agenda agenda;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPFPACIENTE")
	private Paciente paciente;

	public int getAgenda_id() {
		return agenda_id;
	}

	public void setAgenda_id(int agenda_id) {
		this.agenda_id = agenda_id;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	
	
}
