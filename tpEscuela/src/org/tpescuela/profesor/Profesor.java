package org.tpescuela.profesor;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.tpescuela.persona.*;

@Entity
public class Profesor extends Persona{
	@Email @Column(length=30)
	private String correoElec;
	@Column(length=20)
	private String materias;
	
	public String getCorreoElec() {
		return correoElec;
	}
	public void setCorreoElec(String correoElec) {
		this.correoElec = correoElec;
	}
	public String getMaterias() {
		return materias;
	}
	public void setMaterias(String materias) {
		this.materias = materias;
	}
	
}
