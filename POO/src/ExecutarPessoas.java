import java.util.Date;

public class ExecutarPessoas {
    public static void main(String[]args) {
        System.out.println(":.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.::.:.:");
        Aluno a1 = new Aluno("Deyvison", "012654951-85", new Date(), "Biologia");
        System.out.println(a1.toString());

        System.out.println("----------------------------------------------------------------------------");

        Funcionario func1 = new Funcionario("Pietro", "569658958-52", new Date(), 2200.00, "Analista");
        System.out.println(func1.toString());

        System.out.println("----------------------------------------------------------------------------");

        Professor professor1 = new Professor("Donatello", "564859987-52", new Date(), 2800.00, "Geografia");
        System.out.println(professor1.toString());

    }
}
