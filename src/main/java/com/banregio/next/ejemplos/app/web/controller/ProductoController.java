package com.banregio.next.ejemplos.app.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banregio.next.ejemplos.app.domain.entity.Producto;
import com.banregio.next.ejemplos.app.domain.service.ProductoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/1.0/productos")
public class ProductoController {
	
	
	private ProductoService servProducto;
	
	@ApiOperation(
			value = "Devuelve todos los Productos.",
			notes = "Devuelve los productos con orden alfabetica."
			)	
	@GetMapping
	public List<Producto> getAll(){
		return servProducto.getAll();
	}
	
	@ApiOperation(
			value = "Devuelve un Producto.",
			notes = "Devuelve datos de un producto, segun sea su ID."
			)
	@GetMapping(value = "/{id}")
	public Optional<Producto> getOne(@PathVariable("id") Integer id){
		return servProducto.getOne(id);
	}
	
	@ApiOperation(
			value = "Da de alta a un Producto.",
			notes = "Se inserta un producto nuevo."
			)
	@PostMapping
	public void insert(@RequestBody Producto producto) {
		servProducto.insert(producto);;
	}
	
	@ApiOperation(
			value = "Actualiza datos de un Producto.",
			notes = "Se actualiza datos del producto."
			)
	@PutMapping
	public void update(@RequestBody Producto producto) {
		servProducto.update(producto);;
	}
	
	@ApiOperation(
			value = "Elimina un Producto.",
			notes = "Se elimina un producto."
			)
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		servProducto.delete(id);
	}

}
