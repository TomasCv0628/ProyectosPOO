package ejecutable;

import javax.swing.JOptionPane;

import controlador.Controlador;
import modelo.Reader;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "Recuerde que el archivo del proyecto debe estar en el escritorio");
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentanaPrincipal);
        
    }    
}
