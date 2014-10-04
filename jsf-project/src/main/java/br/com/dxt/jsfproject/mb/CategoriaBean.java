package br.com.dxt.jsfproject.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dxt.jsfproject.domain.Categoria;
import br.com.dxt.jsfproject.service.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaBean implements Serializable {
	private static final long serialVersionUID = -973664692718082601L;
	private Categoria novaCategoria = new Categoria();

	public void adicionar() {
		CategoriaService.persist(novaCategoria);
		novaCategoria = new Categoria();
	}

	public Collection<Categoria> getListCategoria() {
		return CategoriaService.findAll();
	}

	public Categoria getNovaCategoria() {
		return novaCategoria;
	}

	public void setNovaCategoria(Categoria novaCategoria) {
		this.novaCategoria = novaCategoria;
	}

	public void remove(Categoria c) {
		CategoriaService.remove(c);
	}
}
