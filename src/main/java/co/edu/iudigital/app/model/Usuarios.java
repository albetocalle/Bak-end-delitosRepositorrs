package co.edu.iudigital.app.model;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;






@Entity
@Table(name = "usuarios")

public class Usuarios implements Serializable{
	
	
	private static final String NOMBRE_IS_REQUIRED = "nombre is required";

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "Email es obligatorio")
	@Column(unique = true, length = 120)
	private String username;
	
	@Column(length = 120)
	private String password;
	
	@Column(nullable = false, length = 120)
	private String nombre;
	
	@NotEmpty(message = NOMBRE_IS_REQUIRED)
	@Column(nullable = true, length = 120)
	private String apellido;
	
	@Column(name = "fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	private boolean enable;
	
	@Column(name = "red_social")
	private Boolean redSocial;
	
	private String image;
	
	 
		

	 
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the enable
	 */
	public boolean isEnable() {
		return enable;
	}

	/**
	 * @param enable the enable to set
	 */
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	/**
	 * @return the redSocial
	 */
	public Boolean getRedSocial() {
		return redSocial;
	}

	/**
	 * @param redSocial the redSocial to set
	 */
	public void setRedSocial(Boolean redSocial) {
		this.redSocial = redSocial;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
