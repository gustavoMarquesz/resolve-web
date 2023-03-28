package com.resolveapp.resolveSolucoes.repository;

import com.resolveapp.resolveSolucoes.models.Observacoes;
import com.resolveapp.resolveSolucoes.models.RegistroEmpresa;
import org.springframework.data.repository.CrudRepository;

public interface ObservacoesRepository extends CrudRepository<Observacoes, String> {
    Iterable<Observacoes> findByEmpresa(RegistroEmpresa empresas);
}
