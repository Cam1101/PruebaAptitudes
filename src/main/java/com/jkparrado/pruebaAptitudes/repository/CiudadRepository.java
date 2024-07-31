package com.jkparrado.pruebaAptitudes.repository;

import com.jkparrado.pruebaAptitudes.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long>,
        JpaSpecificationExecutor<Ciudad> {
    List<Ciudad> findByDepartamento_Iddepartamento(Long iddepartamento);
}
