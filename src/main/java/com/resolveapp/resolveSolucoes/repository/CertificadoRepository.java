package com.resolveapp.resolveSolucoes.repository;

import com.resolveapp.resolveSolucoes.models.Certificado;
import com.resolveapp.resolveSolucoes.models.RegistroEmpresa;
import org.springframework.data.repository.CrudRepository;

public interface CertificadoRepository extends CrudRepository<Certificado, String> {
    Iterable<Certificado> findByEmpresa(RegistroEmpresa empresas);
}
