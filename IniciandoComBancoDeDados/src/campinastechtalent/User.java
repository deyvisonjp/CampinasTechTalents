package campinastechtalent;

import java.util.Calendar;

public class User {
    private String nome;
    private String data_nascimento;
    private String telefone;

    public User() {
    }

    public User(String nome, String data_nascimento, String telefone) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
