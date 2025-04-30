public class Pessoa {
    private String nome;
    private String sobrenome;
    private Fone fone;

    public Pessoa(String nome, String sobrenome, Fone fone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.fone = fone;
    }

    public Fone getFone() {
        return fone;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
}
