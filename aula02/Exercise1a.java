public class Exercise1a {
  public static void main(String[] args) {
    int x = 1;
    while (x < 10) {
      x = x + 1;
      if (x > 3) {
        System.out.println("big x");
      }
    }
  }
}

/*
 * O código compilou com sucesso, mas não houve nenhuma exibição de resultado
 * devido à condição do while não ter sido satisfeita. A condição do while
 * requer que o valor de x seja menor que 10, mas atualmente o valor de x é 1.
 * Para obter a exibição desejada, é necessário modificar o valor de x na linha
 * 3, adicionando 1 ao seu valor atual através da expressão x = x + 1. Ao fazer
 * essa alteração, o código exibirá corretamente o resultado solicitado
 */