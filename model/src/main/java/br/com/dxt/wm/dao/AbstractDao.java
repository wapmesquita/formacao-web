package br.com.dxt.wm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.dxt.wm.entity.AbstractEntity;
import br.com.dxt.wm.utils.EntityManagerWrapper;

public class AbstractDao<T extends AbstractEntity> {
	
	private Class<T> clazz;

	public AbstractDao(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	protected EntityManager getEM() {
		return EntityManagerWrapper.getEntityManager();
	}
	
	public T salvar(T t) {
		if (t.getId() != null)
			t = getEM().merge(t);
		else
			getEM().persist(t);
		return t;
	}
	
	public List<T> findAll() {
		return null;
	}
	
	public T findById() {
		return null;
	}
	
	public void delete() {
		
	}

}
