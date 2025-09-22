package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{

    public JButton bAgregar;
    public JButton bSalir;
    public JButton bSalario;
    public JButton bNomina;

    public PanelOperaciones()
    {
        
        setLayout(null);
        setBackground(Color.WHITE);
        
        bAgregar = new JButton("Agregar");
        bAgregar.setFont(new Font("Arial", BOLD, 12));
        bAgregar.setBounds(10,20,100,20);
        bAgregar.setActionCommand("agregar");
        this.add(bAgregar);
        
        bSalario = new JButton("Venta");
        bSalario.setFont(new Font("Arial", BOLD, 12));
        bSalario.setBounds(115,20,80,20);
        bSalario.setActionCommand("venta");
        this.add(bSalario);

        bNomina = new JButton("Nomina");
        bNomina.setBounds(200,20,90,20);
        bNomina.setActionCommand("nomina");
        this.add(bNomina);
        
        
        bSalir = new JButton("Salir");
        bSalir.setFont(new Font("Arial", BOLD, 12));
        bSalir.setBounds(300,20,70,20);  
        bSalir.setActionCommand("salir");
        this.add(bSalir);


        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }
}
