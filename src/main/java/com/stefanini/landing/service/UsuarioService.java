package com.stefanini.landing.service;

import org.springframework.stereotype.Service;

import com.stefanini.landing.model.Usuario;
import com.stefanini.landing.repository.UsuarioRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public List<Usuario> obtenerTodosLosUsuarios() {
		return usuarioRepository.findAll();
	}

	public Usuario obtenerUsuarioPorId(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	public void guardarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void actualizarUsuario(Long id, Usuario usuario) {
		Usuario usuarioExistente = obtenerUsuarioPorId(id);
		if (usuarioExistente != null) {
			usuarioExistente.setNombre(usuario.getNombre());
			usuarioExistente.setCategoria(usuario.getCategoria());
			usuarioExistente.setTipoDocumento(usuario.getTipoDocumento());
			usuarioExistente.setNumeroDocumento(usuario.getNumeroDocumento());
			usuarioExistente.setFechaHoraRegistro(usuario.getFechaHoraRegistro());

			guardarUsuario(usuarioExistente);
		}
	}

	public void eliminarUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}

	public List<Usuario> buscarPorNumeroDocumento(String numeroDocumento) {
		return usuarioRepository.findByNumeroDocumento(numeroDocumento);
	}

	public List<Usuario> buscarPorCategoria(String categoria) {
		return usuarioRepository.findByCategoria(categoria);
	}

	public List<Usuario> buscarPorFechaRegistro(LocalDateTime fechaRegistro) {
		return usuarioRepository.findByFechaHoraRegistro(fechaRegistro);
	}

	public List<Usuario> buscarPorTipoDocumento(String tipoDocumento) {
		return usuarioRepository.findByTipoDocumento(tipoDocumento);
	}

	public List<Usuario> buscarPorNombre(String nombre) {
		return usuarioRepository.findByNombre(nombre);
	}

}
