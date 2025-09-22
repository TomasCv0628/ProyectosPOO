package ejecutable;

import controlador.Controlador;
import modelo.Ahorros;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {

        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Controlador miControlador = new Controlador();
        
        Ahorros n = new Ahorros(20000000,0);

        System.out.println(n.calcularIntereses());
    }
}
