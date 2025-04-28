public class contatoPessoal extends contato {
    private String aniversario;
    private String endereco;

    public contatoPessoal(String nome, String telefone, String email, String aniversario, String endereco) {
        super(nome, telefone, email);
        this.aniversario = aniversario;
        this.endereco = endereco;
    }
    // O @override é uma anotação que indica que o método está sobrescrevendo um método da classe pai
    // O método toString() é usado para retornar uma representação em string do objeto
    @Override
    public String toString() {
        return super.toString() + ", Aniversário: " + aniversario + ", Endereço: " + endereco;
    }
}
