package modelo;

import javax.swing.JOptionPane;

public class SumaEnteros
{
    public static void main(String[] args) 
    {
        // Declaracion de variables
        
        int x; 
        int y;
        int z;

        // Input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de Y: "));


        // Processing
        
        z = x + y;
    
        // Output
        
        JOptionPane.showMessageDialog(null,"La suma de " + x + " mas " + y + " es " + z, "Suma Enteros" ,JOptionPane.INFORMATION_MESSAGE);

        // End
        System.exit(0);
    }
}