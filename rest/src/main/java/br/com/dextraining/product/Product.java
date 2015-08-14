package br.com.dextraining.product;

public class Product {
	private Long codigo;
	private String nome;

	public Product(Long codigoParam, String nomeParam) {
		this.codigo = codigoParam;
		this.nome = nomeParam;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
