package campinastechtalent;

import campinastechtalent.dao.UsuarioDAO;

import java.util.Scanner;

public class Main {
    static UsuarioDAO usuarioDAO = new UsuarioDAO();

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
       String opcaoEscolhida = escolhaMenu();

       while (!opcaoEscolhida.equals("X")) {
           switch (opcaoEscolhida) {
               case "1":
                   usuarioDAO.save();
                   break;
               case "2":
                   usuarioDAO.getUsuarios();
                   break;
               case "3":
                   usuarioDAO.getUsuarioId();
                   break;
               case "4":
                   usuarioDAO.getUsuarioNome();
                   break;
               case "5":
                   usuarioDAO.update();
                   break;
               case "6":
                   usuarioDAO.delete();
                   break;
               default:
                   System.out.println("Opção inválida.");
                   break;
           }
           opcaoEscolhida = escolhaMenu();
       }
        System.out.println("Volte sempre!");
        teclado.nextLine();
    }

    private static String escolhaMenu() {
        System.out.println();
        System.out.println("=========== Desafio Final CTT =========== \n" +
                "Registro de usuários - Escolha uma opção:");
        System.out.println("1. Cadastrar novo usuário");
        System.out.println("2. Listar usuários");
        System.out.println("3. Buscar usuário por id");
        System.out.println("4. Buscar usuário por nome");
        System.out.println("5. Alterar um cadastro");
        System.out.println("6. Excluir um cadastro");
        System.out.println("X. Sair do Sistema");

       String opcaoEscolhida = teclado.nextLine().toUpperCase();
       System.out.println();

       return opcaoEscolhida;

    }

}
