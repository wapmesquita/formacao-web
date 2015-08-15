package br.com.dextraining.cart;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.dextraining.product.Product;

@Path("/cart")
public class CartRS {
	
	private static Cart cart;


	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProductsFromCart() {
		Cart cart = createMockCart();
		
		String json = new Gson().toJson(cart);
		
		return Response.ok(json).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCartProductBy(@PathParam("id") Long id) {
		Cart cart = createMockCart();
		
		Product productToReturn = null;
		for(Product product : cart.getProducts()) {
			if(product.getCodigo().equals(id)){
				productToReturn = product;
			}
		}
		
		if(productToReturn != null ) {
			String json = new Gson().toJson(productToReturn);
			return Response.ok(json).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addToCart(@FormParam("codigo") Long codigo, @FormParam("nome") String nome) {
		Cart cart = createMockCart();
		cart.getProducts().add( new Product(codigo, nome));

		String json = new Gson().toJson(cart);
		return Response.ok(json).build();
	}
	
	@DELETE
	@Path("/{cartid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeFromCart(@PathParam("id") Long codigo) {
		Cart cart = createMockCart();
		
		Product prodToRemove = null;
		for (Product prod : cart.getProducts()){
			if(prod.getCodigo().equals(codigo)) {
				prodToRemove = prod;
			}
		}
		if(prodToRemove != null ) {
			cart.getProducts().remove(prodToRemove);
			String json = new Gson().toJson(cart);
			return Response.ok(json).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();
		
	}
	
	private Cart createMockCart() {
		if (cart == null) {
			cart = new Cart();
			cart.setProducts(new ArrayList<Product>());
		}
		return cart;
	}
	
}











