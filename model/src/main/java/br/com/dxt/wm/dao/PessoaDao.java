package br.com.dxt.wm.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.dxt.wm.entity.Pessoa;

public class PessoaDao {
	
	private static long id = 1l;
	private static Map<Long, Pessoa> db = new HashMap<Long, Pessoa>();
	
	public Pessoa inserir(Pessoa p) {
		p.setId(++id);
		db.put(p.getId(), p);
		return p;
	}
	
	public Pessoa atualizar(Pessoa p) {
		long idPessoa = p.getId();
		Pessoa pessoa = db.get(idPessoa);
		pessoa.setNome(p.getNome());
		return pessoa;
	}
	
	public Collection<Pessoa> findAll() {
		return db.values();
	}
}
