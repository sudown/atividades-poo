public class Exercise1b {
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
 * Este código não compilou inicialmente devido à falta de atribuição a uma
 * classe. Para corrigir esse problema, é necessário adicionar a declaração de
 * classe e o método main
 */