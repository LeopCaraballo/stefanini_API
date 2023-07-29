package com.stefanini.landing.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stefanini.landing.model.Usuario;
import com.stefanini.landing.service.UsuarioService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	private final UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> obtenerTodosLosUsuarios() {
		List<Usuario> usuarios = usuarioService.obtenerTodosLosUsuarios();
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
		Usuario usuario = usuarioService.obtenerUsuarioPorId(id);
		if (usuario != null) {
			return new ResponseEntity<>(usuario, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public ResponseEntity<Void> agregarUsuario(@RequestBody Usuario usuario) {
		usuarioService.guardarUsuario(usuario);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
		Usuario usuarioExistente = usuarioService.obtenerUsuarioPorId(id);
		if (usuarioExistente != null) {

			usuarioExistente.setNombre(usuario.getNombre());
			usuarioExistente.setCategoria(usuario.getCategoria());
			usuarioExistente.setTipoDocumento(usuario.getTipoDocumento());
			usuarioExistente.setNumeroDocumento(usuario.getNumeroDocumento());
			usuarioExistente.setFechaHoraRegistro(usuario.getFechaHoraRegistro());

			usuarioService.guardarUsuario(usuarioExistente);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
		usuarioService.eliminarUsuario(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/numerodocumento/{numeroDocumento}")
	public ResponseEntity<List<Usuario>> buscarPorNumeroDocumento(@PathVariable String numeroDocumento) {
		List<Usuario> usuarios = usuarioService.buscarPorNumeroDocumento(numeroDocumento);
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}

	@GetMapping("/categoria/{categoria}")
	public ResponseEntity<List<Usuario>> buscarPorCategoria(@PathVariable String categoria) {
		List<Usuario> usuarios = usuarioService.buscarPorCategoria(categoria);
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}

	@GetMapping("/fecha/{fechaRegistro}")
	public ResponseEntity<List<Usuario>> buscarPorFechaRegistro(@PathVariable LocalDateTime fechaRegistro) {
		List<Usuario> usuarios = usuarioService.buscarPorFechaRegistro(fechaRegistro);
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}

	@GetMapping("/tipodocumento/{tipoDocumento}")
	public ResponseEntity<List<Usuario>> buscarPorTipoDocumento(@PathVariable String tipoDocumento) {
		List<Usuario> usuarios = usuarioService.buscarPorTipoDocumento(tipoDocumento);
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}

	@GetMapping("/nombre/{nombre}")
	public ResponseEntity<List<Usuario>> buscarPorNombre(@PathVariable String nombre) {
		List<Usuario> usuarios = usuarioService.buscarPorNombre(nombre);
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}

}
