package br.com.dxt.jsfproject.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.dxt.jsfproject.domain.Categoria;
import br.com.dxt.jsfproject.service.CategoriaService;

@FacesConverter("br.com.dxt.jsfproject.converter.CategoriaConverter")
public class CategoriaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesCtx, UIComponent uiComponent, String idString) {
		if (idString == null || idString.trim().equals("")) {
			return null;
		}

		Integer id = Integer.parseInt(idString);
		return CategoriaService.findById(id);
	}

	@Override
	public String getAsString(FacesContext facesCtx, UIComponent uiComponent, Object obj) {
		if (obj == null) {
			return "";
		}
		return ((Categoria)obj).getId().toString();
	}

}
