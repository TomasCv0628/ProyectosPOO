package ejercicio8;

import java.util.Random;

import javax.swing.JOptionPane;

public class ParImpar2D 
{
    public static void main(String[] args) 
    {
        // Variables
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de columnas: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de filas: "));
        int[][] principal = new int[n][m];
        int[] par;
        int[] impar;
        
        // Input
        int z =0;
        int b =0;
        Random numAleatorio = new Random();
        for (int i = 0; i < principal.length; i++ )
        {
            for (int j= 0; j<principal[0].length; j++)
            {
                principal[i][j] = (int) (numAleatorio.nextDouble()* 10.0);
                System.out.println(principal[i][j]);
                if (principal[i][j] % 2 == 0)
                {
                    z = z + 1;
                }
                else
                {
                    b = b + 1;
                }
            }

        }
        par = new int[z];
        impar = new int[b];
        int z2 = 0;
        int b2 = 0;

        for (int i = 0; i < principal.length; i++ )
        {
            for (int j = 0; j<principal[0].length; j++)
            {
                if(principal[i][j] % 2 == 0 )
                {
                    par[z2] = principal[i][j];
                    z2 = z2 + 1;

                }

                else
                {
                    impar[b2]=principal[i][j];
                    b2 = b2 +1;

                }

            }   
        }
        for (int i = 0; i < par.length; i++ )
        {
            JOptionPane.showMessageDialog(null, "Los valores pares son " + par[i] );
        }
        for (int i = 0; i < impar.length; i++ )
        {
            JOptionPane.showMessageDialog(null, "Los valores impares son " + impar[i] );
        }

    }
    
}
