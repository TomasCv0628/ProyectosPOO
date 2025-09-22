package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoCarro extends JDialog
{
        //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbPCarro;
    private JTextField txPCarro;
    public JButton btAceptar;
    public JButton btSalario;
    public JButton btAgregar;


    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public DialogoCarro()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("Lista Carros",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        this.add(lbTitulo);
        
        lbPCarro= new JLabel("Precio Carro: ",JLabel.RIGHT);
        lbPCarro.setBounds(10,50,140,20);
        this.add(lbPCarro);
        
        txPCarro= new JTextField();
        txPCarro.setBounds(150,50,100,25);
        this.add(txPCarro);
        
        
        btAceptar = new JButton("Aceptar");
        btAceptar.setBounds(20,170,260,25);
        btAceptar.setActionCommand("aceptar");
        this.add(btAceptar);

        btSalario = new JButton("Salario");
        btSalario.setBounds(20,140,260,25);
        btSalario.setActionCommand("salario");
        this.add(btSalario);
               
        btAgregar = new JButton("Agregar");
        btAgregar.setBounds(20,100,260,25);
        btAgregar.setActionCommand("agregar2");
        this.add(btAgregar);
        //Caracteristicas de la ventana
        setTitle("Carro");
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
        btSalario.addActionListener(pAL);
        btAgregar.addActionListener(pAL);
    }
    public String getPCarro()
    {
        return txPCarro.getText();
    }
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}
