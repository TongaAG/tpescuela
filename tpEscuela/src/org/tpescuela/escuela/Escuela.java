package org.tpescuela.escuela;

import javax.persistence.*;

@Entity
public class Escuela {
	@Column(length=40)
	private String nomEsc;
	@Column(length=100)
	private String direccion;
}
