
//**
// * Escreva uma descrição da classe ativ5 aqui.
// * 
/// * @author (seu nome) 
 //* @version (um número da versão ou uma data)
import java.util.Scanner;
public class ativ5
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        int num1;
        
        System.out.print("Digite um número: ");
        num1 = num.nextInt();
        System.out.println("Número original: " + num1);
        System.out.println("Potências: " + Math.pow(num1,2)+ ", " + Math.pow(num1,3)+ ", " + Math.pow(num1,4));
    }
}
