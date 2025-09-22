package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btBuscar;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(Color.decode("#A2B38B"));

        btBuscar = new JButton("Buscar");
        btBuscar.setBounds(30,25,100,30);
        btBuscar.setActionCommand("buscar");
        add(btBuscar);

        btSalir = new JButton("Salir");
        btSalir.setBounds(170,25,70,30);  
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btBuscar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}
