package com.kardex.services;

import com.kardex.jpa.tb_ventas;

public interface venta_Servicio {
	
	Iterable<tb_ventas> findAll();
	
	tb_ventas findById(int id_venta);
	
	tb_ventas save(tb_ventas venta);
	
	void deleteById(int id_venta);

}
