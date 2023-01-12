import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
  public static void main(String[] args) {

    try (Scanner scn = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.print("Digite seu primeiro nome: ");
      String nome = scn.next();
      System.out.print("Digite seu ultimo nome: ");
      String sobrenome = scn.next();
      System.out.print("Digite sua idade: ");
      int idade = scn.nextInt();
      System.out.print("Digite sua altura em centímetros: ");
      Double altura = scn.nextDouble();
      System.out.println("Seu nome é: " + nome.concat(" ").concat(sobrenome));
      System.out.println("Sua idade é: " + String.valueOf(idade).concat(" anos"));
      System.out.println("Sua altura é: " + altura/100 + "m");
      System.out.println("Obrigado por participar da pesquisa!");
      scn.close();
    }
  }
}
