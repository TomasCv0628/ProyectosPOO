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
    private JButton btAgregarMin;
    private JButton btCalcularPlan;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton AgregarVendedor
        btAgregarMin = new JButton("Minutos");
        btAgregarMin.setBounds(115,20,170,20);
        btAgregarMin.setActionCommand("agregarMin");
        this.add(btAgregarMin);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(115,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarMin.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}
