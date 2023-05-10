package br.com.cotiinfomartica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AutenticaController {
	
	@RequestMapping(value = "/") //página raiz do projeto (incial) - primeira página que via abrir ao rodar projeto
	public ModelAndView autenticar() {
		//WEB-INF/views/autenticar.jsp (nome da página JSP)
		ModelAndView modelAndView = new ModelAndView("autenticar");
		//um model an view que vai apontar para a página JSP lá na view e retornar p spring
		return modelAndView;
	}

}
