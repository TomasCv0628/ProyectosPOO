package mvc1_mayor_3_enteros.modelo;

public class Mayor3Enteros 
{
    //-----------------    
    //----Atributos----
    //-----------------
    
    private int x;
    private int y;
    private int z;
    private int mayor;

    //-----------------    
    //-----Metodos-----
    //-----------------

    public void setX(int px)
    {
        this.x = px;

    }
    public void setY(int py)
    {
        this.y = py;

    }    
    public void setZ(int pz)
    {
        this.z = pz;

    }

    public void hallarMayor()
    {
        if (x > y)
        {
            if(x > z)
            {
                mayor = x;
    
            }
        
            else
            {
                mayor = z;
            }
        }
        else
        {
            if(y>z)
            {
                mayor = y;
            }
            else
            {
                mayor = z;
            }
        }

    }
    public int getMayor()
    {
        return mayor;
    }
}
