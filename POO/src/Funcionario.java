import java.util.Date;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String nome, String cpf, Date data_nascimento, double salario, String cargo) {
        super(nome, cpf, data_nascimento);
        this.salario = salario;
        this.cargo = cargo;
    }

    public String toString() {
        return super.toString() + "\n" +
                ".:Funcionário: Cargo: " + cargo +
                " Com salário: R$ " + salario;
    }

}
