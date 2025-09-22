package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //----------------------
    //Atributos
    //----------------------
    public JButton btAgregarSaldo;
    public JButton btRetirarSaldo;
    public JButton btBorrar;
    public JButton btSalir;
    public JButton btCrear;


    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.gray);
        
        //Creación y adicion de los botones
        btAgregarSaldo = new JButton("Depositar");
        btAgregarSaldo.setBounds(5,22,100,40);
        btAgregarSaldo.setActionCommand("agregarSaldo");
        this.add(btAgregarSaldo);

        btRetirarSaldo = new JButton("Retirar");
        btRetirarSaldo.setBounds(110,22,100,40);
        btRetirarSaldo.setActionCommand("RetirarSaldo");
        this.add(btRetirarSaldo);

        btCrear = new JButton("Crear");
        btCrear.setBounds(215,22,100,40);
        btCrear.setActionCommand("crear");
        this.add(btCrear);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(320,22,100,40);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);
        
        btSalir = new JButton("Salir");
        btSalir.setBounds(425,22,100,40);
        btSalir.setActionCommand("salir");
        this.add(btSalir);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

}
