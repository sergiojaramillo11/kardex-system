package com.kardex.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kardex.jpa.tb_productos;

@Repository
public interface repositorio_Productos extends CrudRepository<tb_productos, Integer> {
	
	Iterable<tb_productos> findAll();
	
	tb_productos findById(int id_producto);
	
	tb_productos save(tb_productos producto);

}
