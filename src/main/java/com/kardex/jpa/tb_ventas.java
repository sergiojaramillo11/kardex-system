package com.kardex.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tb_ventas {
	
	@Id
	private int id_venta;
	private int id_producto;
	private int id_cliente;
	private int cantidad;
	private double valor;
	
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "tb_ventas [id_venta=" + id_venta + ", id_producto=" + id_producto + ", id_cliente=" + id_cliente
				+ ", cantidad=" + cantidad + ", valor=" + valor + "]";
	}
	
}
