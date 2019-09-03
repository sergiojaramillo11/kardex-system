package com.kardex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kardex.jpa.tb_categoria;
import com.kardex.repositories.repositorio_Categorias;

@Service
public class categoria_Servicio_Implementacion implements categoria_Servicio {
	
	@Autowired
	private repositorio_Categorias repo_Categorias;

	@Override
	public Iterable<tb_categoria> findAll() {
		
		return repo_Categorias.findAll();
		
	}

	@Override
	public tb_categoria findById(int id_cat) {
		
		return repo_Categorias.findById(id_cat);
	}

	@Override
	public tb_categoria save(tb_categoria categoria) {
		tb_categoria categoria_Nueva = new tb_categoria();
		categoria_Nueva.setId_categoria(categoria.getId_categoria());
		categoria_Nueva.setNombre_categoria(categoria.getNombre_categoria());
		return repo_Categorias.save(categoria_Nueva);
	}

	@Override
	public void saveAll(Iterable<tb_categoria> lista_Categorias) {
		repo_Categorias.saveAll(lista_Categorias);
	}

	@Override
	public void deleteById(int id) {
		repo_Categorias.deleteById(id);
	}

}
