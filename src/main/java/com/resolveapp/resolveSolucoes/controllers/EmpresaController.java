package com.resolveapp.resolveSolucoes.controllers;

import com.resolveapp.resolveSolucoes.models.Observacoes;
import com.resolveapp.resolveSolucoes.models.RegistroEmpresa;
import com.resolveapp.resolveSolucoes.repository.CadastroEmpresaRepository;
import com.resolveapp.resolveSolucoes.repository.ObservacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpresaController {
    @Autowired
    private CadastroEmpresaRepository repository;

    @Autowired
    private ObservacoesRepository observacoesRepository;
    @RequestMapping(value ="/cadastro" , method = RequestMethod.GET)
    public String cadastroEmpresa(){
        return "empresa/viewCadastroEmpresa";
    }

    @RequestMapping(value ="/cadastro" , method = RequestMethod.POST)
    public String cadastroEmpresa(RegistroEmpresa registroEmpresa){
        repository.save(registroEmpresa);
        return "redirect:/empresas";
    }

    @RequestMapping(value = "/empresas", method = RequestMethod.GET)
    public ModelAndView listarEmpresas(){
        ModelAndView empresasListaView = new ModelAndView("index");
        Iterable<RegistroEmpresa> empresas = repository.findAll();
        empresasListaView.addObject("empresas", empresas);
        return empresasListaView;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView detalhesEmpresa(@PathVariable("id") int id){
        RegistroEmpresa empresas = repository.findById(id);
        ModelAndView empresasById = new ModelAndView("empresa/detalhesEmpresa");
        empresasById.addObject("empresas", empresas);

        Iterable<Observacoes> observacoes = observacoesRepository.findByEmpresa(empresas);
        empresasById.addObject("observacoes", observacoes);

        return empresasById;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String addObservacao(@PathVariable("id") int id, Observacoes observacoes){
        RegistroEmpresa empresas = repository.findById(id);
        observacoes.setEmpresa(empresas);
        observacoesRepository.save(observacoes);
        return "redirect:/{id}";
    }
}
