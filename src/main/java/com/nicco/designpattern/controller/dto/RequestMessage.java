package com.nicco.designpattern.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RequestMessage {
	@JsonIgnore
	String nome;
	String codice;
	@JsonIgnore
	String descrizione;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
