package org.tpescuela.escuela;

import javax.persistence.*;

@Entity
public class Escuela {
	@Column(length=40)
	private String nomEsc;
	@Column(length=100)
	private String direccion;
	
	
	public String getNomEsc() {
		return nomEsc;
	}
	public void setNomEsc(String nomEsc) {
		this.nomEsc = nomEsc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
