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

    @PostMapping("/findById/{id}")
    public Ciudad findById(@PathVariable Long id) {
        return ciudadService.findById(id);
    }

    @PostMapping("/agregar")
    public Ciudad agregar(@RequestBody Ciudad ciudad) {
        return ciudadService.agregar(ciudad);
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return ciudadService.eliminar(id);
    }

    @PutMapping("/editar")
    public boolean editar(@RequestBody Ciudad ciudad) {
        return ciudadService.editar(ciudad);
    }

    @PostMapping("/listarCiudadPorRegion/{idRegion}")
    public List<Ciudad> listarCiudadPorRegion (@PathVariable Long idRegion){
        return ciudadService.listarCiudadPorRegion(idRegion);
    }


}

