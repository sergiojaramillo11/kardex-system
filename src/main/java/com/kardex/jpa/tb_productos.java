package com.kardex.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tb_productos {
	
	@Id
	private int id_producto;
	private String nombre_producto;
	private int id_categoria;
	private String categoria;
	private double valor;
	private int cantidad;
	
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "tb_productos [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", id_categoria="
				+ id_categoria + ", categoria=" + categoria + ", valor=" + valor + ", cantidad=" + cantidad + "]";
	}
	
}
