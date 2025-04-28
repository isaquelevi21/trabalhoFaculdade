import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        agenda agenda = new agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;
//* 1 - Adicionar Contato
//* 2 - Remover Contato
//* 3 - Buscar Contato
//* 4 - Listar Contatos
//* 0 - Sair
        do {
            System.out.println("\n1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Tipo (1 - Profissional, 2 - Pessoal): ");
                    int tipo = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Empresa: ");
                        String empresa = scanner.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = scanner.nextLine();
                        agenda.adicionarContato(new contatoProfissional(nome, telefone, email, empresa, cargo));
                    } else {
                        System.out.print("Aniversário: ");
                        String aniversario = scanner.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = scanner.nextLine();
                        agenda.adicionarContato(new contatoPessoal(nome, telefone, email, aniversario, endereco));
                    }
                    break;

                case 2:
                    System.out.print("Nome do contato para remover: ");
                    agenda.removerContato(scanner.nextLine());
                    break;

                case 3:
                    System.out.print("Termo de busca (nome, telefone ou email): ");
                    var encontrados = agenda.buscarContato(scanner.nextLine());
                    for (contato c : encontrados) System.out.println(c);
                    break;

                case 4:
                    agenda.listarContatos();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
