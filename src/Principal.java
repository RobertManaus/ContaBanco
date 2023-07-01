import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner lerValores = new Scanner(System.in);

        System.out.print("Digite o número da sua Conta..: ");
        contaTerminal.numero = lerValores.nextInt();

        System.out.print("Digite o numero da sua Agencia..: ");
        contaTerminal.agencia = lerValores.next();

        System.out.print("Nome do Cliente..: ");
        contaTerminal.nomeCliente = lerValores.next();

        System.out.print("Seja bem-vindo " + contaTerminal.nomeCliente
                + "\nObrigado por criar uma conta em nosso banco \nsua agencia e "
                + contaTerminal.agencia + "\nconta " + contaTerminal.numero);

        

}

}
