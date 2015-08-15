package br.com.dextraining.product;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/product")
public class ProdutoRS {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProduct() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "Produto 1"));
		products.add(new Product(2L, "Produto 2"));
		products.add(new Product(3L, "Produto 3"));

		String json = new Gson().toJson(products);

		return Response.ok(json).build();

	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductById(@PathParam("id") Long id) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "Produto 1"));
		products.add(new Product(2L, "Produto 2"));
		products.add(new Product(3L, "Produto 3"));
		System.out.println(id);
		Product product = null;
		for(Product prod : products) {
			if(prod.getCodigo().equals(id)){
				product = prod;
			}
		}
		if(product != null) {
			System.out.println(product);
			String json = new Gson().toJson(product);
			return Response.ok(json).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductByName(@QueryParam("nome") String nome) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "produto1"));
		products.add(new Product(2L, "produto2"));
		products.add(new Product(3L, "produto3"));
		System.out.println(nome);
		Product product = null;
		for(Product prod : products) {
			if(prod.getNome().equals(nome)){
				product = prod;
			}
		}
		if(product != null) {
			System.out.println(product);
			String json = new Gson().toJson(product);
			return Response.ok(json).build();
		}

		return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createProduct(@FormParam("codigo")Long codigo,
			@FormParam("nome") String nome) {
		Product product = new Product(codigo, nome);
		String json = new Gson().toJson(product);
		return Response.ok(json).build();
	}

}











