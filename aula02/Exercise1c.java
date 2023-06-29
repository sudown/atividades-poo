public class Exercise1c {
  public static void main(String[] args) {
    int x = 5;
    while (x > 1) {
      x = x - 1;
      if (x < 3) {
        System.out.println("small x");
      }
    }
  }
}

/*
 * Este código não compilou inicialmente porque estava faltando o método main.
 * Para que o código seja compilado com sucesso, é necessário incluir o método
 * main, que é o ponto de entrada para a execução do programa
 */