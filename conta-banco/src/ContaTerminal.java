import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem vindo(a), favor inserir as informações desejadas abaixo.");

        System.out.print("\nNúmero da agência: "); String agencia = scanner.nextLine();
        System.out.print("\nSeu nome: "); String nomeCliente = scanner.nextLine();
        System.out.print("\nO Número da sua conta: "); int conta = scanner.nextInt();
        System.out.print("\nO Seu saldo: "); double saldo = scanner.nextDouble();

        scanner.close();

        System.out.print("Olá "+nomeCliente+"!"+
        "\nSegue as informações de sua conta bancaria abaixo!\n");

        System.out.print(
        "Agência: "+agencia+
        "\nNúmero da Conta: "+conta+
        "\nSeu Saldo: "+saldo
        );
        
    }
}
