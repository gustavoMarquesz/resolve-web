package com.resolveapp.resolveSolucoes.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int unicoCertificado;
    @Column
    private String dataDoVencimento;

    @ManyToOne
    private RegistroEmpresa empresa;

    public RegistroEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(RegistroEmpresa empresa) {
        this.empresa = empresa;
    }
}
