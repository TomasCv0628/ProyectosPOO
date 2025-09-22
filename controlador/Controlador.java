package controlador;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia planTel;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pTel)
    {
        this.venPrin = pVenPrin;
        this.planTel = pTel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("agregarMin"))
        {
            venPrin.crearDialogoMin();
            this.venPrin.miDialogoMin.agregarOyenteBoton(this);
        }
        //Calcular el sueldo de un vendedor
        if(comando.equals("calcularPlan"))
        {
            this.planTel.setCantMin(Integer.parseInt(venPrin.miDialogoMin.getMins()));
            this.planTel.setCostMin(Double.parseDouble(venPrin.miDialogoMin.getCostMin()));
            this.planTel.setOpe(venPrin.miPanelEntradaDatos.getOpe().toUpperCase());
            this.planTel.calcularPlan();
            venPrin.miPanelResultados.mostrarResultado("El plan para el numero " + venPrin.miPanelEntradaDatos.getNum() + "\ntendra un precio de " + planTel.getPlan());
            venPrin.miDialogoMin.cerrarDialogoMin();
        }
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrara ","Plan Telefonico", JOptionPane.WARNING_MESSAGE);

            System.exit(0);
        }  
    }
}
