package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.model.Produto;

public class ProdutoDao {

	@PersistenceContext
    private EntityManager manager;

    public void gravar(Produto produto){
        manager.persist(produto);
    }

}
