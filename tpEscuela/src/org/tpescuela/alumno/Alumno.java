package org.tpescuela.alumno;

import javax.persistence.*;

import org.tpescuela.persona.*;

@Entity
public class Alumno extends Persona{
	@Column(length=50)
	private String direccion;
	@Id @Column (length= 30)
	private String numMatric; 
	
	

}
