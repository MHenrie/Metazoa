package com.labiv.metazoa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoutesController {

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/cadastro-pessoa")
    public ModelAndView cadPes() {
        return new ModelAndView("pages/cadastroPessoa");
    }

    @RequestMapping("/cadastro-instituicao")
    public ModelAndView cadastro() {
        return new ModelAndView("pages/cadastroInstituicao");
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("pages/home");
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("pages/login");
    }
}