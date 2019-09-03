package com.kardex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kardex.jpa.tb_ventas;
import com.kardex.services.venta_Servicio;

@RestController
@RequestMapping("/home/sale")
public class controladorVentas {

	@Autowired
	private venta_Servicio instancia_Venta_Servicio;
	
	@GetMapping("/all")
	public Iterable<tb_ventas> findAll(){
		return instancia_Venta_Servicio.findAll();
	}
	
	@GetMapping("{id_venta}")
	public tb_ventas findById(@PathVariable int id_venta) {
		return instancia_Venta_Servicio.findById(id_venta);
	}
	
	@PostMapping("/save")
	public tb_ventas save(@RequestBody tb_ventas venta) {
		return instancia_Venta_Servicio.save(venta);
	}
	
	@DeleteMapping("/delete/{id_venta}")
	public void deletebyId(@PathVariable int id_venta) {
		instancia_Venta_Servicio.deleteById(id_venta);
	}
}
