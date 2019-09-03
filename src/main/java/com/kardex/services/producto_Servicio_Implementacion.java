package com.kardex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kardex.jpa.tb_productos;
import com.kardex.repositories.repositorio_Productos;

@Service
public class producto_Servicio_Implementacion implements producto_Servicio {

	@Autowired
	private repositorio_Productos repo_Productos;

	@Override
	public Iterable<tb_productos> findAll() {
		
		return repo_Productos.findAll();
	}

	@Override
	public tb_productos findById(int id_producto) {
		
		return repo_Productos.findById(id_producto);
	}

	@Override
	public tb_productos save(tb_productos producto) {
		
		tb_productos productosPorAgregar = new tb_productos();
		productosPorAgregar.setId_producto(producto.getId_producto());
		productosPorAgregar.setNombre_producto(producto.getNombre_producto());
		productosPorAgregar.setId_categoria(producto.getId_categoria());
		productosPorAgregar.setCategoria(producto.getCategoria());
		productosPorAgregar.setCantidad(producto.getCantidad());
		productosPorAgregar.setValor(producto.getValor());
		
		return repo_Productos.save(productosPorAgregar);
	}

	@Override
	public void saveAll(Iterable<tb_productos> array_Productos) {
		
		repo_Productos.saveAll(array_Productos);
		
	}

	@Override
	public void deleteById(int id_producto) {
		repo_Productos.deleteById(id_producto);
		
	}
}
