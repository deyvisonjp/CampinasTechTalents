package test;

import campinastechtalent.factory.ConnectionFactory;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoTesteMySql {

    Connection connection;

    @Test
    public void testeConexao() throws SQLException, ClassNotFoundException {
        connection = ConnectionFactory.createConnectionToMySQL();
        if(connection!=null){
            System.out.println("Conexão realizada com sucesso!");
            System.out.println(connection);
        } else {
            Assert.assertNotNull("Conexão inválida", connection);
        }

    }

}
