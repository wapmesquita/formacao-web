package br.com.dextraining.cart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.dxt.wm.entity.Produto;

public class Cart {

	private Map<Long, Produto> mapProducts = new HashMap<Long, Produto>();

	public Collection<Produto> getProducts() {
		return mapProducts.values();
	}

	public void add(Produto produto) {
		mapProducts.put(produto.getId(), produto);
	}
	
	public void remove(Produto p) {
		mapProducts.remove(p.getId());
	}
}
