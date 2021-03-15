package campinastechtalent;

import java.util.Scanner;

public class CrudUser implements UserBancoDeDados{
    Scanner sc = new Scanner(System.in);
    User user = new User();

    @Override
    public String criar() {
        System.out.print("Digite seu nome: ");
        user.setNome(sc.next());

        System.out.print("Digite a data de nascimento (AAAA-MM-DD): ");
        user.setData_nascimento(sc.next());

        System.out.print("Digite o seu telefone (99999999): ");
        user.setTelefone(sc.next());

        //Criando um novo user com scanner
        String insert = "INSERT INTO user (nome, data_nascimento, telefone) " +
                "VALUE('" + user.getNome() + "', '"
                + user.getData_nascimento() + "', '"
                + user.getTelefone() + "');";

        return insert;
    }

    @Override
    public void atualizar() {

    }

    @Override
    public void deletar() {

    }

    @Override
    public void visualizar() {

    }
}
