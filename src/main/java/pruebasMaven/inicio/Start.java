package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.profesor.CreateProfesor;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.negocio.ProfesorBean;
import pruevasMaven.modelo.util.Connection;

public class Start {

	public static void main(String[] args) {
		
		
		ProfesorBean marcos = new ProfesorBean();
		marcos.setNombre("Marcos");
		
		ProfesorBean monica = new ProfesorBean();
		monica.setNombre("Monica");
		
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("Lengua");
		lengua.setProfesor(monica);
		
		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("Matematicas");
		mates.setProfesor(marcos);
		
		AsignaturaBean filosofia = new AsignaturaBean();
		filosofia.setNombre("Filosofia");
		filosofia.setProfesor(monica);
		
		AsignaturaBean historia = new AsignaturaBean();
		historia.setNombre("historia");
		historia.setProfesor(marcos);
		
			
		AlumnoBean david = new AlumnoBean();
		david.setNombre("David");
		david.setTelefono("6896044093");
		david.setCiudad("Corigos");
		
		AlumnoBean ato = new AlumnoBean();
		ato.setNombre("Ato");
		ato.setTelefono("698152857");
		ato.setCiudad("Kusharundo");
		

		filosofia.addAlumno(david);
		filosofia.addAlumno(ato);
		
		
		CreateProfesor createProfesor = new CreateProfesor();
		createProfesor.create(marcos);
		createProfesor.create(monica);
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(lengua);
		createAsignatura.create(mates);
		createAsignatura.create(filosofia);
		createAsignatura.create(historia);
		
		
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(david);
		createAlumno.create(ato);
		
		
		AsignaturaBean nueva = Connection.getEntityManager().find(AsignaturaBean.class, 4L);	
		System.out.println(nueva);
		
		Connection.getEntityManager().close();;
	}

}
