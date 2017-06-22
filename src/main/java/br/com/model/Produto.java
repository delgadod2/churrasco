package br.com.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String codigo;
	private String nome;
	private String descricao;
	private Double preco;
	private Double quantidade;
	
	@Enumerated(EnumType.STRING)
	private EnumTipoProduto tipoProduto;
	
	@Enumerated(EnumType.STRING)
	private EnumUnidadeProduto unidadeMedida;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataAtualizacao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public EnumTipoProduto getTipoProduto() {
		return tipoProduto;
	}
	
	public void setTipoProduto(EnumTipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public EnumUnidadeProduto getUnidadeMedida() {
		return unidadeMedida;
	}
	
	public void setUnidadeMedida(EnumUnidadeProduto unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public int getId() {
		return id;
	}

}
