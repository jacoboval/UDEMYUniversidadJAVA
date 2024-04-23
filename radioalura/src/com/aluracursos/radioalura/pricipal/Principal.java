package com.aluracursos.radioalura.pricipal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast  = new Podcast();
        miPodcast.setPresentador("Gabriela");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();            
        }
        for (int i = 0; i < 4500; i++) {
            miCancion.reproduce();            
        }
        System.out.println("Total reproducciones: = " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());
        
                
    }
}
