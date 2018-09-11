package org.tpescuela.persona;

import javax.persistence.*;

@Entity
public class Persona {
	@Column(length=100)
	private String nombre;
	@Column(length=50)
	private String apellido;
	@Column(length=40)
	private String horario;
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
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
