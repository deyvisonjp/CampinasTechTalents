import java.util.Date;

public class Aluno extends Pessoa{
    private String disciplina;

    public Aluno(String nome, String cpf, Date data_nascimento, String disciplina) {
        super(nome, cpf, data_nascimento);
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                ".:Aluno de:. " + disciplina;
    }
}
