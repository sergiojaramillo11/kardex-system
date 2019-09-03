package com.kardex.services;

import com.kardex.jpa.tb_categoria;

public interface categoria_Servicio {

	Iterable<tb_categoria> findAll();
	
	tb_categoria findById(int id_cat);
	
	tb_categoria save(tb_categoria categoria);
	
	void saveAll(Iterable<tb_categoria> lista_Categorias);
	
	void deleteById(int id);
	
}
