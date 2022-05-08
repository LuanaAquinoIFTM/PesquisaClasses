import java.util.Scanner;

public class SqrtMath {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----Raiz quadrada do número-----");

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();
        
        System.out.println("A raiz quadrada do número é: " + Math.sqrt(num));
    }
    
}
