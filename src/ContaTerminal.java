import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Olá, qual seu nome completo?");
    String nome = scanner.nextLine();   

    System.out.println("Informe o número da sua agência.");
    String agencia = scanner.next();

    System.out.println("Informe o número da sua conta.");
    int conta = scanner.nextInt();

    System.out.println("Informe o valor que deseja depósitar?");
    Double saldo = scanner.nextDouble();

    System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo é " + saldo + ", já está disponível para saque");

  }
}