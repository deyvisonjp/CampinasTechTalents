import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Date data_nascimento;

    public Pessoa(String nome, String cpf, Date data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " - CPF: " + cpf +
                " - Data de nascimento=" + data_nascimento + " - ";
    }
}