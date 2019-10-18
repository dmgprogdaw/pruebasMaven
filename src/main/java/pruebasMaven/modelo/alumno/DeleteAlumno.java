package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;

public class DeleteAlumno {
	
	public void delete(AlumnoBean alumno) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.david.pruebasMaven.H2");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		AlumnoBean alumnoBorrar = entityManager.find(AlumnoBean.class, alumno.getId());
		entityManager.remove(alumnoBorrar);
		entityManager.getTransaction().commit();
		entityManager.close();
				
	}
}
