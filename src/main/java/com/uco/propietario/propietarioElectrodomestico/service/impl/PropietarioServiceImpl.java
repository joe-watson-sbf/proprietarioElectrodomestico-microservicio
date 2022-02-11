package com.uco.propietario.propietarioElectrodomestico.service.impl;

import com.uco.propietario.propietarioElectrodomestico.command.PropietarioCommand;
import com.uco.propietario.propietarioElectrodomestico.entity.PropietarioEntity;
import com.uco.propietario.propietarioElectrodomestico.fabrica.PropietarioFabrica;
import com.uco.propietario.propietarioElectrodomestico.model.Propietario;
import com.uco.propietario.propietarioElectrodomestico.repository.PropietarioRepository;
import com.uco.propietario.propietarioElectrodomestico.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Autowired
    private PropietarioFabrica propietarioFabrica;


    @Override
    public List<PropietarioCommand> findAll() {
        return propietarioFabrica.entityToCommand(propietarioRepository.findAll());
    }



    @Override
    public PropietarioCommand findById(int id) {
        return PropietarioFabrica.entityToCommand(propietarioRepository.findById(id).orElse(null));
    }

    @Override
    public void agregar(PropietarioCommand propietarioCommand) {
        PropietarioEntity propietarioEntity = propietarioFabrica.CommandToEntity(propietarioCommand);
        propietarioRepository.save(propietarioEntity);

    }
}
