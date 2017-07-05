package br.com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.MessageSource;

public enum EnumUnidadeProduto {

	KILO("kg", "required.unidadeMedida.kg"), 
	LITRO("l", "required.unidadeMedida.l"), 
	MILIGRAMA("mg","required.unidadeMedida.mg"),
	MILILITRO("ml","required.unidadeMedida.ml"),
	UNIDADE("u", "required.unidadeMedida.u"), 
	DUZIA("d", "required.unidadeMedida.d"), 
	CENTO("c", "required.unidadeMedida.c");

	private String codigo;
	private String descricao;
	EnumUnidadeProduto(String codigo, String descricao) {
		this.codigo = codigo;
		this.setDescricao(descricao);
	}

	public String getCodigo() {
		return codigo;
	}

	public static EnumUnidadeProduto obterPorCodigo(String codigo) {
		for (EnumUnidadeProduto e : values()) {
			if (e.codigo.equals(codigo)) {
				return e;
			}
		}
		return null;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static Object obterTodos(MessageSource messageSource) {
		List<String> v_return = new ArrayList<String>();
		for (EnumUnidadeProduto v_sta : EnumUnidadeProduto.values()) {
			v_return.add(messageSource.getMessage(v_sta.getDescricao(), null, null));
		}
		return v_return;
	}
}
