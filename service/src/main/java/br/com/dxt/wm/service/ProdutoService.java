package br.com.dxt.wm.service;

import java.util.Collection;

import org.apache.commons.lang.IllegalClassException;

import br.com.dxt.wm.dao.ProdutoDao;
import br.com.dxt.wm.entity.Produto;
import br.com.dxt.wm.utils.EntityManagerWrapper;

public class ProdutoService {

	private ProdutoDao produtoDao = new ProdutoDao();

	public Produto salvar(Produto p) {
		if (p == null) {
			throw new RuntimeException("Produto nao pode ser null");
		}

		EntityManagerWrapper.begin();
		p = produtoDao.salvar(p);
		EntityManagerWrapper.commit();
		return p;
	}

	public Collection<Produto> buscarTodos() {
		return produtoDao.findAll();
	}

	public Produto buscarPorId(Long id) {
		return produtoDao.findById(id);
	}

	public Produto buscarPorNome(String nome) {
		throw new IllegalClassException("not implemented");
	}

	public Produto buscarPorCodigo(String codigo) {
		return produtoDao.buscarPorCodigo(codigo);
	}

}
