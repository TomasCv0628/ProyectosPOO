package CasoBiblioteca.ejecutable;

import CasoBiblioteca.controlador.Controlador;
import CasoBiblioteca.modelo.Biblioteca;
import CasoBiblioteca.vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Biblioteca miBiblioteca = new Biblioteca();
        Controlador miControlador = new Controlador(miVentana, miBiblioteca);
    }

}
