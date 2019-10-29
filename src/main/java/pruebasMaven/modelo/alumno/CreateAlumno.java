package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;

import pruebasMaven.negocio.AlumnoBean;
import pruevasMaven.modelo.util.ConnectionEntityManagerFactory;


public class CreateAlumno {

	public void create(AlumnoBean alumno) {

		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(alumno);
		entityManager.getTransaction().commit();;
				
	}

}
