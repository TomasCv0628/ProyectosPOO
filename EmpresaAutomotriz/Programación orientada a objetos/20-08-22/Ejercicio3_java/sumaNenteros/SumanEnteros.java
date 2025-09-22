package Ejercicio3_java.sumaNenteros;

import javax.swing.JOptionPane;

public class SumanEnteros
{
    public static void main(String[] args) 
    {
        // Declarar Variables
        
        int s;
        int n;
        

        // Input
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de valores a sumar: "));
        s = n*(n+1)/2;
        // Processing


        JOptionPane.showMessageDialog(null,"La suma de los "+ n + " primeros numeros es: " + s, "Inverso" ,JOptionPane.INFORMATION_MESSAGE);


    }
}