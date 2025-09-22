package controlador;

import modelo.Ahorros;
import modelo.Banco;
import modelo.Libreta2022;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Banco mBanco;

    public void actionPerformed(ActionEvent ae) 
    {

        String comando = ae.getActionCommand();

        if (comando.equals("crearColeccion")) 
        {
            venPrin.crearDialogoCrear();
            venPrin.miDialogoCrear.agregarOyenteBoton(this);
        } 

        if (comando.equals("salir")) 
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrará", "Banco de nunca jamas",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }


}
