package com.jkparrado.pruebaAptitudes.service;

import com.jkparrado.pruebaAptitudes.model.Ciudad;
import com.jkparrado.pruebaAptitudes.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    public Ciudad agregar(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    public boolean eliminar(Long id) {
        try {
            ciudadRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Ciudad findById(Long id) {
        Optional<Ciudad> ciudad = ciudadRepository.findById(id);
        return ciudad.orElse(null);
    }

    public boolean editar(Ciudad ciudad) {
        if (ciudadRepository.existsById(ciudad.getIdCiudad())) {
            ciudadRepository.save(ciudad);
            return true;
        } else {
            return false;
        }
    }


}
