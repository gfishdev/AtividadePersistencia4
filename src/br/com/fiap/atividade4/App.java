package br.com.fiap.atividade4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.atividade4.entity.Paciente;
import br.com.fiap.atividade4.helper.Helper;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenciaAtividade4");
		EntityManager em = emf.createEntityManager();
			    
		Helper helper = new Helper(em);
		List<Paciente> paciente;
		paciente = helper.listarPaciente();
		
		for(Paciente e:paciente){
			e.getProcedimentos().addAll(helper.listarProcedimento(e));
			e.getMatMeds().addAll(helper.listarMatMed(e));
			System.out.println(e);
		}
				
	}
	
}
