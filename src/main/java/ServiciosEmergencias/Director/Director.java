package ServiciosEmergencias.Director;

import ServiciosEmergencias.Builders.Builder;

import java.lang.module.ModuleDescriptor;
import java.util.Scanner;

public class Director {
    Scanner sc = new Scanner(System.in);
/*
    public void construirUnidadAdministrativa(Builder builder) {
        builder.setNombre("Unidad Administrativa");
        builder.setAmbulancias(1);
        builder.setMediaDeAsistencias(1.0);
    }

    public void construirAsistencia(Builder builder) {
        builder.setMediaDeAsistencias(4.5);
    }

    public void construirNombres(Builder builder) {
        builder.setNombre("Boadilla del Monte");
    }

    public void construirAmbulancia(Builder builder) {
        builder.setAmbulancias(100);
    }*/
    String nombre;
    int ambulancias;
    double mediaDeAsistencias;
    public void cotruirEmergenciasSimple(Builder builder) {
        builder.setNombre("Pozuelo");
        builder.setAmbulancias(100);
        builder.setMediaDeAsistencias(4.5);
    }
    public void cotruirEmergenciasComplejo(Builder builder) {
        builder.setNombre("Las Rozas");
        builder.setAmbulancias(100);
        builder.setMediaDeAsistencias(4.5);
    }

    //hacer metodo para que el usuario introduzca los datos
    public void introducirDatos(Builder builder){
        System.out.println("Introduce el nombre de la emergencia");
        nombre = sc.nextLine();
        builder.setNombre(nombre);
        System.out.println("Introduce el numero de ambulancias");
        ambulancias = sc.nextInt();
        builder.setAmbulancias(ambulancias);
        System.out.println("Introduce la media de asistencias");
        mediaDeAsistencias = sc.nextDouble();
        builder.setMediaDeAsistencias(mediaDeAsistencias);
    }

}
