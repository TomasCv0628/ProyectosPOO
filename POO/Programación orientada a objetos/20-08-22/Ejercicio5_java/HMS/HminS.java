package Ejercicio5_java.HMS;

import javax.swing.JOptionPane;

public class HminS
{
    public static void main(String[] args) 
    {
        // Declarar Variables
        
        int s;
        int h;
        int m;

        // Input
        
        s = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de segundos: "));

        // Processing
        h = s / 3600;
        s = s % 3600;
        m = s / 60;
        s = s % 60;

        JOptionPane.showMessageDialog(null,"Las horas minutos y segundos de los "+ s + " segundos es: " + h + ":" + m + ":" + s, "Horas,minutos y segundos" ,JOptionPane.INFORMATION_MESSAGE);


    }
}