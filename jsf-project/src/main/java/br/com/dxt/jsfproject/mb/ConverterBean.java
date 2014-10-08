package br.com.dxt.jsfproject.mb;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ConverterBean {

	private Integer numero = 0;
	private Date data;
	private Double monetario;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getMonetario() {
		return monetario;
	}

	public void setMonetario(Double monetario) {
		this.monetario = monetario;
	}

}
