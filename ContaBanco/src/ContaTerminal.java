import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        agencia=scanner.next();

        System.out.println("Por favor, digite o numero da sua Conta");
        numero=scanner.nextInt();

        System.out.println("Por favor digite o saldo inicial da conta");
        saldo = scanner.nextDouble();

       System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }   
}
