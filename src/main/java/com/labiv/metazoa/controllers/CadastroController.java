package com.labiv.metazoa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * CadastroController
 */
@Controller
public class CadastroController {

    @RequestMapping("/cadastro-instituicao")
    public ModelAndView cadInst() {
        return new ModelAndView("pages/cadastroInstituicao");
    }

    @RequestMapping("/cadastro-pessoa")
    public ModelAndView cadPes(){
        return new ModelAndView("pages/cadastroPessoa");
    }

}