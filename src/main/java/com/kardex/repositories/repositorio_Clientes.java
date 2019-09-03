package com.kardex.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kardex.jpa.tb_clientes;

@Repository
public interface repositorio_Clientes extends CrudRepository<tb_clientes, Integer>{
	
	Iterable<tb_clientes> findAll();

	tb_clientes findByDocid(int docid);
	
	tb_clientes save(tb_clientes cliente_Nuevo);
	
}
