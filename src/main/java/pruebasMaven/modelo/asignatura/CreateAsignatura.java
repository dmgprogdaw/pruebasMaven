package pruebasMaven.modelo.asignatura;

import javax.persistence.EntityManager;

import pruebasMaven.negocio.AsignaturaBean;
import pruevasMaven.modelo.util.ConnectionEntityManagerFactory;

public class CreateAsignatura {

	public void create(AsignaturaBean asignatura) {

		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();;
		entityManager.persist(asignatura);
		entityManager.getTransaction().commit();;
				
	}

}
