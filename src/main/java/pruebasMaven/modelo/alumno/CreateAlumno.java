package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;

public class CreateAlumno {

	public void create(AlumnoBean alumno) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.david.pruebasMaven.H2");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(alumno);
		entityManager.getTransaction().commit();
		entityManager.close();
				
	}

}
