public class PesquisaClasse {

  /**
   * @param args
   */
  public static void main(String [] args) {
    String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("Seu nome é: " + nome.concat(" ").concat(sobrenome));
    System.out.println("Sua idade é: " + String.valueOf(idade).concat(" anos"));
    System.out.println("Sua altura é: " + String.valueOf(altura / 100).concat("m"));
    System.out.println("Obrigado por participar da pesquisa!");
  }
}
