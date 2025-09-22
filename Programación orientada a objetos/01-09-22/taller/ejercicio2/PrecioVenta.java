package ejercicio2;

import javax.swing.JOptionPane;

public class PrecioVenta 
{
    public static void main(String[] args) 
    {
        // Variables

        int costo;
        String x = "El valor final es ";

        // Input

        costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del producto: "));

        // Processing

        if (costo < 3000)
        {
            JOptionPane.showMessageDialog(null, x + (costo + costo * 0.15));
        }
        if (3000 <= costo && costo <= 6000)
        {
            JOptionPane.showMessageDialog(null, x + (costo + 500));
        }
        if (costo > 6000)
        {
            JOptionPane.showMessageDialog(null, x + (costo + (costo * 0.25)) );
        }
    }
}
