package vista;

import javax.swing.JFrame;
import java.awt.Color;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public DialogoSec miDialogoSec;
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#EDE6DB"));


        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,280,220);
        this.add(miPanelEntradaDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,240,280,80);
        this.add(miPanelOperaciones);

        //Caracteristicas de la ventana
        this.setTitle("JET");
        this.setSize(300,360);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }
    public void crearDialogoSec()
    {
        miDialogoSec = new DialogoSec();
    }

}
