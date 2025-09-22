package ejercicio4;

import javax.swing.JOptionPane;

public class ParesMenores
{
    public static void main(String[] args) 
    {
        // Variables
        
        int n;
        int z;
        int j;

        // Input

        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero: "));
        z = 0;
        j = 1;
        // Processing
        for (int i = 1; i <= n; i ++)
        {   

            if(i%2==0)
            {
                z = z+i;
  
            }
            j = z/i;
        }

        JOptionPane.showMessageDialog(null,"La suma de los numeros pares es " + z + " y su promedio es " + j);
    }   
}
