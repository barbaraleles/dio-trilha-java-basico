import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nome;
        int numeroConta;
        String numeroAgencia;
        double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta");
        numeroConta = sc.nextInt();
        System.out.println("Digite o numero da sua agencia");
        numeroAgencia = sc.next();
        System.out.println("Digite o seu nome");
        nome = sc.next();
        sc.nextLine();
        System.out.println("Digite seu saldo");
        saldo = sc.nextDouble();

        sc.close();
        System.out.println("Olá "+nome +", obrigado por criar uma conta em nosso banco, sua agência é " +numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
