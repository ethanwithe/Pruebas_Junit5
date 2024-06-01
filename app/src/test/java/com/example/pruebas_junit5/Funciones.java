package com.example.pruebas_junit5;

public class Funciones {

    public boolean validarCorreo(String correo) {

        return correo != null && !correo.trim().isEmpty() && correo.contains("@") && correo.indexOf("@") < correo.lastIndexOf(".");
    }

    public boolean validarNombre(String nombre) {

        return nombre != null && !nombre.trim().isEmpty() && nombre.trim().length() >= 2;
    }

    public boolean validarID(String id) {

        return id != null && !id.trim().isEmpty() && id.matches(".*[a-zA-Z].*") && id.matches("[a-zA-Z0-9]+");
    }
}
