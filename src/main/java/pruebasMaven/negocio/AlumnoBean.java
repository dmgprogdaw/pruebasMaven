package pruebasMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class AlumnoBean {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idAlumno")
	private long id;
	
	@Column(name="nombre")	
	private String nombre;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column
	private String ciudad;
	
	@ManyToOne
	@JoinColumn(name="FK_asignatura")
	private AsignaturaBean asignatura;
	
	
	
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
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public AsignaturaBean getAsignatura() {
		return asignatura;
	}
	
	public void setAsignatura(AsignaturaBean asignatura) {
		this.asignatura = asignatura;
	}
	
	
	@Override
	public String toString() {
		return "AlumnoBean [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", ciudad=" + ciudad
				+ "]";
	}
}
