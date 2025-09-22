package Calificaciones;

import javax.swing.JOptionPane;

public class Notas2 
{
    public static void main(String[] args) 
    {
        final int TOTAL_EST = 3;
        final int TOTAL_MAT = 4;
        double [][] notas = new double[TOTAL_EST][TOTAL_MAT];

        // Ingresar datos

        for (int i = 0; i < notas.length; i++ )
        {
            for (int j = 0; j<notas[0].length; j++)
            {
                notas[i][j]= Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del estudiante: " + (i+1)+" en la materia " + (j+1)));

            }
        }
        // Nota promedio del grupo
        double suma = 0;
        double promedio = 0;

        for (int i = 0; i < notas.length; i++ )
        {
            for (int j = 0; j<notas[0].length; j++)
            {
                suma = suma + notas[i][j];
            }
        }
        promedio = suma/(TOTAL_EST * TOTAL_MAT);

        // SALIDA

        System.out.println("Nota promedio del curso " + promedio);


    }
}
