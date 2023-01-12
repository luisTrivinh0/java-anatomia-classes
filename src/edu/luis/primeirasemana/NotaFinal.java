package edu.luis.primeirasemana;
public class NotaFinal {

  /**
   * @param args
   */
  public static void main(String [] args) {
    int mediaFinal = 6;

    if (mediaFinal < 6)
      System.out.println("Reprovado!");
    else if(mediaFinal == 6)
      System.out.println("Prova Final!");
    else
      System.out.println("Aprovado!");
  }
}
