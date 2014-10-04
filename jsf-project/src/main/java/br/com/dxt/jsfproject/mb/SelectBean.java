package br.com.dxt.jsfproject.mb;

import java.util.Collection;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import br.com.dxt.jsfproject.domain.Categoria;
import br.com.dxt.jsfproject.service.CategoriaService;

@ManagedBean
@SessionScoped
public class SelectBean {

	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Collection<Categoria> getListCategoria() {
		return CategoriaService.findAll();
	}
}
