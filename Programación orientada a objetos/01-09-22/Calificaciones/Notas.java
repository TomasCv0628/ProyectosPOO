package Calificaciones;

import java.util.Random;

public class Notas 
{
    public static void main(String[] args) 
    {   
        final int TOTAL_EST = 12;
        double [] Calificaciones = new double[TOTAL_EST];
        Random numAleatorio = new Random();
        for (int i = 0; i < Calificaciones.length; i++)
        {
           Calificaciones[i] = Math.round(numAleatorio.nextDouble()* 5.0 * 10.0)/10.0;
        }
        //Promedio

        double suma = 0;
        double promedio = 0;
        for(int i = 0; i < Calificaciones.length; i++)
        {
            suma = suma + Calificaciones [i];
        }
        promedio = suma /TOTAL_EST;



        
        // Salida

        String salida = "notas = [";
        for (int i = 0; i < Calificaciones.length; i++)
        {
            if (i != (TOTAL_EST)- 1)
            {
                salida = salida + Calificaciones[i] + ",";
            }
            else
            {
                salida = salida + Calificaciones[i];
            }

        }
        salida = salida + "]"; 
        salida = "\nEl promedio del curso es " + promedio;
        System.out.println(salida);

    }    
}
