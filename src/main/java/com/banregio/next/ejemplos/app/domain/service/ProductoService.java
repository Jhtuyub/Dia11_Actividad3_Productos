package com.banregio.next.ejemplos.app.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.banregio.next.ejemplos.app.domain.entity.Producto;
import com.banregio.next.ejemplos.app.domain.repository.ProductoRepostory;

@Service
public class ProductoService {

	private ProductoRepostory repoProducto;
	
	public List<Producto> getAll(){
		return repoProducto.findAll();
	}
	
	public Optional<Producto> getOne(@PathVariable("id") Integer id){
		return repoProducto.findById(id);
	}
	
	public void insert(@RequestBody Producto producto) {
		repoProducto.save(producto);
	}
	
	public void update(@RequestBody Producto producto) {
		repoProducto.save(producto);
	}
	
	public void delete(@PathVariable("id") Integer id) {
		repoProducto.deleteById(id);
	}
	
}
