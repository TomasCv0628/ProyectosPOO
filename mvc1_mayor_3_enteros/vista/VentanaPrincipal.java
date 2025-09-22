package mvc1_mayor_3_enteros.vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //------------------------- 
    // Atributos
    //-------------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelResultados miPanelResultados;
    public PanelOperaciones miPanelOperaciones;

    //------------------------- 
    // Métodos
    //-------------------------


    // Metodo constructor

    public VentanaPrincipal()
    {
        // Definicion
        this.setLayout(null);

        // Creación y adición de un panel tipo PanelEntradaDatos

        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,210);
        this.add(miPanelEntradaDatos);

        // Creación y adición de un panel tipo PanelResultados
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,230,480,60);
        this.add(miPanelOperaciones);
 
        // Creación y adición de un panel tipo PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,300,480,165);
        this.add(miPanelResultados);



        // Caracteristicas de la ventana
        this.setTitle("Mayor de tres enteros");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }




}