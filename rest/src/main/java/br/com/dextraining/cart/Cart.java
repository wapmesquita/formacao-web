package br.com.dextraining.cart;

import java.util.List;

import br.com.dextraining.product.Product;


public class Cart {
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
