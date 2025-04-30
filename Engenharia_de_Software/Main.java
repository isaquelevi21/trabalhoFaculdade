public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Fone
        // e passando os parâmetros para o construtor
        Fone fone = new Fone(" 85 ", " 982018372 ", " Whatsapp ");
        // Criando um objeto da classe Pessoa
        // e passando os parâmetros para o construtor
        Pessoa pessoa = new Pessoa("Professor", "Alexandre", fone);
        // Acessando os métodos da classe Fone através do objeto pessoa
        System.out.println("\n\n\n");
        System.out.println("\nReferência direta do objeto fone: " + fone);
        System.out.println("\nReferência do objeto fone através do objeto pessoa: " + pessoa.getFone());

        // Let's show the number this phone through object pessoa
        System.out.println("\nNome da Pessoa: " + pessoa.getNome() + " " +pessoa.getSobrenome());
        System.out.println("\nNúmero do telefone da pessoa: " + pessoa.getFone().getNumero());
        }

}

/*
| +---------------+|      |                      |
|      Pessoa      |      |         Fone         |
|                  |      |                      |
| nome: João       |      | ddd: "11"            |
| sobrenome: Silva |      | numero: "91234-5678" |
| fone ----------+ |      | tipo: "Celular"      |
-------------------       -----------------------
*/