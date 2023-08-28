/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeentrada;
import java.util.Scanner;

/**
 *
 * @author CHRISTIAN
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persona[] personas = new Persona[3];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después de ingresar la edad

            System.out.println("Ingrese el género de la persona " + (i + 1) + " (M/F):");
            char genero = scanner.nextLine().charAt(0);

            personas[i] = new Persona(nombre, edad, genero);
        }

        scanner.close();

        double edadPromedio = Persona.calcularEdadPromedio(personas);
        System.out.println("Edad promedio de las personas: " + edadPromedio);
    }
}
