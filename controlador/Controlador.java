package controlador;

import modelo.Empleado;
import modelo.Carro;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{

    private VentanaPrincipal venPrin;
    private EmpresaAutomotriz model;
    private Empleado employed;
    private Carro car;
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, EmpresaAutomotriz pModel, Carro pCarro, Empleado pEmpleado)
    {
        this.venPrin = pVenPrin;
        this.model= pModel;
        this.employed = pEmpleado;
        this.car = pCarro;
        this.venPrin.miPanelOperaciones.bAgregar.addActionListener(this);
        this.venPrin.miPanelOperaciones.bSalario.addActionListener(this);
        this.venPrin.miPanelOperaciones.bSalir.addActionListener(this);
        this.venPrin.miPanelOperaciones.bNomina.addActionListener(this);
        this.venPrin.miDialogoCarro.btAceptar.addActionListener(this);
        this.venPrin.miDialogoCarro.btSalario.addActionListener(this);
        this.venPrin.miDialogoCarro.btAgregar.addActionListener(this);
    }    
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("agregar"))
        {
            this.model.agregarEmpleado(new Empleado(this.venPrin.miPanelEntradaDatos.getNombre()),Integer.parseInt(this.venPrin.miPanelEntradaDatos.getPos()));                  

        }
        if(comando.equals("venta"))
        {

            this.venPrin.crearDialogoCarro();
            this.venPrin.miDialogoCarro.agregarOyentesBotones(this);  


        }
        if(comando.equals("nomina"))
        {
            this.model.agregarEmpleado(new Empleado((String)this.venPrin.miPanelEntradaDatos.cbNombre.getSelectedItem()),this.venPrin.miPanelEntradaDatos.cbNombre.getSelectedIndex());                  
            this.model.getEmpleado(this.venPrin.miPanelEntradaDatos.cbNombre.getSelectedIndex());
            this.venPrin.miPanelResultado.mostrarResultado("\nLa nomina es de " + this.model.calcularNomina());

        }
        if(comando.equals("salario"))
        {

            System.out.println(this.venPrin.miPanelEntradaDatos.cbNombre.getSelectedIndex());
            this.employed.calcularSalario();
            this.venPrin.miPanelResultado.mostrarResultado("\nEl salario es de " + this.employed.getSalario());

        }
        if(comando.equals("agregar2"))
        {
            this.car.setPrecio(Double.parseDouble(this.venPrin.miDialogoCarro.getPCarro()));
            new Empleado((String)this.venPrin.miPanelEntradaDatos.cbNombre.getSelectedItem()).venderCarro(new Carro(this.car.getPrecio()));
            System.out.println(new Empleado((String)this.venPrin.miPanelEntradaDatos.cbNombre.getSelectedItem()).ventas.size());
            this.venPrin.miPanelResultado.mostrarResultado("\nEL precio del carro es " + this.car.getPrecio());
        }
        if(comando.equals("aceptar"))
        {
            this.venPrin.miPanelResultado.mostrarResultado("\nVenta agregada");
            System.out.println(this.employed.ventas.size());
            this.venPrin.miDialogoCarro.cerrarDialogo();
        }
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrara ","Empleado", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
