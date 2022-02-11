package com.uco.propietario.propietarioElectrodomestico.controller;

import com.uco.propietario.propietarioElectrodomestico.command.PropietarioCommand;
import com.uco.propietario.propietarioElectrodomestico.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propietario-electrodomestico")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;


    @GetMapping("/v1/listado-propietarios")
    public List<PropietarioCommand> findAll() {
        return propietarioService.findAll();
    }

    @GetMapping("/v1/{id}/propietario")
    private PropietarioCommand findById(@PathVariable int id){
        return propietarioService.findById(id);
    }

    @PostMapping("/agregar")
    public void agregarProprietario(@RequestBody final PropietarioCommand propietarioCommand){
        propietarioService.agregar(propietarioCommand);
    }
}
