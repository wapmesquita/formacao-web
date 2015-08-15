package br.com.dxt.wm.entity;

import javax.persistence.Entity;

@Entity
public class Pessoa extends AbstractEntity {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
