package br.com.dextraining.cart;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.dxt.wm.model.entity.Produto;
import br.com.dxt.wm.service.ProdutoService;

import com.google.gson.Gson;

@Path("/cart")
public class CartRS {

	private ProdutoService produtoService = new ProdutoService();

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProductsFromCart() {
		Cart cart = createMockCart();

		String json = new Gson().toJson(cart.getProducts());

		return Response.ok(json).build();
	}

	@GET
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCartProductCodigo(@PathParam("codigo") String codigo) {
		Cart cart = createMockCart();

		Produto productToReturn = null;
		for (Produto product : cart.getProducts()) {
			if (product.getCodigo().equals(codigo)) {
				productToReturn = product;
			}
		}

		if (productToReturn != null) {
			String json = new Gson().toJson(productToReturn);
			return Response.ok(json).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();
	}

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addToCart(@FormParam("codigo") String codigo) {
		Cart cart = createMockCart();
		cart.add(produtoService.buscarPorCodigo(codigo));

		String json = new Gson().toJson(cart.getProducts());
		return Response.ok(json).build();
	}

	@DELETE
	@Path("/remove/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeFromCart(@PathParam("codigo") String codigo) {
		Cart cart = createMockCart();
		Produto prodToRemove = produtoService.buscarPorCodigo(codigo);

		if (prodToRemove != null) {
			cart.remove(prodToRemove);
			String json = new Gson().toJson(cart.getProducts());
			return Response.ok(json).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();

	}

	private static Cart cart;

	private Cart createMockCart() {
		if (cart == null) {
			cart = new Cart();
		}
		return cart;
	}

}
