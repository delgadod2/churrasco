package br.com.model;

public enum EnumTipoProduto {

	CARNE("C"),         	       
	BEBIDA_NAOALCOOLICA("BN"),
	BEBIDA_ALCOOLICA("BA"),
	GUARNICAO("G"),         	       
	MATERIAL_ALUGADO("MA"),         	       
	MATERIAL_DESCARTAVEL("MD");
	
	private String codigo;
	
	EnumTipoProduto(String codigo) {
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
}
