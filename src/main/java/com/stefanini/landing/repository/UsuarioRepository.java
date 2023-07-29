package com.stefanini.landing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefanini.landing.model.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<Usuario> findByNumeroDocumento(String numeroDocumento);

	List<Usuario> findByCategoria(String categoria);

	List<Usuario> findByFechaHoraRegistro(LocalDateTime fechaHoraRegistro);
	
	List<Usuario> findByTipoDocumento(String tipoDocumento);
	
	List<Usuario> findByNombre(String nombre);
}
