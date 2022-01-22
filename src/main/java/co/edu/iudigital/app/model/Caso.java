package co.edu.iudigital.app.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "casos")
public class Caso implements Serializable{
	
	
	
	
	
	
	
	
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fecha_hora")
	private LocalDate fechahora;
	
	
	private float latitud;
	
	private boolean visible;
	
	private String description;
	
	@Column(name = "url")
	private String rmiUrl;
	
	@ManyToOne
	@JoinColumn(name = "usuarios_id")
	private String usuarios;
	
	@ManyToOne
	@JoinColumn(name = "delitos_id")
	private Delitos delito;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFechahora() {
		return fechahora;
	}

	public void setFechahora(LocalDate fechahora) {
		this.fechahora = fechahora;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRmiUrl() {
		return rmiUrl;
	}

	public void setRmiUrl(String rmiUrl) {
		this.rmiUrl = rmiUrl;
	}

	public String getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}

	public Delitos getDelito() {
		return delito;
	}

	public void setDelito(Delitos delito) {
		this.delito = delito;
	}
	
	

}
