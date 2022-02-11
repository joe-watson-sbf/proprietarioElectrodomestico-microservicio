package com.uco.propietario.propietarioElectrodomestico.service;


import com.uco.propietario.propietarioElectrodomestico.command.PropietarioCommand;

import java.util.List;

public interface PropietarioService {
    List<PropietarioCommand> findAll();

    void agregar(PropietarioCommand propietarioCommand);
    PropietarioCommand findById(int id);
}
