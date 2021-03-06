package test;

import campinastechtalent.Entity.Usuario;
import campinastechtalent.factory.ConnectionFactory;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.*;
import java.util.Calendar;

public class TestCrudUsuario {
    Usuario usuario = new Usuario();
    Connection connection;
    PreparedStatement preparedStatement;

    @Before
    public void setUsuario() throws Exception {
        connection = ConnectionFactory.createConnectionToMySQL();
        usuario.setId(10);
        usuario.setNome("Deyvison");
        usuario.setEmail("deyvison@email.com");
        usuario.setSenha("123456");
    }

    @Test
    @Ignore
    public void TestAtributos() {
        assertEquals("Deyvison", usuario.getNome());
        assertEquals("deyvison@email.com", usuario.getEmail());
        assertEquals("123456", usuario.getSenha());
    }

    @Test
    public void validaEmail() {
        boolean testeEmail = usuario.getEmail().indexOf ("@") >= 1;
        assertTrue("Email Inválido", testeEmail);
    }

    // Verifica se o email já existe para não permitir duplicidade
    public boolean emailExists(String email) throws SQLException {
        String sqlVerificaEmail = "SELECT email FROM usuario WHERE email =  '" + email + "';";
        ResultSet result;
        var retorno = false;

        preparedStatement = connection.prepareStatement(sqlVerificaEmail);
        result = preparedStatement.executeQuery();
        if (result.next()) {
               retorno = true;
        }
        return retorno;
    }

    @Test
    public void testSaveUsers() {
        boolean salvoComSucesso;
        try {

            String sqlInsert = "INSERT INTO usuario (nome, email, senha, data_de_cadastro) " +
                    "VALUES (?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(sqlInsert);

            Calendar calendar = Calendar.getInstance();
            java.sql.Date getData = new java.sql.Date(calendar.getTime().getTime());

            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setDate(4, getData);

            preparedStatement.executeUpdate();

            if(emailExists("deyvisoun@email.com")) {
                fail("Usuário já esta cadastrado no sistema!");
            }

            System.out.println("Usuário(a) " + usuario.getNome() + " criado(a) com sucesso");
            salvoComSucesso = true;

        } catch (Exception e) {
            e.printStackTrace();
            salvoComSucesso=false;
        }

        assertTrue("Erro ao salvar o novo usuario.", salvoComSucesso);
    }

    @Test
    public void listUsers() {
        String sqlSelect = "SELECT * FROM usuario;";
        ResultSet resultSet;

        try {

            preparedStatement = connection.prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();
            assertNotNull("Lista de usuarios recebida com sucesso", resultSet);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Verifica se id já existe
    public boolean idNotExist() throws SQLException {
        String sqlMaxID = "SELECT MAX(id) AS ULTIMOID FROM usuario";
        ResultSet resultMaxId;
        boolean retorno = false;

        preparedStatement = connection.prepareStatement(sqlMaxID);
        resultMaxId = preparedStatement.executeQuery();
        if (resultMaxId.next()) {
            int ultimo = resultMaxId.getInt("ULTIMOID");
            if (ultimo < usuario.getId()) {
                fail("Id inexistente");
                retorno = true;
            }
        }
        return retorno;
    }

    // Verifica se o nome existe não existe
    public boolean nomeNotExist() throws SQLException {

        String sqlPesqNome = "SELECT * FROM usuario WHERE nome LIKE '" + usuario.getNome() + "%';";;
        ResultSet resultNome;
        boolean retorno = false;

        preparedStatement = connection.prepareStatement(sqlPesqNome);
        resultNome = preparedStatement.executeQuery();
        if (!resultNome.next()) {
                fail("Nome não encontrado na base de dados");
                retorno = true;
            }
        return retorno;
    }

    @Test
    public void listUsersId() {
        String sqlSelect = "SELECT * FROM usuario WHERE id = " + usuario.getId() + ";";
        ResultSet resultSet;

        try {
            preparedStatement = connection.prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();
            if(idNotExist()) {
                assertTrue("Usuário [" + usuario.getId() + "] não encontrado!", resultSet.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listUsersNome() {
        String name ="Xuxa";
        String sqlSelect = "SELECT * FROM usuario WHERE nome LIKE '" + name + "%';";
        ResultSet resultSet;

        try {
            preparedStatement = connection.prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();
            if (!nomeNotExist()) {
                assertFalse("Usuário(a) [" + name + "] não encontrado(a)!", !resultSet.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void updateId() {
        String sqlUpdate = ("UPDATE usuario SET nome= '" + usuario.getNome() + "', email = '" + usuario.getEmail() + "' WHERE id =  " + usuario.getId() + ";");
        PreparedStatement preparedStatement;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = connection.prepareStatement(sqlUpdate);
            preparedStatement.executeUpdate();

            if(idNotExist()) {
                assertFalse("Usuário [" + usuario.getId() + "] não encontrado!", preparedStatement.getMoreResults());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteId() {
        String sqlUpdate = ("DELETE FROM usuario WHERE id = '" + usuario.getId() + "';");
        PreparedStatement preparedStatement;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = connection.prepareStatement(sqlUpdate);
            preparedStatement.executeUpdate();

            if(idNotExist()) {
                assertFalse("Usuário [" + usuario.getId() + "] não encontrado!", preparedStatement.getMoreResults());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
