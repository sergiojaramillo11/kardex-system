package com.kardex.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kardex.jpa.tb_clientes;
import com.kardex.services.cliente_Servicio;

@RestController
@RequestMapping("/home/clients")
public class controladorClientes {
	
	@Autowired
	private cliente_Servicio instancia_Cliente_Servicio;
	
	@GetMapping("{docid}")
	public tb_clientes getClientePorId(@PathVariable int docid) {
		return instancia_Cliente_Servicio.findByDocid(docid);
	}
	
	@GetMapping("/all")
	public Iterable<tb_clientes> getTodosLosClientes() {
		return instancia_Cliente_Servicio.findAll();
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public tb_clientes guardar(@RequestBody tb_clientes cliente_Nuevo) {
		return instancia_Cliente_Servicio.save(cliente_Nuevo);
	}
	
	@PostMapping("/saveAll")
	@ResponseStatus(HttpStatus.CREATED)
	public void guardarLote(@RequestBody List<tb_clientes> lista_Clientes) {
		instancia_Cliente_Servicio.saveAll(lista_Clientes);
	}
	
	@DeleteMapping("/delete/{docid}")
	public void eliminarPorId(@PathVariable int docid) {
		instancia_Cliente_Servicio.deleteById(docid);
	}
}
