package br.com.dxt.wm.model.dao;

import javax.persistence.TypedQuery;

import br.com.dxt.wm.model.entity.Produto;

public class ProdutoDao extends AbstractDao<Produto> {

	public ProdutoDao() {
		super(Produto.class);
	}

	public Produto buscarPorCodigo(String codigo) {
		TypedQuery<Produto> qry = getEM().createQuery(String.format("FROM %s p WHERE UPPER(p.codigo) = UPPER(:codigo)", Produto.class.getSimpleName()),
				Produto.class);
		qry.setParameter("codigo", codigo);
		return qry.getSingleResult();
	}

}
