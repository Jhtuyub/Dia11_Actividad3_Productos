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
		name="ABPRODUC",
		indexes = {
				@Index(name = "PRO_Nombre_PRO_Marca_index", 
						columnList = "PRO_Nombre,PRO_Marca",
						unique = true
						)
				}
		)
public class Producto {
	@Column(name = "PRO_Id", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	@Column(name = "PRO_Idcate", nullable = false)
	private Integer idcate;
	@Column(name = "PRO_Nombre", nullable = false, length = 150)
	private String nombre;
	@Column(name = "PRO_Marca", nullable = false, length = 100)
	private String marca;
	@Column(name = "PRO_Linea", nullable = false, length = 50)
	private String linea;
	@Column(name = "PRO_Tipo", nullable = false, length = 50)
	private String tipo;
	@Column(name = "PRO_Descri", nullable = false, length = 250)
	private String descripcion;
	@Column(name = "PRO_Usucre", nullable = true, length = 30)
	private String usuario_crea;
	@Column(name = "PRO_Feccre", nullable = false)
	@JsonFormat(pattern = "ddMMyyyy")
	private Date fecha_crea;
	@Column(name = "PRO_Usumod", nullable = true, length = 30)
	private String usuario_modifica;
	@Column(name = "PRO_Fecmod", nullable = false)
	@JsonFormat(pattern = "ddMMyyyy")
	private Date fecha_modifica;
	
	public Producto() {	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdcate() {
		return idcate;
	}

	public void setIdcate(Integer idcate) {
		this.idcate = idcate;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Producto [id=" + id + ", idcate=" + idcate + ", nombre=" + nombre + ", marca=" + marca + ", linea="
				+ linea + ", tipo=" + tipo + ", descripcion=" + descripcion + ", usuario_crea=" + usuario_crea
				+ ", fecha_crea=" + fecha_crea + ", usuario_modifica=" + usuario_modifica + ", fecha_modifica="
				+ fecha_modifica + "]";
	}

		
}
