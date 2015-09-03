package br.com.dextraining.product;

import java.util.Collection;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.dxt.wm.model.entity.Produto;
import br.com.dxt.wm.service.ProdutoService;

import com.google.gson.Gson;

@Path("/product")
public class ProdutoRS {
	
	private ProdutoService produtoService = new ProdutoService();

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProduct() {
		Collection<Produto> products = produtoService.buscarTodos();

		String json = new Gson().toJson(products);

		return Response.ok(json).build();

	}

	@GET
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductByCodigo(@PathParam("codigo") String codigo) {
		Produto product = produtoService.buscarPorCodigo(codigo);
		
		if(product != null) {
			String json = new Gson().toJson(product);
			return Response.ok(json).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductByName(@QueryParam("nome") String nome) {
		Produto product = produtoService.buscarPorNome(nome);
		
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
	public Response createProduct(@FormParam("codigo")String codigo,
			@FormParam("nome") String nome) {
		Produto product = new Produto(codigo, nome);
		produtoService.salvar(product);
		String json = new Gson().toJson(product);
		return Response.ok(json).build();
	}

}











