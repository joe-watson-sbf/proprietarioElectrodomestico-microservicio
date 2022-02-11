package com.uco.propietario.propietarioElectrodomestico.model.bussinesException;

public class PropietarioNoExisteException extends RuntimeException{
    public PropietarioNoExisteException(String mensaje) {
        super(mensaje);
    }
}
