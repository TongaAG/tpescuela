package org.tpescuela.sectores;

import javax.persistence.*;

@Entity
public class Sectores {
	@Column(length=20)
	private String nomSect;
	@Column String horarios;
	

}
