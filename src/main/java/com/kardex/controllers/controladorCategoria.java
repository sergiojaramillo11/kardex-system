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

import com.kardex.jpa.tb_categoria;
import com.kardex.services.categoria_Servicio;

@RestController
@RequestMapping("/home/category")
public class controladorCategoria {
	
	@Autowired
	private categoria_Servicio instancia_Categoria_Servicio;
	
	@GetMapping("/all")
	public Iterable<tb_categoria> getATodasLasCategorias(){
		return instancia_Categoria_Servicio.findAll();
	}
	
	@GetMapping("{id}")
	public tb_categoria findById(@PathVariable int id) {
		return instancia_Categoria_Servicio.findById(id);
	}
	
	@PostMapping("/save")
	public tb_categoria guardar(@RequestBody tb_categoria cat) {
		return instancia_Categoria_Servicio.save(cat);
	}
	
	@PostMapping("/saveAll")
	public void guardarLote(@RequestBody List<tb_categoria> lista_Categoria) {
		instancia_Categoria_Servicio.saveAll(lista_Categoria);
	}
	
	@DeleteMapping("/delete/{id_categoria}")
	public void eliminarPorId(@PathVariable int id_categoria) {
		instancia_Categoria_Servicio.deleteById(id_categoria);
	}

}
