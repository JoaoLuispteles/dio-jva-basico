import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Por favor, digite o número da Conta! ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência! ");
        int agencia = scanner.nextInt();
        String agenciaString = Integer.toString(agencia);

        System.out.println("Por favor, digite o seu Nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite a quantia que deseja sacar! ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua Agência é: " + agenciaString + ", Conta: " + conta + " e seu Saldo: " + saldo + " já está disponível para saque.");

        
        scanner.close();
    }
}
