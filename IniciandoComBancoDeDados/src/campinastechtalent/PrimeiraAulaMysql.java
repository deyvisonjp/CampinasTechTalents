package campinastechtalent;

import java.sql.*;
import java.util.Scanner;

public class PrimeiraAulaMysql {
    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/ctt_assertiva", "root", "d2j6p8s1");
            System.out.println("Conectado!");

            Statement statement = conexao.createStatement();

            // CREATE
            statement.execute("INSERT INTO user (nome, data_nascimento, telefone)" +
                              "VALUE ('Teste', '2015-10-15', '95136547')");

            statement.executeQuery("SELECT * FROM user");
            ResultSet set = statement.getResultSet();
            while (set.next()) {
                System.out.printf("%d: %10s - %10s - %5s\n",
                        set.getInt("id"),
                        set.getString("nome"),
                        set.getDate("data_nascimento"),
                        set.getString("telefone")
                        );
            }

            // UPDATE
            System.out.print("Qual registro(id) voce deseja atualizar: ");
            int idAtualizar = Integer.parseInt(teclado.next());
            System.out.print("Qual o novo nome: ");
            String novoNome = teclado.next();


            statement.executeUpdate("UPDATE user set nome='" + novoNome +
                    "' WHERE id =  '" + idAtualizar + "'");
            //"update DemoTable set FirstName=? where Id=?

            // DELETE
            System.out.print("Qual registro voce deseja excluir: ");
            int idExcluir = Integer.parseInt(teclado.next());
            statement.executeUpdate("DELETE FROM user WHERE id = '" + idExcluir + "'");

            System.out.println("Após Remover o id " + idExcluir + " . . .");

            // SELECT APÓS DELETE
            statement.executeQuery("SELECT * FROM user");
            set = statement.getResultSet();
            while (set.next()) {
                System.out.printf("%d: %10s - %10s - %5s\n",
                        set.getInt("id"),
                        set.getString("nome"),
                        set.getDate("data_nascimento"),
                        set.getString("telefone")
                );
            }

            conexao.close();

        } catch (SQLException s) {
            System.out.println("Não foi possível conectar ao banco" + s);
        }
    }
}
