package com.banregio.next.ejemplos.app.domain.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(
		name="ABCATEGO",
		indexes = {
				@Index(name = "CAT_Nombre_index", 
						columnList = "CAT_Nombre",
						unique = true
						)
				}
		)
public class Categoria {
	
	@Column(name = "CAT_Id")
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	@Column(name = "CAT_Nombre", nullable = false, length = 150)
	private String nombre;
	@Column(name = "CAT_Descri", nullable = true, length = 250)
	private String descripcion;
	@Column(name = "CAT_Usucre", nullable = false)
	private String usuario_crea;
	@Column(name = "CAT_Feccre", nullable = false)
	@JsonFormat(pattern = "ddMMyyyy")
	private Date fecha_crea;		
	@Column(name = "CAT_Usumod", nullable = true, length = 30)
	private String usuario_modifica;
	@Column(name = "CAT_Fecmod", nullable = true, length = 30)
	@JsonFormat(pattern = "ddMMyyyy")
	private Date fecha_modifica;
	
	public Categoria() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUsuario_crea() {
		return usuario_crea;
	}

	public void setUsuario_crea(String usuario_crea) {
		this.usuario_crea = usuario_crea;
	}

	public Date getFecha_crea() {
		return fecha_crea;
	}

	public void setFecha_crea(Date fecha_crea) {
		this.fecha_crea = fecha_crea;
	}

	public String getUsuario_modifica() {
		return usuario_modifica;
	}

	public void setUsuario_modifica(String usuario_modifica) {
		this.usuario_modifica = usuario_modifica;
	}

	public Date getFecha_modifica() {
		return fecha_modifica;
	}

	public void setFecha_modifica(Date fecha_modifica) {
		this.fecha_modifica = fecha_modifica;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", usuario_crea="
				+ usuario_crea + ", fecha_crea=" + fecha_crea + ", usuario_modifica=" + usuario_modifica
				+ ", fecha_modifica=" + fecha_modifica + "]";
	}	
	
}
