package com.kardex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kardex.jpa.tb_ventas;
import com.kardex.repositories.repositorio_Ventas;

@Service
public class venta_Servicio_Implementacion implements venta_Servicio {
	
	@Autowired
	private repositorio_Ventas repo_Ventas;

	@Override
	public Iterable<tb_ventas> findAll() {
		return repo_Ventas.findAll();
	}

	@Override
	public tb_ventas findById(int id_venta) {
		return repo_Ventas.findById(id_venta).orElse(null);
	}

	@Override
	public tb_ventas save(tb_ventas venta) {
		
		tb_ventas nueva_Venta = new tb_ventas();
		nueva_Venta.setId_venta(venta.getId_venta());
		nueva_Venta.setId_producto(venta.getId_producto());
		nueva_Venta.setId_cliente(venta.getId_cliente());
		nueva_Venta.setCantidad(venta.getCantidad());
		nueva_Venta.setValor(venta.getValor());
		
		return repo_Ventas.save(nueva_Venta);
	}

	@Override
	public void deleteById(int id_venta) {
		repo_Ventas.deleteById(id_venta);
		
	}
	
	

}
