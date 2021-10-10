package stream;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;

    private String email;

    private String senha;

    private List<Mensalidade> mensalidade = new ArrayList<Mensalidade>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Mensalidade> getMensalidade() {
        return mensalidade;
    }

    public void addMensalidade(Mensalidade mensalidade) {
        this.mensalidade.add(mensalidade);
    }
}
