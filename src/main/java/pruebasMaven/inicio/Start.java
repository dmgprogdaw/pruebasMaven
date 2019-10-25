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
		
		ProfesorBean pablo = new ProfesorBean();
		pablo.setNombre("Pablo");
		

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
		
		AsignaturaBean diseño = new AsignaturaBean();
		diseño.setNombre("Diseño de Interfaces Web");
		diseño.setProfesor(pablo);
		
		
		AlumnoBean david = new AlumnoBean();
		david.setNombre("David");
		david.setTelefono("6896044093");
		david.setCiudad("Corigos");
		
		AlumnoBean ato = new AlumnoBean();
		ato.setNombre("Ato");
		ato.setTelefono("698152857");
		ato.setCiudad("Kusharundo");
		
		AlumnoBean teresa = new AlumnoBean();
		teresa.setNombre("Teresa");
		teresa.setTelefono("123789852");
		teresa.setCiudad("Rabona");
		

		filosofia.addAlumno(david);
		filosofia.addAlumno(ato);
		
		
		CreateProfesor createProfesor = new CreateProfesor();
		createProfesor.create(marcos);
		createProfesor.create(monica);
		createProfesor.create(pablo);
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(lengua);
		createAsignatura.create(mates);
		createAsignatura.create(filosofia);
		createAsignatura.create(historia);
		createAsignatura.create(diseño);
		
		
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(david);
		createAlumno.create(ato);
		createAlumno.create(teresa);
		
		marcos.setNombre("Julio");
		
		
		AsignaturaBean nueva = Connection.getEntityManager().find(AsignaturaBean.class, 4L);	
		System.out.println(nueva);
		
		Connection.getEntityManager().close();;
	}

}
