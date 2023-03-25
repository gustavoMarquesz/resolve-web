package com.resolveapp.resolveSolucoes.repository;

import org.springframework.data.repository.CrudRepository;
import com.resolveapp.resolveSolucoes.models.RegistroEmpresa;
public interface CadastroEmpresaRepository extends CrudRepository< RegistroEmpresa, String> {
    RegistroEmpresa findById(long id);
}
