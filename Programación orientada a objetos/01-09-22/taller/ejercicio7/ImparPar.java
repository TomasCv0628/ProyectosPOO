package ejercicio7;

import java.util.Random;

public class ImparPar 
{
    public static void main(String[] args) 
    {
        // Variables

        int [] bases = new int[5];
        int [] arreglo = new int[5];

        // Input 

        Random numAleatorio = new Random();
        for (int i = 0; i < bases.length; i++)
        {
           bases[i] = (int) Math.round(numAleatorio.nextDouble()*20.0);
           System.out.println(bases[i]);
        }
        for (int i = 0; i < bases.length; i++)
        {
            if (i%2 == 0)
            {
                arreglo[i]= bases[i]*bases[i];
            }
            if (i%3 == 0)
            {

                arreglo[i]=bases[i]*bases[i]*bases[i];
            }
            System.out.println(arreglo[i]);
        }

    }
}
