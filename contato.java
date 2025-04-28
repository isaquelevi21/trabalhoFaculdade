// Criação de uma classe contato com os atributos nome, telefone e email

public class contato {
    private String nome;
    private String telefone;
    private String email;
    public contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    /* o get ele um atributo provado e utiliza em outra classe através de método
    pois se na outra classe ele apenas chamasse o atributo , seria impossível 
    desta forma é como se ele armazenasse uma váriavel dentro de outra do tipo púlica */
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone; 
    }
    public String getEmail() { 
        return email; 
    }
    public String toString() {
         return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email; 
        }
}
