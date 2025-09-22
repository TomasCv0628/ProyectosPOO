package SumaNnaturales;

import javax.swing.JOptionPane;

public class NnaturalesNum 
{
    public static void main(String[] args) 
    {
        // Variables 
        
        int n;
        int i;
        int z;
        // Input

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros a sumar: "));

        // Processing
        
        i = 1;
        z = 0;
        while(i <= n)
        {
            z = z + i;
            i += 1;
        }
        JOptionPane.showMessageDialog(null,"La suma de los " + n + " primeros numeros es:" + z);
    }
}
