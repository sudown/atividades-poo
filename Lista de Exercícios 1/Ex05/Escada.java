import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus da escada invertida: ");
        int quantidadeDegraus = scanner.nextInt();

        for (int i = 1; i <= quantidadeDegraus; i++) {
            for (int j = quantidadeDegraus; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
