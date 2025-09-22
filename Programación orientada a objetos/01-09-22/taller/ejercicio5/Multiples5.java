package ejercicio5;

import javax.swing.JOptionPane;

public class Multiples5 
{
    public static void main(String[] args) 
    {
        // Variables
        int a;
        int b;
        int z;
        int y;

        // Input

        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero: "));

        // Processing
        z = 0;
        y = 0;
        if (a<b)
        {
            
            for (int i = 0; (i+a) <= b; i ++)
            {   
    
                if(i%5==0)
                {
                    y = y+i;
      
                }
                z = y/(i+1);

            }
            
        }
        if (a>b)
        {
            
            for (int i = 0; (i+b) <= a; i ++)
            {   
    
                if(i%5==0)
                {
                    y = y+i;
      
                }
                z = y/(i+1);
            }

        }


        JOptionPane.showMessageDialog(null, "La suma de los multiplos de 5 entre " +  a + " y " + b + " es igual a " + (z+y) + " y su promedio es " + z);
    }
}
