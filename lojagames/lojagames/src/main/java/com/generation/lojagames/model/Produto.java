package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_produtos")
public class Produto {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;

	private String jogos;
	

	@NotBlank
	@Size(min=4, max=1000)
	
	private String classificacao;
	
	private Double valor;
	
	@ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJogos() {
		return jogos;
	}

	public void setJogos(String jogos) {
		this.jogos = jogos;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
