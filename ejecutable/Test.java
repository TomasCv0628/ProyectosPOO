package ejecutable;

import controlador.Controlador;
import modelo.Carro;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        EmpresaAutomotriz miEmpresaAutomotriz = new EmpresaAutomotriz();
        Empleado miEmpleado = new Empleado(null);
        Carro miCarro = new Carro(0);
        Controlador miControlador = new Controlador(miVentanaPrincipal, miEmpresaAutomotriz, miCarro,miEmpleado);


    }
}
