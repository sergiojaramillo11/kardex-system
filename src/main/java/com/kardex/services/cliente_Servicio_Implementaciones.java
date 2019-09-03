package com.kardex.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kardex.jpa.tb_clientes;
import com.kardex.repositories.repositorio_Clientes;

@Service
public class cliente_Servicio_Implementaciones implements cliente_Servicio {
	
	@Autowired
	private repositorio_Clientes repo_Clientes;
	
	@Override
	public tb_clientes findByDocid(int docid) {

		return repo_Clientes.findById(docid).orElse(null);
		
	}

	@Override
	public Iterable<tb_clientes> findAll() {

		return repo_Clientes.findAll();
		
	}

	@Override
	public tb_clientes save(tb_clientes cliente_Nuevo) {
		tb_clientes clientePorAgregar = new tb_clientes();
		clientePorAgregar.setDocid(cliente_Nuevo.getDocid());
		clientePorAgregar.setNombre(cliente_Nuevo.getNombre());
		clientePorAgregar.setApellido(cliente_Nuevo.getApellido());
		clientePorAgregar.setDireccion(cliente_Nuevo.getDireccion());
		clientePorAgregar.setEmail(cliente_Nuevo.getEmail());
		clientePorAgregar.setTelefono(cliente_Nuevo.getTelefono());
		return repo_Clientes.save(clientePorAgregar);
		
	}

	@Override
	public void saveAll(Iterable<tb_clientes> array_Clientes) {	
		repo_Clientes.saveAll(array_Clientes);	
	}

	@Override
	public void deleteById(int id) {
		repo_Clientes.deleteById(id);
	}

}
