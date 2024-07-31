package com.jkparrado.pruebaAptitudes.repository;

import com.jkparrado.pruebaAptitudes.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long>,
        JpaSpecificationExecutor<Departamento> {
}
