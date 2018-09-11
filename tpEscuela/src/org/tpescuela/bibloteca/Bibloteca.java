package org.tpescuela.bibloteca;

import javax.persistence.*;

@Entity

public class Bibloteca {
	@Column(length=100)
	private String nombreBiblo;
	
}
