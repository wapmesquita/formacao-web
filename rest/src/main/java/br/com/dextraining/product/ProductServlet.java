package br.com.dextraining.product;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.wm.entity.Produto;
import br.com.dxt.wm.service.ProdutoService;

import com.google.gson.Gson;

@WebServlet("/logged/product")
public class ProductServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5284792404720094803L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Collection<Produto> products = new ProdutoService().buscarTodos();
		
		Gson gson = new Gson();
		resp.getWriter().write(gson.toJson(products));
		resp.setContentType("application/json");
	}
}
