import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("0000-0", "444-3", 1000.0);

        System.out.println("Seja bem-vindo ao Banco Maut");
        System.out.println("Menu:\n1-Cadastrar cliente\n2-Ver saldo\n3-Depositar\n4-Sacar\n5-Transferir\n6-Ver extrato");
        System.out.println("Qual opção você deseja?");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if(opcao == 1){
            
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String CPF = scanner.nextLine();

        System.out.println("Digite o data de nascimento do cliente:");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite a rua do endereço:");
        String rua = scanner.nextLine();

        System.out.println("Digite o bairro do endereço:");
        String bairro = scanner.nextLine();

        System.out.println("Digite o cep do endereço:");
        String cep = scanner.nextLine();

        System.out.println("Digite a cidade do endereço:");
        String cidade = scanner.nextLine();

        System.out.println("Digite o estado do endereço:");
        String estado = scanner.nextLine();

        Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep);

        Conta.cadastrarCliente(nome, dataNascimento, CPF, endereco, conta);
         
        }
        else if(opcao ==2){
            double novoSaldo = conta.getSaldo();
            System.out.println(novoSaldo);
        }
        else if(opcao ==3){
            Transacoes transacao = new Transacoes("deposito", "03/10", "deposito");

            System.out.println("Informe o valor: ");
            double valor = scanner.nextDouble();
            transacao.deposito(valor, conta);
            System.out.println("déposito realizado com sucesso");

        }
        if(opcao ==4){

            // Conta conta = new Conta("0000-0", "444-3", 1000.0);
            Transacoes transacao = new Transacoes("saque", "03/10", "sacar");

            System.out.println("Informe o valor");
            double valor = scanner.nextDouble();
            if(valor <= conta.getSaldo()){

                transacao.sacar(valor, conta);

                System.out.println("saque realizado com sucesso");
                
            }else{
                System.out.println("não é possível realizar o saque verifique o saldo da Conta");
            }
        
        }
        else if(opcao == 5){
            
            Transacoes transacao = new Transacoes("transferencia", "03/10", "transação de dinheiro para outra conta");
            System.out.println("Informe o valor");
            double valor = scanner.nextDouble();

            System.out.println("Informe o nome do destino");
            String nomeDestinatario = scanner.nextLine();
            
            System.out.println("Informe o numero da conta de destino");
            String contaDestinatario = scanner.nextLine();

            
            
            if(valor <= conta.getSaldo()){

                transacao.transferir(valor,conta);

                System.out.println("Transeferência realizada com suesso" + valor + "para " + nomeDestinatario + "numero da conta: " + contaDestinatario);
            }else{
                System.out.println("Não foi possível realizar essa transferencia");
            }

            
            
        }
        else if(opcao == 6){

        }
        
        else{
            System.out.println("Opção inválida");
        }
    

        

        scanner.close();
        

    }
}
