package br.com.dxt.jsfproject.mb;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

import br.com.dxt.jsfproject.domain.Categoria;
import br.com.dxt.jsfproject.service.CategoriaService;

@ManagedBean
@SessionScoped
public class SelectBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8135048491106322697L;
	private Categoria categoria;
	private static Set<Categoria> selecteds;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Collection<Categoria> getListCategoria() {
		return CategoriaService.findAll();
	}

	public Set<Categoria> getSelecteds() {
		if (selecteds == null) {
			selecteds = new HashSet<Categoria>();
		}
		return selecteds;
	}

	public void onChangeCategoria(ValueChangeEvent event) {
		if (event.getNewValue() != null) {
			System.out.println("New Value: " + ((Categoria) event.getNewValue()).getNome());
			Integer id = ((Categoria) event.getNewValue()).getId();
			Categoria findById = CategoriaService.findById(id);
			getSelecteds().add(findById);
		}
	}
}
