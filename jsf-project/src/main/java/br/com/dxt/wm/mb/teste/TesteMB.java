package br.com.dxt.wm.mb.teste;

import java.io.Serializable;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dxt.wm.entity.Produto;
import br.com.dxt.wm.service.ProdutoService;

@SessionScoped
@ManagedBean
public class TesteMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7308504304687338654L;

	private ProdutoService produtoService = new ProdutoService();
	
	private Produto produto = new Produto();
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void salvar() {
		produtoService.salvar(produto);
		produto = new Produto();
		produtos = null;
	}
	
	private Collection<Produto> produtos;
	
	public Collection<Produto> getProdutos() {
		if (produtos == null) {
			produtos = produtoService.buscarTodos();
		}
		return produtos;
	}

}
