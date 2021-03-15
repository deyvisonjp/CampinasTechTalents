package campinastechtalent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) throws SQLException {

        CrudUser crudUser = new CrudUser();
        Scanner teclado = new Scanner(System.in);

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/ctt_assertiva", "root", "d2j6p8s1");
            System.out.println("Conectado!");

            Statement statement = conexao.createStatement();

            // Cria um novo usuário
            String salvar = crudUser.criar();
            statement.execute(salvar);

            // Atualizar

            conexao.close();
        } catch (SQLException s) {
            System.out.println("Não foi possível conectar ao banco" + s);
        }
    }
}