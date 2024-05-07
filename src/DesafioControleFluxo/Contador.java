package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero1 = 0, numero2 = 0;

    System.out.println("Informe o primeiro número: ");
    numero1 = scan.nextInt();
    System.out.println("Informe o segundo número: ");
    numero2 = scan.nextInt();

    try {
      contar(numero1, numero2);
    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro" + e);
    }
  }

  static void contar(int n1, int n2) throws ParametrosInvalidosException {
    if (n2 < n1)
      throw new ParametrosInvalidosException();
    int interacao = 0;
    for (int i = n1; i < n2; i++) {
      interacao++;
    }
    System.out.println("Quantidades de interações:" + interacao);
  }

}
