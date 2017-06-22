package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dao.ProdutoDao;
import br.com.model.Produto;

@Controller
public class ProdutosController {

//    @Autowired
//    private ProdutoDao produtoDao;

//    @RequestMapping("/produtos")
//    public String gravar(Produto produto){
//        System.out.println(produto);
//        //produtoDao.gravar(produto);
//        return "/produtos/ok";
//    }

}
