import java.util.Scanner;

class Ano {
  private int ano;

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}

public class Bissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ano ano = new Ano();
        System.out.print("Digite um ano: ");
        ano.setAno(scanner.nextInt());

        if (ano.getAno() < 0) {
            System.out.println(ano.getAno() + " não é um ano válido.");
        } else if (ano.getAno() % 4 == 0 && (ano.getAno() % 100 != 0 || ano.getAno() % 400 == 0)) {
            System.out.println(ano.getAno() + " é bissexto.");
        } else {
            System.out.println(ano.getAno() + " não é bissexto.");
        }

        scanner.close();
    }
}
