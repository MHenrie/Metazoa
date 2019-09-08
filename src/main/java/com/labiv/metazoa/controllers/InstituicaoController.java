package com.labiv.metazoa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InstituicaoController {

    @RequestMapping("/cadastro-instituicao")
    public ModelAndView cadastro(){
        return new ModelAndView("pages/cadastroInstituicao");
    }
}