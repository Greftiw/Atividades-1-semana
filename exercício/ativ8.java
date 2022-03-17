
/**
 * Escreva uma descrição da classe ativ8 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class ativ8

{
    public static void main(String args[])
    {
        Scanner terreno = new Scanner(System.in);
        double compt, largt, compc, largc;
        System.out.print("Informe o comprimento do terreno: ");
        compt = terreno.nextDouble();
        System.out.print("Informe a largura do terreno: ");
        largt = terreno.nextDouble();
        System.out.print("Informe o comprimento da casa: ");
        compc = terreno.nextDouble();
        System.out.print("Informe a largura da casa: ");
        largc = terreno.nextDouble();
        System.out.println("Área livre: " + ((compt * largt) - (compc *largc)));
    }
}
