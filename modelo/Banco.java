package modelo;

import java.util.ArrayList;

import vista.PanelResultados;

public class Banco
{
    // ATRIBUTOS
    private ArrayList<Ahorros> CuentaAhorros;
    private ArrayList<Corriente> CuentaCorriente;
    private ArrayList<Libreta2022> CuentaLibreta;


    //METODO CONSTRUCTOR
    public Banco(ArrayList<Ahorros> CuentaAhorros,ArrayList<Corriente> CuentaCorriente,ArrayList<Libreta2022> CuentaLibreta )
    {
        this.CuentaAhorros = CuentaAhorros;
        this.CuentaCorriente = CuentaCorriente;
        this.CuentaLibreta = CuentaLibreta;

    }
    
    public Banco()
    {
        this.CuentaAhorros = new ArrayList<>();
        this.CuentaCorriente = new ArrayList<>();
        this.CuentaLibreta = new ArrayList<>();
    
    }

    public void setCuentaAhorros(ArrayList<Ahorros> CuentaAhorros) 
    {
        this.CuentaAhorros = CuentaAhorros;
    }
    public void setCuentaCorriente(ArrayList<Corriente> CuentaCorriente)
    {
        this.CuentaCorriente = CuentaCorriente;

    }
    public void setCuenaLibreta(ArrayList<Libreta2022> CuentaLibreta )
    {
        this.CuentaLibreta = CuentaLibreta;
    }

    public ArrayList<Ahorros> getAhorros() 
    {
        return CuentaAhorros;
    }

    public ArrayList<Corriente> getCorriente() 
    {
        return CuentaCorriente;
    }
    
    public ArrayList<Libreta2022> getLibreta() 
    {
        return CuentaLibreta;
    }
    
    public void agregarCuentaAhorros(Ahorros ahr)
    {
        CuentaAhorros.add(ahr);
    }
    public void agregarCuentaCorriente(Corriente cor)
    {
        CuentaCorriente.add(cor);
    }
    public void agregarCuentaLibreta(Libreta2022 lib)
    {
        CuentaLibreta.add(lib);
    }
    public void imprimirCuentas()
    {
        for(int i = 0; i < CuentaAhorros.size(); i ++)
        {
            PanelResultados.mostrarResultado(CuentaAhorros.get(i).toString());
        }
        for(int i = 0; i < CuentaCorriente.size(); i ++)
        {
            PanelResultados.mostrarResultado(CuentaCorriente.get(i).toString());
        }
        for(int i = 0; i < CuentaLibreta.size(); i ++)
        {
            PanelResultados.mostrarResultado(CuentaLibreta.get(i).toString());
        }

    }
}