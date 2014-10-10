package br.com.dxt.jsfproject.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7144782693821902913L;
	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
