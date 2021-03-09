package ExercicioAutenticar;

public class Loja {
    public static void main(String[]args) {
        Gerente g1 = new Gerente();
        g1.setSenha(905);

        g1.setNome("Deyvison");
        g1.setCpf("548.957.528-85");
        g1.setSalario(15000.00);

        System.out.println("********* LOGIN *********");
        if (g1.autentica(905)) {
            System.out.println("Bem vindo " + g1.getNome() + " 👍 \n" +
                    g1.getCpf() + " - Vencimentos: R$ " + String.format("%.02f", g1.getSalario()));
        } else {
            System.out.println("Sua senha está incorreta! 😒");
        }

    }
}
