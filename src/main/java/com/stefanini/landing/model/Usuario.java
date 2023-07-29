package com.stefanini.landing.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuarios")
	private Long id;

	@Column(name = "nombre_usuario", nullable = false)
	private String nombre;

	@Column(name = "tipo_documento", nullable = false)
	private String tipoDocumento;

	@Column(name = "documento", nullable = false)
	private String numeroDocumento;

	@Column(name = "categoria", nullable = false)
	private String categoria;

	@Column(name = "tarjeta", nullable = false)
	private boolean tieneTarjeta;

	@Column(name = "fecha_registro", nullable = false)
	private LocalDateTime fechaHoraRegistro;

	public Usuario() {
	}

	public Usuario(Long id, String nombre, String tipoDocumento, String numeroDocumento, String categoria,
			boolean tieneTarjeta, LocalDateTime fechaHoraRegistro) {
		this.id = id;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.categoria = categoria;
		this.tieneTarjeta = tieneTarjeta;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isTieneTarjeta() {
		return tieneTarjeta;
	}

	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}

	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
}
