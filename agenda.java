import java.util.ArrayList;

public class agenda {
    private ArrayList<contato> contatos = new ArrayList<>();// ArrayList para armazenar os contatos
    // Método para adicionar um contato à agenda

    public void adicionarContato(contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public ArrayList<contato> buscarContato(String termo) {
        ArrayList<contato> resultados = new ArrayList<>();
        for (contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(termo) ||
                c.getTelefone().equalsIgnoreCase(termo) ||
                c.getEmail().equalsIgnoreCase(termo)) {
                resultados.add(c);
            }
        }
        return resultados;
    }

    public void listarContatos() {
        for (contato c : contatos) {
            System.out.println(c);
        }
    }
}
