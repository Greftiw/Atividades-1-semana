
/**
 * Escreva uma descrição da classe ativ7 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
import java.lang.String;
public class ativ7
{
   public static void main(String args[])
   {
       Scanner valores = new Scanner(System.in);
       int valor1, valor2;
       System.out.print("Informe um número: ");
       valor1 = valores.nextInt();
       System.out.print("Informe outro número: ");
       valor2 = valores.nextInt();
       System.out.println("soma : " + (valor1 + valor2));
       System.out.println("diferença: " + (valor1 - valor2));
       System.out.println("média: " + (valor1 + valor2)/2);
       System.out.println("valor absoluto da diferença: " + Math.abs(valor1 - valor2));
       
   }
}
