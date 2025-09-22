package Amigos;

import javax.swing.JOptionPane;

public class NumAmigo 
{
    public static void main(String[] args) 
    {
        // Variables

        int n;
        int a;
        int s;

        // Input

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        s = 0;
        // Processing

        for (int i = 1 ; i < n ; i++)
        {
            if (n % i == 0)
            {
                s = s + i;
            }

        }

            if (s == a)
            {
                s = 0;
                for (int i = 1 ; i < a ; i++)
                {
                    if (a % i == 0)
                    {
                        s = s + i;
                    }
                }
            
                if (s == n)
                {
                    JOptionPane.showMessageDialog(null, "Son amigos");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No son amigos"); 
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No son amigos"); 
            }
            System.exit(0);
            

    }
}
