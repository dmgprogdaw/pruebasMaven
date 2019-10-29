package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.AlumnoBean;
import pruevasMaven.modelo.util.ConnectionEntityManagerFactory;

public class DeleteAlumno {
	
	public void delete(AlumnoBean alumno) {
		
		
		EntityManager conexion = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		conexion.getTransaction().begin();
		AlumnoBean alumnoBorrar = conexion.find(AlumnoBean.class, alumno.getId());
		conexion.remove(alumnoBorrar);
		conexion.getTransaction().commit();
		conexion.close();
				
	}
}
