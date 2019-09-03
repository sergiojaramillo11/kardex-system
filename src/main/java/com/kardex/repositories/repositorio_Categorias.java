package com.kardex.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kardex.jpa.tb_categoria;

@Repository
public interface repositorio_Categorias extends CrudRepository<tb_categoria, Integer>{

	Iterable<tb_categoria> findAll();
	
	tb_categoria findById(int id_Cat);
	
	tb_categoria save(tb_categoria categoria);
	
}
