package mvc1_mayor_3_enteros.ejecutable;

import mvc1_mayor_3_enteros.controlador.Controlador;
import mvc1_mayor_3_enteros.modelo.Mayor3Enteros;
import mvc1_mayor_3_enteros.vista.VentanaPrincipal;

public class test 
{
    public static void main(String[] args) 
    {
        Mayor3Enteros miMayor3Enteros = new Mayor3Enteros();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana, miMayor3Enteros);
    }    
}