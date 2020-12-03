package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        Alumno alumno = new Alumno("201930010039");
        alumno.setNombre("Josue David Guerrero");
        alumno.setEdad(23);
        alumno.setEstatura(1.61);
        alumno.setTelefono("98-65-42-13");

        Catedratico catedratico = new Catedratico("Walter Suazo");
        catedratico.setTel_Catedratico("98-65-32-65");
        catedratico.setCorreo("walter.suazo@uth.hn");

        Asignatura asignatura = new Asignatura("Programacion Orientada a Objetos");
        asignatura.setHorario("Lunes a Jueves\n19:20 -20:10");
        asignatura.setModalidad("Virtual por Zoom");

        System.out.println("\nDatos del estudiante");
        System.out.println("Cuenta: "+alumno.getCuenta());
        System.out.println("Nombre: "+alumno.getNombre());
        System.out.println("Edad: "+alumno.getEdad()+" anios");
        System.out.println("Estatura: "+alumno.getEstatura()+" metros");
        System.out.println("Telefono: "+alumno.getTelefono());

        System.out.println("\nDatos del catedratico");
        System.out.println("Nombre: "+catedratico.getCatedratico());
        System.out.println("Telefono: "+catedratico.getTel_Catedratico());
        System.out.println("Correo: "+catedratico.getCorreo());

        System.out.println("\nDatos de la clase");
        System.out.println("Asignatura: "+asignatura.getAsignatura());
        System.out.println("Horario: "+asignatura.getHorario());
        System.out.println("Modalidad: "+asignatura.getModalidad());
    }
}
