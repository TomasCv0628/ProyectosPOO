package modelo;

import java.util.ArrayList;

public class Empleado 
{
    private String nombre;
    private double salarioFinal;
    public ArrayList ventas;
    public final static double SALARIO_MIN = 1000000;

    public Empleado (String pNombre)
    {
        this.nombre = pNombre;
        this.ventas= new ArrayList();
    }
    public void setNombre(String pNombres)
    {
        nombre = pNombres;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void venderCarro(Carro carroVendido)
    {
        ventas.add(carroVendido);
    }
    public void calcularSalario()
    {


        if(ventas.isEmpty())
        {
            salarioFinal = SALARIO_MIN;
        }
        else
        {
            int numerosCarrosVendidos= ventas.size();
            double x = 0;
            salarioFinal = SALARIO_MIN + 100000*numerosCarrosVendidos;
            for(int i = 0; i < numerosCarrosVendidos; i++)
            {
                Carro carro = (Carro)ventas.get(i);
                x = x + carro.getPrecio(); 
            }
            salarioFinal = salarioFinal + 0.02*x;
        }

    }
    public double getSalario()
    {
        return salarioFinal;
    }


}
