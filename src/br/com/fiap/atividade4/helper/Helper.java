package br.com.fiap.atividade4.helper;

import java.util.List;
import javax.persistence.Query;

import br.com.fiap.atividade4.entity.MatMed;
import br.com.fiap.atividade4.entity.Paciente;
import br.com.fiap.atividade4.entity.Procedimento;

import javax.persistence.EntityManager;

public class Helper {
	private EntityManager em;
	
	public Helper(EntityManager em){
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	public List<Paciente> listarPaciente(){
		Query query = em.createQuery("select p from Paciente p"); 
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Procedimento> listarProcedimento(Paciente paciente){
		Query query = em.createQuery("select pr from PROCEDIMENTO pr where CPFPACIENTE = :pacienteCPF"); 
		query.setParameter("pacienteCPF", paciente.getCpf());
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<MatMed> listarMatMed(Paciente paciente){
		Query query = em.createQuery("select m from MATMAD m where CPFPACIENTE = :pacienteCPF"); 
		query.setParameter("pacienteCPF", paciente.getCpf());
		return query.getResultList();
	}
}
