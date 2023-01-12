package edu.luis.primeirasemana;
import java.time.LocalDate;

public class NomeIdade {

  /**
   * @param args
   */
  public static void main(String [] args) {
    final String nome = "Luís";
    LocalDate dataAtual = LocalDate.now();
    int nascimento = 2001;
    int anoAtual = dataAtual.getYear();
    System.out.println(nome + ", " + (anoAtual - nascimento) + " anos");
  }

}
