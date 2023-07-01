import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner lerValores = new Scanner(System.in);

        System.out.println("Digite o número da sua Conta..: ");
        contaTerminal.numero = lerValores.nextInt();

        System.out.println("Digite o numero da sua Agencia..: ");
        contaTerminal.agencia = lerValores.next();

        System.out.println("Nome do Cliente..: ");
        contaTerminal.nomeCliente = lerValores.next();

        System.out.print("Seja bem-vindo " + contaTerminal.nomeCliente
                + "obrigado por criar uma conta em nosso banco, sua agencia eh "
                + contaTerminal.agencia + ", conta " + numero);

        

}

}
