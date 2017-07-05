package br.com.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.model.Produto;

public class ProdutoValidation implements Validator {

	public boolean supports(Class<?> produto) {
        return Produto.class.isAssignableFrom(produto);
    }

	public void validate(Object produto, Errors errors) {

//		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required");
//		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
//		
//		if (((Produto) produto).getPaginas() <= 0) {
//			errors.rejectValue("paginas", "field.required");
//		}
//
	}

}