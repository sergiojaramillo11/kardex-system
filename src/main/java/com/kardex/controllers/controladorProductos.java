package com.kardex.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kardex.jpa.tb_productos;
import com.kardex.services.producto_Servicio;

@RestController
@RequestMapping("/home/products")
public class controladorProductos {
	
	@Autowired
	private producto_Servicio instancia_Producto_Servicio;
	
	@GetMapping("/all")
	public Iterable<tb_productos> findAll(){
		return instancia_Producto_Servicio.findAll();
	}
	
	@GetMapping("{id_producto}")
	public tb_productos findById(@PathVariable int id_producto) {
		return instancia_Producto_Servicio.findById(id_producto);
	}
	
	@PostMapping("/save")
	public tb_productos save(@RequestBody tb_productos producto) {
		return instancia_Producto_Servicio.save(producto);
	}
	
	@PostMapping("/saveAll")
	public void saveAll(@RequestBody List<tb_productos> lista_Productos) {
		instancia_Producto_Servicio.saveAll(lista_Productos);
	}
	
	@DeleteMapping("/delete/{id_producto}")
	public void deleteById(@PathVariable int id_producto) {
		instancia_Producto_Servicio.deleteById(id_producto);
	}

}
