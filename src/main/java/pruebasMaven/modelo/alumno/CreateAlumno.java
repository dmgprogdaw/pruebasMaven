package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;

import pruebasMaven.negocio.AlumnoBean;

import pruevasMaven.modelo.util.Connection;

public class CreateAlumno {

	public void create(AlumnoBean alumno) {

		EntityManager entityManager = Connection.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(alumno);
		entityManager.getTransaction().commit();;
				
	}

}
