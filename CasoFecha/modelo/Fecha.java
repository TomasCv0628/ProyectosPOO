package modelo;

public class Fecha
{

    // -----------------------
    // ------ Atributos ------
    // -----------------------

    protected int dia;
    protected int mes;
    protected int annio;

    public Fecha(int d,int m , int a)
    {
        this.dia = d;
        this.mes = m;
        this.annio = a;
    }
    public Fecha()
    {

    }
    // Constructor con parametro String dd/mm/aaaa
    /* 
    public Fecha(String s)
    {
        String[] fecha = s.split("/");
        this.dia = Integer.parseInt(fecha[0]);
        this.mes = Integer.parseInt(fecha[1]);
        this.annio = Integer.parseInt(fecha[2]);
    }
    */
    public Fecha(String s)
    {
        int pos1 = s.indexOf('/');
        int pos2 = s.lastIndexOf('/');

        String sDia = s.substring(0,pos1);
        dia = Integer.parseInt(sDia);

        String sMes = s.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);

        String sAnio = s.substring(pos2+1);
        annio = Integer.parseInt(sAnio);
    }

    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAnnio()
    {
        return annio;
    }
    public void setAnnio(int annio) 
    {
        this.annio = annio;
    }
    public void setMes(int mes) 
    {
        this.mes = mes;
    }
    public void setDia(int dia) 
    {
        this.dia = dia;
    }
    public String toString()
    {
        return "Fecha: " + dia + "/" + mes + "/" + annio;
    }
    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia == otra.dia) && (mes == otra.mes) && (annio == otra.annio);
    }
    public void addDias(int d)
    {
        int sum = fechaToDias() + d;
        diasToFecha(sum);
    }
    private int fechaToDias()
    {
        return(((annio)*(12*30))+((mes*30)+dia));   
    }
    private void diasToFecha(int i)
    {
        int e = (i / 360);
        int e2 = ((i-(e*360))/30);
        int e3 = (i-((e * 360)+(e2*30)));
        annio = e;
        mes = e2;
        dia = e3;
        if((mes + e2) > 12)
        {
            annio = annio + 1;
            mes = mes - 12;
        }
    }

}