package com.resolveapp.resolveSolucoes.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Observacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int obsCod;

    private String obsDescricao;

    @ManyToOne
    private RegistroEmpresa empresa;

    public RegistroEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(RegistroEmpresa empresa) {
        this.empresa = empresa;
    }
}
