package com.kardex.services;


import com.kardex.jpa.tb_clientes;

public interface cliente_Servicio {

	tb_clientes findByDocid(int docid);
	
	Iterable<tb_clientes> findAll();
	
	tb_clientes save(tb_clientes cliente_Nuevo);
	
	void saveAll(Iterable<tb_clientes> lista_Clientes);
	
	void deleteById(int id);
	
}
