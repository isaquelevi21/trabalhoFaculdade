public class Fone {
    private String ddd;
    private String numero;
    private String tipo;
    /// Construtor da classe Fone
    public Fone(String ddd, String numero, String tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
}
