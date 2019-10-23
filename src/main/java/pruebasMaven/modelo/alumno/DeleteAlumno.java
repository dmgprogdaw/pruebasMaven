package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.AlumnoBean;
import pruevasMaven.modelo.util.Connection;

public class DeleteAlumno {
	
	public void delete(AlumnoBean alumno) {
		
		
		EntityManager conexion = Connection.getEntityManager();
		
		conexion.getTransaction().begin();
		AlumnoBean alumnoBorrar = conexion.find(AlumnoBean.class, alumno.getId());
		conexion.remove(alumnoBorrar);
		conexion.getTransaction().commit();
		conexion.close();
				
	}
}
