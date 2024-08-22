import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência com o traço");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta");
        Integer conta = scanner.nextInt();
        System.out.println("Informe seu nome");
        String nome = scanner2.nextLine();
        System.out.println("Insira o valor do saque");
        Float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia +", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
