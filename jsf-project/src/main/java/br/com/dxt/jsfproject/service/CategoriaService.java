package br.com.dxt.jsfproject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.com.dxt.jsfproject.domain.Categoria;

public class CategoriaService {

	private static List<Categoria> repo = new ArrayList<Categoria>();

	static {
		for (int i = 1; i <= 10; i++) {
			Categoria categoria = new Categoria();
			categoria.setId(i);
			categoria.setNome("Categoria " + 1);
			repo.add(categoria);
		}
	}

	public static Collection<Categoria> findAll() {
		return Collections.unmodifiableCollection(repo);
	}

	public static void persist(Categoria c) {
		if (c.getId() != null) {
			throw new RuntimeException(
					"Utilize o merge para atualizar a categoria");
		}
		if (repo.isEmpty()) {
			c.setId(1);
		} else {
			c.setId(repo.get(repo.size() - 1).getId() + 1);
		}
		repo.add(c);
	}

	public static void merge(Categoria c) {
		if (c.getId() == null) {
			throw new RuntimeException(
					"Utilize o persist para inserir a categoria");
		}
		Categoria findById = findById(c.getId());
		if (findById == null) {
			throw new RuntimeException(
					"Categoria nao encontrada para atualizar");
		}
		findById.setNome(c.getNome());
	}

	public static Categoria findById(Integer id) {
		for (Categoria c : repo) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}
}
