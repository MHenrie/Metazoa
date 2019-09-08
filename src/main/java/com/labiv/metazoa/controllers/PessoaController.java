package com.labiv.metazoa.controllers;

import com.labiv.metazoa.models.Pessoa;
import com.labiv.metazoa.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pr;

    @RequestMapping(value = "/cadastro-pessoa", method = RequestMethod.GET)
    public ModelAndView acesso() {
        return new ModelAndView("pages/cadastroPessoa");
    }

    @RequestMapping(value = "/cadastro-pessoa", method = RequestMethod.POST)
    public String cadastro(Pessoa pessoa) {

        pr.save(pessoa);

        return "redirect:/cadastro-pessoa";
    }
}