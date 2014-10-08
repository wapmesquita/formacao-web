package br.com.dxt.jsfproject.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.dxt.jsfproject.domain.Categoria;
import br.com.dxt.jsfproject.service.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaBean implements Serializable {
	private static final long serialVersionUID = -973664692718082601L;
	private Categoria novaCategoria = new Categoria();
	private Categoria categoriaEdit = new Categoria();

	public Categoria getCategoriaEdit() {
		return categoriaEdit;
	}

	public void setCategoriaEdit(Categoria categoriaEdit) {
		this.categoriaEdit = categoriaEdit;
	}

	public void adicionar() {
		CategoriaService.persist(novaCategoria);
		novaCategoria = new Categoria();
		FacesContext.getCurrentInstance()
		.addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Alteração realizada",
						"Categoria adicionada com sucesso"));

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
		FacesContext.getCurrentInstance()
		.addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_WARN,
						"Alteração realizada",
						"Categoria removida com sucesso"));

	}

	public void salvarEdicao() {
		CategoriaService.merge(categoriaEdit);
		FacesContext.getCurrentInstance()
				.addMessage(
						null,
						new FacesMessage(FacesMessage.SEVERITY_INFO,
								"Alteração realizada",
								"Categoria editada com sucesso"));
	}

	public String salvarEdicaoPagina() {
		salvarEdicao();
		return "/exemplos/cadastro/categoria";
	}
}
