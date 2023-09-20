package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int quantidade = Integer.parseInt(scanner.nextLine());

    int peso = 0;
    int nota = 0;

    for (int i = 1; i <= quantidade; i++) {
      System.out.print("Digite o nome da atividade " + i + ": ");
      String nomeDaAtividade = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + i + ": ");
      int pesoDaAtividade = Integer.parseInt(scanner.nextLine());
      peso += pesoDaAtividade;

      System.out.print("Digite a nota obtida para " + nomeDaAtividade + ": ");
      int notaAtividade = Integer.parseInt(scanner.nextLine());

      nota += (pesoDaAtividade * notaAtividade);
    }

    int resultado = nota / peso;

    if (resultado >= 85) {
      System.out.println("Parabéns! Você alcançou " + resultado
          + ".0%! Temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + resultado
              + ".0%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }

    scanner.close();
  }
}
