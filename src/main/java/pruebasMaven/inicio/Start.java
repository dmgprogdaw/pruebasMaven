package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;

public class Start {

	public static void main(String[] args) {

//		AsignaturaBean lengua = new AsignaturaBean();
//		lengua.setNombre("Lengua");
//		
//		AsignaturaBean mates = new AsignaturaBean();
//		mates.setNombre("Matematicas");
//		
//		CreateAsignatura createAsignatura = new CreateAsignatura();
//		createAsignatura.create(lengua);
//		createAsignatura.create(mates);
		
		
		AlumnoBean david = new AlumnoBean();
		david.setId(1L);
		
		DeleteAlumno deleteAlumno = new DeleteAlumno();
		deleteAlumno.delete(david);
		
//		AlumnoBean ascheriit = new AlumnoBean();
//		ascheriit.setNombre("Ascheriit");
//		ascheriit.setTelefono("698152857");
//		ascheriit.setCiudad("Jerb");
//		
//		CreateAlumno createAlumno = new CreateAlumno();
//		createAlumno.create(david);
//		createAlumno.create(ascheriit);
	}

}
