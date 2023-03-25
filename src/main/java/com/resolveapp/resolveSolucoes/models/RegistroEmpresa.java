package com.resolveapp.resolveSolucoes.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RegistroEmpresa extends Funcionario implements Serializable {
    private static  final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String data;
    private String textoPost;
    private String empresaNome;
    private String empresaCnpj;
    private String razaoFisicaNome;
    private String razaoFisicaCPF;

    private String statusCertificado;

    @OneToMany
    private List<Certificado> certificado;

    public RegistroEmpresa(String nomeFuncionario, String email, String empresaNome, String empresaCnpj, String razaoFisicaNome, String razaoFisicaCPF, String data, String textoPost) {
        super(nomeFuncionario, email);
        this.empresaNome = empresaNome;
        this.empresaCnpj = empresaCnpj;
        this.textoPost = textoPost;
        this.data = data;
        this.razaoFisicaNome = razaoFisicaNome;
        this.razaoFisicaCPF = razaoFisicaCPF;
    }
}
