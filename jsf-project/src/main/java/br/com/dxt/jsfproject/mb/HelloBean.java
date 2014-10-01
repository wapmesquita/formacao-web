package br.com.dxt.jsfproject.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dxt.jsfproject.domain.Pessoa;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pessoa pessoa = new Pessoa();

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String submit() {
		return "welcome";
	}
	
	public void test() {
		System.out.println(pessoa.getName());
	}
}