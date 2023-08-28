/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeentrada;

/**
 *
 * @author CHRISTIAN
 */
public class Persona {
    private String nombre;
    private int edad;
    private char genero;

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void setearNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void setearEdad(int edad) {
        this.edad = edad;
    }

    public int obtenerEdad() {
        return edad;
    }

    public char obtenerGenero() {
        return genero;
    }

    public static double calcularEdadPromedio(Persona[] personas) {
        int totalEdades = 0;
        for (Persona persona : personas) {
            totalEdades += persona.obtenerEdad();
        }
        return (double) totalEdades / personas.length;
    }
}
