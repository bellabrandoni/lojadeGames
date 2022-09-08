package com.generation.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categorias")

public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	
	@Size(min= 4, max=100, message="O campo precisa ter no minimo 4 letras e no maximo 100 letras")
	
	@NotNull
	private String genero;


	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)

	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	
}
