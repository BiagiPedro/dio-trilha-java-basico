import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, digite o numero");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o nome gencia");
        agencia = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite o nome do cliente");
        nomeCliente= sc.nextLine();
        sc.nextLine();
        System.out.println("Agora digite o valor que o cliente posssui");
        saldo = sc.nextFloat();
        sc.nextLine();

        System.out.println("Olá"+nomeCliente+"Obrigado por criar uma conta em nosso banco , " +
                "sua agencia é"+agencia+", conta "+numero+", e seu saldo"+saldo+"ja esta disponivel para saque");


    }
}
