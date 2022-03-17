
/**
 * Escreva uma descrição da classe ativ10 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class ativ10
{
   public static void main(String args[])
   {
       int tempo, resto, resto2, resto3, inteiro;
       Scanner segs = new Scanner(System.in);
       
       System.out.print("Informe a quantidade de segundos: ");
       tempo = segs.nextInt();
       inteiro = tempo/3600;
       resto = tempo%3600;
       resto2 = resto/60;
       resto3 = resto%60;
       System.out.println("Tempo em horas: " + inteiro + "h" + resto2 + "min" + resto3 + "seg");
   }
}
