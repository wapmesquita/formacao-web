package br.com.dxt.wm.mb.teste;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dxt.wm.entity.Pessoa;
import br.com.dxt.wm.service.PessoaService;

@SessionScoped
@ManagedBean
public class TesteMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7308504304687338654L;

	private PessoaService pessoaService = new PessoaService();
	
	private Pessoa pessoa = new Pessoa();
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void salvar() {
		pessoaService.salvar(pessoa);
		pessoa = new Pessoa();
	}
	
	private Collection<Pessoa> pessoas;
	
	public Collection<Pessoa> getPessoas() {
		if (pessoas == null) {
			pessoas = pessoaService.buscarTodos();
		}
		return pessoas;
	}

}
