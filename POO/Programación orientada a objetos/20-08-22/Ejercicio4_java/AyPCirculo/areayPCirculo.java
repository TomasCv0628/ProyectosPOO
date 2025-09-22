package Ejercicio4_java.AyPCirculo;


import javax.swing.JOptionPane;

public class areayPCirculo
{
    public static void main(String[] args) 
    {
        // Declarar Variables
        
        float r;
        float a;
        float p;



        

        // Input
        
        r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo: "));
        p = (float) (2*(Math.PI)*r);
        a = (float) (Math.PI*Math.pow(r,2));
        

        // Processing


        JOptionPane.showMessageDialog(null,"El área del circulo con radio " + r + " es " + a + " y tiene un perimetro de: " + p  , "Inverso" ,JOptionPane.INFORMATION_MESSAGE);


    }
}