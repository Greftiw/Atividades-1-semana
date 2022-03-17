
/**
 * Escreva uma descrição da classe ativ14 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class ativ14
{
    public static void main(String args[])
    {
        Scanner ano = new Scanner(System.in);
        int y, a, b, c, d, e, g, h, j, k, m, r, n, p;
        
        System.out.print("Informe um ano: ");
        
        y = ano.nextInt();
        a = y%19;
        b = y/100;
        c = y%100;
        d = b/4;
        e = b%4;
        g = (8 * b + 13)/25;
        h = (19 * a + b - d - g + 15)%30;
        j = c/4;
        k = c%4;
        m = (a + 11 * h)/319;
        r = (2 * e + 2 * j - k - h + m + 32)%7;
        n = (h - m + r + 90)/25;
        p = (h - m + r + n + 19)%32;
        
        System.out.println("A Páscoa desse ano será em: " + p + "/" + n);
    }
}
