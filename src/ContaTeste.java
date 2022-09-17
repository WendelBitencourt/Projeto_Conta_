import java.util.Scanner;

public class ContaTeste {
    public static Conta cc = new Conta();





    public static void main(String[] args) {
        int opt;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1-Cadastar");
            System.out.println("2-Consultar");
            System.out.println("3-Sacar");
            System.out.println("4-Depositar");
            System.out.println("9-Sair/finalizar");
            System.out.println("Selecione uma da opcoes: ");
            opt = Integer.parseInt(sc.nextLine());

            switch (opt) {
                case 1 -> execCadastrar();
                case 2 -> execConsultar();
                case 3 -> execSacar();
                case 4 -> execDepositar();
                case 9 -> System.out.println("Processo finalizado");
            }

        }while(opt !=9);

    }

    private static void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo da conta (poupanca ou corrente)");
        cc.setConta(sc.nextLine());

        System.out.println("Digite o nome da agencia: ");
        cc.setAgencia(sc.nextLine());

        System.out.println("Digite o seu nome");
        cc.setNomeCliente(sc.nextLine());

        System.out.println("Digite o saldo: ");
        cc.setSaldo(sc.nextDouble());
    }

    private static void execConsultar() {
        cc.imprimir();

    }

    private static void execSacar() {
            double valor;
            int valretorno;
            Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar:");
        valor = Float.parseFloat(scan.nextLine());

        valretorno =cc.sacar(valor);

        if (valretorno==1){
            System.out.println("Saque autorizado");
        }
        else {
            System.out.println("Saque nao autorizado");
        }
    }

    private static void execDepositar() {
        double valor;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        valor = Float.parseFloat(scan.nextLine());
        cc.depositar(valor);

    }
}