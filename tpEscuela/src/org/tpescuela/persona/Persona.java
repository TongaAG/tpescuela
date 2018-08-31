package org.tpescuela.persona;

import javax.persistence.*;

@Entity
public class Persona {
	@Column(length=50)
	private String nombre;
	@Column(length=50)
	private String apellido;
	@Column(length=10)
	private String horario;
}
