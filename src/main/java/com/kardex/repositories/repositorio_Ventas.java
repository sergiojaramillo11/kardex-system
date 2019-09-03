package com.kardex.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kardex.jpa.tb_ventas;

@Repository
public interface repositorio_Ventas extends CrudRepository<tb_ventas, Integer>{

}
