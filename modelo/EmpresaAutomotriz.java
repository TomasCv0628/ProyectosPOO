package modelo;

import javax.swing.JList;

public class EmpresaAutomotriz 
{
    private final static int NUMERO_EMPLEADOS = 10;
    public Empleado[] empleados;
    int j;
    

    
    public EmpresaAutomotriz()
    {
        empleados = new Empleado[NUMERO_EMPLEADOS];
    }
    public void agregarEmpleado(Empleado emp, int pos)
    {
        empleados[pos] = emp;
    }
    public Empleado getEmpleado(int i)
    {
        return empleados[i];
    }
    public double calcularNomina()
    {

        double nomina = 0;
        for(int i= 0; i < 10;i++)
        {
            nomina = nomina + empleados[i].getSalario();
        }
        return nomina;
    }
}