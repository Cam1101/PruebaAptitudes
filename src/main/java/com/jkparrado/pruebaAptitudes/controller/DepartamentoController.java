package com.jkparrado.pruebaAptitudes.controller;

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

    @PostMapping("/findById")
    public Departamento findById(@RequestBody Long id) {
        return departamentoService.findById(id);
    }

    @PostMapping("/agregar")
    public Departamento agregar(@RequestBody Departamento departamento) {
        return departamentoService.agregar(departamento);
    }

    @DeleteMapping("/eliminar")
    public boolean eliminar(@RequestBody Departamento departamento) {
        return departamentoService.eliminar(departamento.getIddepartamento());
    }

    @PutMapping("/editar")
    public boolean editar(@RequestBody Departamento departamento) {
        return departamentoService.editar(departamento);
    }
}
