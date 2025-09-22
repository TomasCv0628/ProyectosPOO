package mvc1_mayor_3_enteros.vista;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //------------------------- 
    // Atributos
    //-------------------------
    
    public JButton btborrar;
    public JButton btHallarMayor;
    public JButton btsalir;

    //------------------------- 
    // Métodos
    //-------------------------


    // Metodo constructor

    public PanelOperaciones()
    {
        this.setBackground(Color.GRAY);
        setLayout(null);

        TitledBorder borde = BorderFactory.createTitledBorder("Botones");
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);

        // Crear botones

        btHallarMayor = new JButton("Hallar Mayor");
        btHallarMayor.setBounds(20,20,140,20);
        btHallarMayor.setActionCommand("HallarMayor");
        this.add(btHallarMayor);

        btborrar = new JButton("Borrar");
        btborrar.setBounds(167,20,140,20);
        btborrar.setActionCommand("borrar");
        this.add(btborrar);

        btsalir = new JButton("Salir");
        btsalir.setBounds(314,20,140,20);
        btsalir.setActionCommand("salir");
        this.add(btsalir);

    }
}