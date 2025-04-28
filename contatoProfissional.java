public class contatoProfissional extends contato {
    private String empresa;
    private String cargo;

    public contatoProfissional(String nome, String telefone, String email, String empresa, String cargo) {
        super(nome, telefone, email);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Empresa: " + empresa + ", Cargo: " + cargo;
    }
}
