package br.com.dextraining.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		List<Product> products = new ArrayList<Product>();
		for (Long i =1L; i< 7; i++) {
			Product product = new Product(i,"Produto " + i);
			products.add(product);
		}
		Gson gson = new Gson();
		resp.getWriter().write(gson.toJson(products));
		resp.setContentType("application/json");
	}
}
