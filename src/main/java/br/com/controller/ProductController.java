package br.com.controller;

import java.util.Calendar;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.dao.ProdutoDao;
import br.com.model.EnumTipoProduto;
import br.com.model.EnumUnidadeProduto;
import br.com.model.Produto;
import br.com.validation.ProdutoValidation;

@Controller
@RequestMapping("/produtos")
public class ProductController {

	@Autowired
	private ProdutoDao produtoDao;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/form")
	public ModelAndView carregarPagina(Produto produto) {

		ModelAndView modelAndView = new ModelAndView("produtos/produto");
		modelAndView.addObject("tipoProduto", EnumTipoProduto.obterTodos(messageSource));
		modelAndView.addObject("unidadeMedida", EnumUnidadeProduto.obterTodos(messageSource));
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return carregarPagina(produto);
		}
		produto.setDataAtualizacao(Calendar.getInstance());
		produtoDao.salvar(produto);
		redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!");
		return new ModelAndView("redirect:produtos/form");
	}

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.addValidators(new ProdutoValidation());
	}
}
