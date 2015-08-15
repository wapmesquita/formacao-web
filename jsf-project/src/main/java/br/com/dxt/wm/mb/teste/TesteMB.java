package br.com.dxt.wm.mb.teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dxt.wm.entity.Pessoa;

@SessionScoped
@ManagedBean
public class TesteMB {
	
	private Pessoa pessoa = new Pessoa();
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void salvar() {
		System.out.println(pessoa.getNome());
		pessoa = new Pessoa();
	}

}
