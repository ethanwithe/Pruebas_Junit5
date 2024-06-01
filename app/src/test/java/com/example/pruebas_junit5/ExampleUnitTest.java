package com.example.pruebas_junit5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Funciones funciones = new Funciones();

    @Test
    public void testValidarCorreo() {
        assertTrue(funciones.validarCorreo("usuario@example.com"));
        assertFalse(funciones.validarCorreo("usuario@examplecom"));
        assertFalse(funciones.validarCorreo("usuario@example"));
        assertFalse(funciones.validarCorreo("usuarioexample.com"));
        assertFalse(funciones.validarCorreo(""));
    }

    @Test
    public void testValidarNombre() {
        assertTrue(funciones.validarNombre("Juan"));
        assertTrue(funciones.validarNombre("María Pérez"));
        assertFalse(funciones.validarNombre(""));
        assertFalse(funciones.validarNombre("A"));
    }

    @Test
    public void testValidarID() {
        assertTrue(funciones.validarID("ABC123"));
        assertTrue(funciones.validarID("xyz789"));
        assertFalse(funciones.validarID(""));
        assertFalse(funciones.validarID("123"));
        assertFalse(funciones.validarID("ABC-123"));
    }
}
