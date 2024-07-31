package com.jkparrado.pruebaAptitudes.controller;

import com.jkparrado.pruebaAptitudes.model.Ciudad;
import com.jkparrado.pruebaAptitudes.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudad")
@CrossOrigin
public class CiudadController {

    private final CiudadService ciudadService;

    @Autowired
    public CiudadController(CiudadService ciudadService){
        this.ciudadService = ciudadService;
    }

    @GetMapping("/findAll")
    public List<Ciudad> findAll() {
        return ciudadService.findAll();
    }

    @PostMapping("/findById")
    public Ciudad findById(@RequestBody Long id) {
        return ciudadService.findById(id);
    }

    @PostMapping("/agregar")
    public Ciudad agregar(@RequestBody Ciudad ciudad) {
        return ciudadService.agregar(ciudad);
    }

    @DeleteMapping("/eliminar")
    public boolean eliminar(@RequestBody Long id) {
        return ciudadService.eliminar(id);
    }

    @PutMapping("/editar")
    public boolean editar(@RequestBody Ciudad ciudad) {
        return ciudadService.editar(ciudad);
    }
}

