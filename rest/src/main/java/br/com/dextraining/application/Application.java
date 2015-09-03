package br.com.dextraining.application;

import java.util.HashSet;
import java.util.Set;

import br.com.dextraining.cart.CartRS;
import br.com.dextraining.hello.HelloRS;
import br.com.dextraining.product.ProdutoRS;

public class Application extends javax.ws.rs.core.Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> clazz = new HashSet<>();
		clazz.add(HelloRS.class);
		clazz.add(ProdutoRS.class);
		clazz.add(CartRS.class);
		return clazz;
	}

	
}
