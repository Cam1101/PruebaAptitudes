package com.jkparrado.pruebaAptitudes.service;

import com.jkparrado.pruebaAptitudes.model.Departamento;
import com.jkparrado.pruebaAptitudes.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }

    public Departamento agregar(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public boolean eliminar(Long id) {
        try {
            departamentoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Departamento findById(Long id) {
        Optional<Departamento> departamento = departamentoRepository.findById(id);
        return departamento.orElse(null);
    }

    public boolean editar(Departamento departamento) {
        if (departamentoRepository.existsById(departamento.getIddepartamento())) {
            departamentoRepository.save(departamento);
            return true;
        } else {
            return false;
        }
    }
}
