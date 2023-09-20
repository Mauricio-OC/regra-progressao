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
    int quantidadeAtividades = scanner.nextInt();
    scanner.nextLine();

    String[] nomesAtividades = new String[quantidadeAtividades];
    double[] pesosAtividades = new double[quantidadeAtividades];
    double[] notasAtividades = new double[quantidadeAtividades];

    double somaPesos = 0;

    for (int i = 0; i < quantidadeAtividades; i++) {
      System.out.print("Digite o nome da atividade " + (i + 1) + ": ");
      nomesAtividades[i] = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + (i + 1) + ": ");
      pesosAtividades[i] = scanner.nextDouble();
      somaPesos += pesosAtividades[i];

      scanner.nextLine();

      System.out.print("Digite a nota obtida para " + nomesAtividades[i] + ": ");
      notasAtividades[i] = scanner.nextDouble();

      scanner.nextLine();
    }

    if (somaPesos != 100) {
      System.out.println("A soma dos pesos das atividades não é igual a 100%. Por favor, corrija.");
      return;
    }

    double notaFinal = calcularNotaFinal(pesosAtividades, notasAtividades);

    System.out.println("Sua nota final é: " + notaFinal);

    if (notaFinal >= 85) {
      System.out.println("Parabéns! Você alcançou " + notaFinal + ".0%! Temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste período, " + notaFinal + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }

    scanner.close();
  }

  public static double calcularNotaFinal(double[] pesosAtividades, double[] notasAtividades) {
    double somaNotas = 0;

    for (int i = 0; i < pesosAtividades.length; i++) {
      somaNotas += (notasAtividades[i] * (pesosAtividades[i] / 100));
    }

    return somaNotas;
  }
}
