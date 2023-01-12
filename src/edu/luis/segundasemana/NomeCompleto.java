package edu.luis.segundasemana;
public class NomeCompleto {

  /**
   * @param args
   */
  public static void main(String [] args) {
    String primeiroNome = "Luís";
    String segundoNome = "Trivinho";

    System.out.println(nomeCompleto(primeiroNome, segundoNome));
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome){
    return primeiroNome + " " + segundoNome;
  }

}
