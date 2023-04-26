/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrones_01;

import java.util.Scanner;

/**
 *
 * @author Carvajal
 */
public class ObesrvadorPatronesExternos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Seleccione la opcion requerida\n"
                + "1. Prestamo de libros\n"
                + "2. Prestamo de revistas\n");
        Observador o1 = new Observador();
            Sujeto sub1 = new Sujeto();
            Scanner in = new Scanner(System.in);
            int opcion = in.nextInt();
            switch(opcion){
                case 1:
                    sub1.Registrado(o1);
                    System.out.println("Se notificara respecto al libro requerido");
                    sub1.setFlag(1);
                    sub1.NoRegistrado(o1);
                    System.out.println("Notificacion sobre prestamo de libro:");
                    sub1.setFlag(0);
                case 2:
                    sub1.Registrado(o1);
                    System.out.println("Se notificara respecto al revista requerido");
                    sub1.setFlag(1);
                    sub1.NoRegistrado(o1);
                    System.out.println("Notificacion sobre prestamo de revista:");
                    sub1.setFlag(0);
                default:
                    System.exit(0);
            }
    }
    
}
