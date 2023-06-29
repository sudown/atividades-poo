import java.util.Random;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        int numero = 0;
        int quantidadePares = 0;
        int menorNumero = 0;
        
        System.out.println("Digite três números: ");
        for (int i = 0; i < 3; i++) {
          System.out.println("digite o " + (i + 1) + "º número: ");
            numero = input.nextInt();
            if (numero % 2 == 0) {
                quantidadePares++;
            }
            
            if (i == 0) {
                menorNumero = numero;
            }
            else if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        int numeroAleatorio = aleatorio.nextInt(11);

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Menor número: " + menorNumero);
        
        if (numeroAleatorio == 0) {
            System.out.println("O menor número(" + menorNumero + ") não é divisível por " + numeroAleatorio);
        }
        else if (menorNumero % numeroAleatorio == 0) {
            System.out.println("O menor número(" + menorNumero + ") é divisível por " + numeroAleatorio);
        }
        else {
            System.out.println("O menor número(" + menorNumero + ") não é divisível por " + numeroAleatorio);
        }

        input.close();        
    }
}
