package com.kardex.services;

import com.kardex.jpa.tb_productos;

public interface producto_Servicio {
	
	Iterable<tb_productos> findAll();
	
	tb_productos findById(int id_producto);
	
	tb_productos save(tb_productos producto);
	
	void saveAll(Iterable<tb_productos> array_Productos);
	
	void deleteById(int id_producto);

}
