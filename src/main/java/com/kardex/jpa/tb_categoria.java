package com.kardex.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tb_categoria {
	
	@Id
	private int id_categoria;
	private String nombre_categoria;
	
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre_categoria() {
		return nombre_categoria;
	}
	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	@Override
	public String toString() {
		return "tb_categoria [id_categoria=" + id_categoria + ", nombre_categoria=" + nombre_categoria + "]";
	}
	
}
