package br.com.dxt.wm.service;

import java.util.Collection;

import br.com.dxt.wm.dao.PessoaDao;
import br.com.dxt.wm.entity.Pessoa;

public class PessoaService {

	private PessoaDao pessoaDao = new PessoaDao();

	public Pessoa salvar(Pessoa p) {
		if (p == null) {
			throw new RuntimeException("Pessoa nao pode ser null");
		}

		if (p.getId() == null) {
			p = pessoaDao.inserir(p);
		} else {
			p = pessoaDao.atualizar(p);
		}
		return p;
	}

	public Collection<Pessoa> buscarTodos() {
		return pessoaDao.findAll();
	}

}
