package pruebasMaven.modelo.profesor;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.ProfesorBean;
import pruevasMaven.modelo.util.ConnectionEntityManagerFactory;

public class CreateProfesor {
	
	
	public void create(ProfesorBean profesor) {

		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();;
		entityManager.persist(profesor);
		entityManager.getTransaction().commit();;
				
	}
}
