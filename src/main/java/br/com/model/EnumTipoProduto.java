package br.com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.MessageSource;

public enum EnumTipoProduto {

	CARNE("C", "required.tipoProduto.carne"), 
	BEBIDA_NAOALCOOLICA("BN","required.tipoProduto.bebidaNaoAlcoolica"), 
	BEBIDA_ALCOOLICA("BA","required.tipoProduto.alcoolica"), 
	GUARNICAO("G","required.tipoProduto.guarnicao"), 
	MATERIAL_ALUGADO("MA","required.tipoProduto.materialAlugado"), 
	MATERIAL_DESCARTAVEL("MD","required.tipoProduto.materialDescartavel");
	
	private String codigo;
	private String descricao;

	EnumTipoProduto(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public static EnumTipoProduto obterPorCodigo(String codigo) {
		for (EnumTipoProduto e : values()) {
			if (e.codigo.equals(codigo)) {
				return e;
			}
		}
		return null;
	}
	public static List<String> obterTodos(MessageSource messageSource)
	{
		List<String> v_return = new ArrayList<String>();
		for (EnumTipoProduto v_sta : EnumTipoProduto.values())
		{
			v_return.add(messageSource.getMessage(v_sta.getDescricao(), null, null));
		}
		return v_return;
	}
}
