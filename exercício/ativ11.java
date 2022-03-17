
/**
 * Escreva uma descrição da classe ativ11 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class ativ11
{
    public static void main(String args[])
    {
        Scanner num4 = new Scanner(System.in);
        int num, mil, cem, dez, um;
        
        System.out.print("Informe um número de quatro dígitos: ");
        num = num4.nextInt();
        mil = num/1000;
        cem = num/100%10;
        dez = num/10 - (mil*10 + cem)*10;
        um = num%10;
        
        System.out.println("Número ao contrário: " + um + dez + cem + mil);
    }
}
