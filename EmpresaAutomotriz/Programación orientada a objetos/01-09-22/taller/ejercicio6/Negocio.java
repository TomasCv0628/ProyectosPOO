package ejercicio6;

import javax.swing.JOptionPane;

public class Negocio 
{
    public static void main(String[] args) 
    {
        // Variables

        double c1;
        double c2;
        double c3;
        int m;

        // Input
        c1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del capital de Pedro: "));
        c2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del capital de Juan: "));
        c3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el capital necesario: "));

        // Processing
        m = 0;
        while ((c1 + c2) < c3)
        {
            c1 = c1 + (c1*0.03);
            c2 = c2 + (c2*0.04);
            m = m + 1;
        }

        JOptionPane.showMessageDialog(null, "Los meses necesario para reclectar el capital de " + c3 + " son " + m);
        
    }
}
