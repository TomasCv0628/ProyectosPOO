package Temperatura;

import javax.swing.JOptionPane;

public class ClimaTemp 
{
    public static void main(String[] args) 
    {
        // Variables
        int t;
        // Input
        t = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la temperatura actual: "));
        //processing
        if (t < 10)
        {
            JOptionPane.showMessageDialog(null, "Tienes clima Frio");
        }
        if (t > 9 && t <= 20)
        {
            JOptionPane.showMessageDialog(null, "Tienes clima Nublado");
        }

        if (t > 20 && t < 31)
        {
            JOptionPane.showMessageDialog(null, "Tienes clima Caliente");
        }
        if (t > 30)
        {
            JOptionPane.showMessageDialog(null, "Tienes clima Tropical");
        }
        System.exit(0);
    }    
}
