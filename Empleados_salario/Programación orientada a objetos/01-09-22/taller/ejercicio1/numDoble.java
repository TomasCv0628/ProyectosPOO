package ejercicio1;

import javax.swing.JOptionPane;

public class numDoble 
{
    public static void main(String[] args) 
    {
        // VARIABLES

        int n;
        int z;
        // Input

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero: "));

        // Processing

        z = n*2;

        // Output

        JOptionPane.showMessageDialog(null, "El doble de " + n + " es " + z);
    }
}
