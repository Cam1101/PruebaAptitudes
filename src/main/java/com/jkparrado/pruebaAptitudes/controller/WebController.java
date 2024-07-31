package com.jkparrado.pruebaAptitudes.controller;

import com.jkparrado.pruebaAptitudes.model.Ciudad;
import com.jkparrado.pruebaAptitudes.model.Departamento;
import com.jkparrado.pruebaAptitudes.service.CiudadService;
import com.jkparrado.pruebaAptitudes.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private DepartamentoService departamentoService;

    @Autowired
    private CiudadService ciudadService;

    @GetMapping("/departamentos")
    public String getDepartamentos(Model model, @RequestParam(required = false) Long departamentoId) {
        List<Departamento> departamentos = departamentoService.findAll();
        model.addAttribute("departamentos", departamentos);

        if (departamentoId != null) {
            Departamento selectedDepartamento = departamentos.stream()
                    .filter(d -> d.getIddepartamento().equals(departamentoId))
                    .findFirst()
                    .orElse(null);
            if (selectedDepartamento != null) {
                List<Ciudad> ciudades = ciudadService.listarCiudadPorRegion(departamentoId);
                model.addAttribute("ciudades", ciudades);
            }
        }
        return "departamentos";
    }
}