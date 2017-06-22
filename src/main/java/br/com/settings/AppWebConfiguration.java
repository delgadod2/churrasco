package br.com.settings;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.controller.HomeController;
import br.com.dao.ProdutoDao;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, ProdutoDao.class})
public class AppWebConfiguration {

	public InternalResourceViewResolver internalResourceViewResolve() {
        InternalResourceViewResolver resolve = new InternalResourceViewResolver();
        resolve.setPrefix("/WEB-INF/");
        resolve.setSuffix(".jsp");
        return resolve;
    }	
}
