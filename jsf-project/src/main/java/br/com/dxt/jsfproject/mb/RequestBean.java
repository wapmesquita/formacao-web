package br.com.dxt.jsfproject.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.dxt.jsfproject.domain.Categoria;
import br.com.dxt.jsfproject.service.CategoriaService;

@ManagedBean
@RequestScoped
public class RequestBean implements Serializable{

	private static final long serialVersionUID = -4393817636057275303L;
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
