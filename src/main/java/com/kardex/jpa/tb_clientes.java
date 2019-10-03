package com.kardex.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tb_clientes {
	
	@Id
	private int docid;
	private String nombre;
	private String apellido;
	private int telefono;
	private String email;
	private String direccion;
	
    public tb_clientes(String name, String apellido) {
        this.nombre = name;
        this.apellido = apellido;
    }

    public tb_clientes(){
    }

    public tb_clientes( String name, String apellido, String email) {
        this.nombre = name;
        this.apellido = apellido;
        this.email = email;
    }
	
    
	public tb_clientes(int docid, String nombre, String apellido, int telefono, String email,
			String direccion) {
		super();
		this.docid = docid;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}

	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "tb_clientes [docid=" + docid + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", email=" + email + ", direccion=" + direccion + "]";
	}
	

}
