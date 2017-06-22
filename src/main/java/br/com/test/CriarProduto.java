package br.com.test;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.dao.ConexaoBD;
import br.com.model.EnumTipoProduto;
import br.com.model.EnumUnidadeProduto;
import br.com.model.Produto;

public class CriarProduto {

	public static void main(String[] args) {
		
				
		EntityManager manager = new ConexaoBD().getEntityManager();
		manager.getTransaction().begin();		
		manager.persist(criarNovoProduto());
		manager.getTransaction().commit();
		manager.close();
		
		
	}
	static Produto criarNovoProduto()
	{
		Produto produto = new Produto();
		produto.setNome("Picanha Grill");
		produto.setDescricao("Picanha argentina filé");
		produto.setCodigo("PICA");
		produto.setPreco(65d);
		produto.setQuantidade(1d);
		produto.setTipoProduto(EnumTipoProduto.CARNE);
		produto.setUnidadeMedida(EnumUnidadeProduto.KILO);
		produto.setDataAtualizacao(Calendar.getInstance());

		return produto;
	}

}
