package modelo;

public class PlanTelefonia
{
    private String operador;
    private int cantMin;
    private double precioMin;
    private double precioPlan;
    private int numero;


    public PlanTelefonia(String pOperador, int pCantMin, double pPrecioMin, int pNum)
    {
        operador = pOperador;
        cantMin = pCantMin;
        precioMin = pPrecioMin;
        numero = pNum;
    }
    public PlanTelefonia()
    {
        operador = "";
        cantMin = 0;
        precioMin = 0;
        numero = 0;
    }
    public void calcularPlan()
    {
        double precio = 0;
        if (operador.equals("MOVILUJO"))
        {
            precio = (cantMin * precioMin)*0.5;
        }
        else
        {
            precio = cantMin*precioMin;
        }
        precioPlan = precio;
    }
    public double getPlan()
    {
        return precioPlan;
    }

    public void setCantMin(int pCantMin)
    {
        this.cantMin = pCantMin;
    }
    public void setCostMin(double pCostMin)
    {
        this.precioMin = pCostMin;
    }
    public void setOpe(String pOpe)
    {
        this.operador = pOpe;
    }
    public void setTel(int pNum)
    {
        this.numero = pNum;
    }
    
}