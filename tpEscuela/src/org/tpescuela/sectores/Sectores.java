package org.tpescuela.sectores;

import javax.persistence.*;
@Entity
public class Sectores {
	@Column(length=80)
	private String nomSect;
	@Column (length=60)
	private String horarios;
	@ManyToOne
	public String getNomSect() {
		return nomSect;
	}
	public void setNomSect(String nomSect) {
		this.nomSect = nomSect;
	}
	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
}
