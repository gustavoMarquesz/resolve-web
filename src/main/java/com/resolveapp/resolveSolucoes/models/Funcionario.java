package com.resolveapp.resolveSolucoes.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
public class Funcionario implements Serializable {
    private static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomeFuncionario;
    private String email;
    public Funcionario(String nomeFuncionario, String email) {
        this.nomeFuncionario = nomeFuncionario;
        this.email = email;
    }
}
