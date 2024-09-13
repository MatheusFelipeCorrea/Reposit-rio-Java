import java.util.Scanner;
// Método para calcular o fatorial de um número
public class Factorial {
  public static int fat(int n1) {
    if (n1 == 0 || n1== 1){
      return 1;
    } else {
      return n1 * fat(n1-1);
    }
  }
}
// Método para calcular o arranjo de um número
public class Arrangement {
  public static int arranj (int n1,int p) {
    return Factorial.fat(n1)/ Factorial.fat(n1-p);
  }
}



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //solicita o n
   System.out.println("Digite o valor de n:");
          int n = scanner.nextInt();
//solicita o p
          System.out.println("Digite o valor de p:");
          int p = scanner.nextInt();
//faz os calculos
          int resultfat = Factorial.fat(n);
          int resultarranj = Arrangement.arranj(n, p);
//imprime resultados
          System.out.println("O valor do fatorial de n é: " + resultfat);
          System.out.println("O valor do arranjo simples de n e p é: " + resultarranj);

          scanner.close();
      }
  }