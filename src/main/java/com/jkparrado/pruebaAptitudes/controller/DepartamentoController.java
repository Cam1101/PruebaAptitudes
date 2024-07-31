package com.jkparrado.pruebaAptitudes.controller;

import com.jkparrado.pruebaAptitudes.model.Ciudad;
import com.jkparrado.pruebaAptitudes.model.Departamento;
import com.jkparrado.pruebaAptitudes.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
@CrossOrigin
public class DepartamentoController {

    private final DepartamentoService departamentoService;

    @Autowired
    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping("/findAll")
    public List<Departamento> findAll() {
        return departamentoService.findAll();
    }

    @PostMapping("/findById/{id}")
    public Departamento findById(@PathVariable Long id) {
        return departamentoService.findById(id);
    }

    @PostMapping("/agregar")
    public Departamento agregar(@RequestBody Departamento departamento) {
        return departamentoService.agregar(departamento);
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return departamentoService.eliminar(id);
    }

    @PutMapping("/editar")
    public boolean editar(@RequestBody Departamento departamento) {
        return departamentoService.editar(departamento);
    }


}
