package com.uco.propietario.propietarioElectrodomestico.model;


import com.uco.propietario.propietarioElectrodomestico.model.bussinesException.BusinessException;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("ALL")
public class Validar {

    public static String unSoloEspacio(String cadena) {
        String regex = "\\s{2,}";
        Pattern patron = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher validador = patron.matcher(cadena);

        return validador.replaceAll(" ").trim();
    }


    public static String quitarEspacios(String cadena) {
        String regex = "\\s+";
        Pattern patron = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher validador = patron.matcher(cadena);
        return validador.replaceAll("").trim();
    }


    public static void email(String email, String vacio, String invalido) throws BusinessException {

        if (email == null) {
            throw new BusinessException(vacio);
        } else {
            if (!(email.contains(".") && email.contains("@"))) {
                throw new BusinessException(invalido);
            }
        }
    }

    public static void estaVacia(String identificador, String mensaje) throws BusinessException {

        if (identificador == null || identificador.isEmpty()) {
            throw new BusinessException(mensaje);
        }
    }

    public static void idVacia(int identificador, String mensaje) throws BusinessException {

        if (identificador == 0) {
            throw new BusinessException(mensaje);
        }
    }

    public static void fechaNula(Date fechaInicio, String mensaje) throws BusinessException {
        if(fechaInicio == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void encontrarCero(Double valor, String mensaje) throws BusinessException {
        if (valor <= 0){
            throw new BusinessException(mensaje);
        }
    }

}
