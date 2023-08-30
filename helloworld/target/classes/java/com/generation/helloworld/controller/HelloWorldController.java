package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
		}
	
	  @GetMapping("/bsm")
	    public String ListaBSM() {
	        return "\n" +
	        		"Lista de BSM da Generation: \n" +
	                "Mentalidade de Crescimento\n" +
	                "Persistência\n" +
	                "Responsabilidade Pessoal\n" +
	                "Orientação ao Futuro\n" +
	                "Comunicação\n" +
	                "Orientação ao Detalhe\n" +
	                "Proatividade\n" +
	                "Trabalho em Equipe\n" +
	                "\n";
}
	  @GetMapping("/objetivos")
	    public String ListaObjetivos() {
	        return "<\n" +
	                "Meus Objetivos de Aprendizagem da Semana: \n" +
	                "Revisar conteúdo de MySQL\n" +
	                "Assistir vídeos da Plataforma\n" +
	                "Absorver o conteúdo de Spring\n" +
	                "<\n";
}
}