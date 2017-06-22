package br.com.model;

public enum EnumUnidadeProduto {

	KILO ("kg"), 
	LITRO ("l"), 
	MILIGRAMA("ml"), 
	UNIDADE("u"), 
	DUZIA("d"), 
	CENTO("c");
	
	private String codigo;
	
	EnumUnidadeProduto(String codigo) {
		this.codigo = codigo;
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
}
