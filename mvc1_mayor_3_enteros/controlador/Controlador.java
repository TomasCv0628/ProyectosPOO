package mvc1_mayor_3_enteros.controlador;

import mvc1_mayor_3_enteros.modelo.Mayor3Enteros;
import mvc1_mayor_3_enteros.vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    
    //-----------------    
    //----Atributos----
    //-----------------
    
    private VentanaPrincipal venPrin;
    private Mayor3Enteros model;



    //-----------------    
    //-----Metodos-----
    //-----------------    

    // Metodo constructor

    public Controlador(VentanaPrincipal pVenPrin,Mayor3Enteros pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.btHallarMayor.addActionListener(this);
        this.venPrin.miPanelOperaciones.btsalir.addActionListener(this);
        this.venPrin.miPanelOperaciones.btborrar.addActionListener(this);
    }
    
    // metodo de atencion de eventos

    public void actionPerformed(ActionEvent ae)
    {
        // Identificar el comando generado (hallar mayor, borrar, salir)
    
        String comando = ae.getActionCommand();
        if(comando.equals("HallarMayor"))
        {
            try
            {
                this.model.setX(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfx()));
                this.model.setY(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfy()));
                this.model.setZ(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfz()));
                this.model.hallarMayor();
                this.venPrin.miPanelResultados.mostrarResultado(this.model.getMayor());
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos. \n Los datos deben ser enteros ", "Suma 3 enteros",JOptionPane.ERROR_MESSAGE);
            }
        }

        if(comando.equals("borrar"))
        {
            JOptionPane.showMessageDialog(null, "Los valores se borraran ","Suma 3 enteros", JOptionPane.WARNING_MESSAGE);
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultados.borrar();
        }
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrara ","Suma 3 enteros", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

    }

}


