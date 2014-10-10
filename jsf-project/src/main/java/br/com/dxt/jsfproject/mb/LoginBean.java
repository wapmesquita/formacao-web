package br.com.dxt.jsfproject.mb;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

@RequestScoped
@ManagedBean
public class LoginBean implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8951655133074796149L;

	@ManagedProperty(value = "#{userBean}")
	transient private UserBean userBean;

	private String user;

	@Override
	public void afterPhase(PhaseEvent arg0) {
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		boolean login = event.getFacesContext().getExternalContext()
				.getRequestServletPath().equals("/login.xhtml");

		UserBean userBean = (UserBean) event.getFacesContext().getExternalContext().getSessionMap().get("userBean");
		if (!login) {
			if (userBean == null || userBean.getUsuario() == null) {
				if (user == null) {
					try {
						String path = event.getFacesContext()
								.getExternalContext()
								.getApplicationContextPath();
						event.getFacesContext().getExternalContext()
								.redirect(path + "/login.xhtml");
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
			}
		}
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void login() {
		userBean.setUsuario(user);

		FacesContext ctx = FacesContext.getCurrentInstance();
		String path = ctx.getExternalContext().getApplicationContextPath();
		try {
			ctx.getExternalContext().redirect(path + "/index.xhtml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void logout() {
		userBean.setUsuario(null);
		FacesContext ctx = FacesContext.getCurrentInstance();
		String path = ctx.getExternalContext().getApplicationContextPath();
		try {
			ctx.getExternalContext().redirect(path + "/login.xhtml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
}
