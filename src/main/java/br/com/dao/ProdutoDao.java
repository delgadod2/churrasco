package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.model.Produto;

@Repository
@Transactional
public class ProdutoDao {

	@PersistenceContext
    private EntityManager manager;

    public void salvar(Produto produto){
    	manager.persist(produto);    	
    }

}
