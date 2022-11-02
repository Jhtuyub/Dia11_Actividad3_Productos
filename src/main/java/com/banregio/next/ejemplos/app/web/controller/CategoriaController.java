package com.banregio.next.ejemplos.app.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banregio.next.ejemplos.app.domain.entity.Categoria;
import com.banregio.next.ejemplos.app.domain.repository.CategoriaRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/1.0/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repoCategoria;
	
	@ApiOperation(
			value = "Devuelve todos las Categorias.",
			notes = "Devuelve las Categorias con orden alfabetica."
			)	
	@GetMapping
	public List<Categoria> getAll(){
		return repoCategoria.findAll();
	}
	
	@ApiOperation(
			value = "Devuelve una Categoria.",
			notes = "Devuelve datos de una Categoria, segun sea su ID."
			)
	@GetMapping(value = "/{id}")
	public Optional<Categoria> getOne(@PathVariable("id") Integer id){
		return repoCategoria.findById(id);
	}
	
	@ApiOperation(
			value = "Da de alta a una Categoria.",
			notes = "Se inserta una Categoria nuevo."
			)
	@PostMapping
	public void insert(@RequestBody Categoria categoria) {
		repoCategoria.save(categoria);
	}
	
	@ApiOperation(
			value = "Actualiza datos de una Categoria.",
			notes = "Se actualiza datos de la Categoria."
			)
	@PutMapping
	public void update(@RequestBody Categoria categoria) {
		repoCategoria.save(categoria);
	}
		
	@ApiOperation(
			value = "Elimina una Categoria.",
			notes = "Se elimina una Categoria."
			)
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repoCategoria.deleteById(id);
	}
	
}
