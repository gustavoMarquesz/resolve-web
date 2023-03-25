package com.resolveapp.resolveSolucoes.controllers;

import com.resolveapp.resolveSolucoes.models.Certificado;
import com.resolveapp.resolveSolucoes.models.RegistroEmpresa;
import com.resolveapp.resolveSolucoes.repository.CadastroEmpresaRepository;
import com.resolveapp.resolveSolucoes.repository.CertificadoRepository;
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
    private CertificadoRepository certificadoRepository;
    @RequestMapping(value ="/cadastro" , method = RequestMethod.GET)
    public String cadastroEmpresa(){
        return "empresa/viewCadastroEmpresa";
    }

    @RequestMapping(value ="/cadastro" , method = RequestMethod.POST)
    public String cadastroEmpresa(RegistroEmpresa registroEmpresa){
        repository.save(registroEmpresa);
        return "redirect:/cadastro";
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

        Iterable<Certificado> certificados = certificadoRepository.findByEmpresa(empresas);
        empresasById.addObject("certificados", certificados);

        return empresasById;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String addCertificado(@PathVariable("id") int id, Certificado certificado){
        RegistroEmpresa empresas = repository.findById(id);
        certificado.setEmpresa(empresas);
        certificadoRepository.save(certificado);
        return "redirect:/{id}";
    }
}
