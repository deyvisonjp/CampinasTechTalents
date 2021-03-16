package campinastechtalent.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "suaSenha";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/ctt_desafio_final";

    public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException {
        // Cria a conexão com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    // Criei um teste para verificar se existe uma conexão ativa
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Recuperar uma conexão com o banco de dados
        Connection con = createConnectionToMySQL();

        // Testa se a conexão é nula
        if (con != null) {
            System.out.println("Conexão obtida com sucesso!");
            con.close();
        }
    }
}
