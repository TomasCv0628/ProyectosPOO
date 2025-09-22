package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class AddMinutos extends JDialog
{
    private JLabel lbCantMin;
    private JLabel lbCostMin;
    private JTextField txCantMin;
    private JTextField txCostMin;
    private JButton btAgregar;

    public AddMinutos()
    {
        this.setLayout(null);

        lbCantMin = new JLabel("Cantidad de min: ");
        lbCantMin.setBounds(20,30,150,20);
        this.add(lbCantMin);

        txCantMin = new JTextField();
        txCantMin.setBounds(150,30,100,20);
        this.add(txCantMin);

        lbCostMin = new JLabel("Costo por minuto: ");
        lbCostMin.setBounds(20,70,150,20);
        this.add(lbCostMin);

        txCostMin = new JTextField();
        txCostMin.setBounds(150,70,100,20);
        this.add(txCostMin);

        btAgregar = new JButton("Calcular Plan");
        btAgregar.setBounds(75,150,150,20);
        btAgregar.setActionCommand("calcularPlan");
        this.add(btAgregar);

        this.setTitle("Minutos");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    public String getMins()
    {
        return txCantMin.getText();
    }
    public String getCostMin()
    {
        return txCostMin.getText();
    }
    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregar.addActionListener(pAL);
    }
    public void cerrarDialogoMin()
    {
        this.dispose();
    }



}
