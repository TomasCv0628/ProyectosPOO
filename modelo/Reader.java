package modelo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader 
{
    public String leerTxt(String direccion)
    {
        String texto = "";

        try 
        {
            BufferedReader txt = new BufferedReader(new FileReader(direccion));
            String cadena = "";
            String bfRead;
            while((bfRead = txt.readLine()) != null)
            {
                cadena = cadena + bfRead + "\n";
            }
            texto = cadena;
        } 
        catch (Exception e) 
        {
            System.err.println("No se encontro el archivo");
        }
        return texto;
    }    
}
