package pruebasMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="asignaturas")
public class AsignaturaBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;	

	@Column
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="FK_profesor")
	private ProfesorBean profesor;
	
	@ManyToMany(mappedBy = "asignaturas")
	private List<AlumnoBean> alumnos = new ArrayList<AlumnoBean>();
		
	
	public void addAlumno(AlumnoBean alumno) {
		
		if(!alumnos.contains(alumno)) {
			
			alumnos.add(alumno);
			// decirle al alumno que añada esta asignatura
			List<AsignaturaBean> asignaturas = alumno.getAsignaturas();
			if(!asignaturas.contains(this)) {
				
				asignaturas.add(this);
			}
		}
	}
	
	
	public List<AlumnoBean> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(List<AlumnoBean> alumnos) {
		this.alumnos = alumnos;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ProfesorBean getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorBean profesor) {
		this.profesor = profesor;
	}


	@Override
	public String toString() {
		return "AsignaturaBean [id=" + id + ", nombre=" + nombre + ", profesor=" + profesor + ", alumnos=" + alumnos
				+ "]";
	}
	
	
}
