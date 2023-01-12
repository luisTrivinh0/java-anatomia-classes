public class BancoTerminal {

  /**
   * @param args
   */
  public static void main(String [] args) {
    double saldo = 25;
    double valorSolicitado = 29;
    if(valorSolicitado > saldo)
      System.err.println("ERRO! Seu saldo é menor que R$ " + valorSolicitado);
    else
      System.out.println("SUCESSO! Seu novo saldo é de R$ " + (saldo - valorSolicitado));
  }
}
