package campinastechtalent.dao;

// Por estarmos usando a esturutura de Orientação a Objetos com um banco de dados relacional,
// usarei a camada DAO (Objeto de aAceeso a Dados) para a melhor utilização da regra do negócio

import campinastechtalent.Entity.Usuario;
import campinastechtalent.Interfaces.UsuarioInterface;
import campinastechtalent.factory.ConnectionFactory;

import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class UsuarioDAO implements UsuarioInterface {
    // CRUD (CREATE - READ - UPDATE - DELETE)
    Scanner teclado = new Scanner(System.in);
    Usuario usuario = new Usuario();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    // CREATE - SAVE
    @Override
    public void save () {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();

            String sqlInsert = "INSERT INTO usuario (nome, email, senha, data_de_cadastro) " +
                    "VALUES (?, ?, ?, ?)";

            preparedStatement = (PreparedStatement) connection.prepareStatement(sqlInsert);

            System.out.print("Qual o novo nome: ");
            usuario.setNome(teclado.next());
            System.out.print("Qual o novo e-mail: ");
            usuario.setEmail(teclado.next());
            System.out.print("Crie uma senha: ");
            usuario.setSenha(teclado.next());

            /*
            Calendar dataCriacao = Calendar.getInstance();
            String data = dataCriacao.get(Calendar.YEAR) + "-"
                    + (dataCriacao.get(Calendar.MONTH) + 1)
                    + "-" + dataCriacao.get(Calendar.DAY_OF_MONTH);
            */

            Calendar calendar = Calendar.getInstance();
            java.sql.Date getData = new java.sql.Date(calendar.getTime().getTime());


            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setDate(4, getData);
            //preparedStatement.setString(4, String.valueOf(data));

            preparedStatement.executeUpdate();

            System.out.println("Usuário(a) " + usuario.getNome() + " criado(a) com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    //READ - LIST USUARIOS
    public void getUsuarios() {

        //List<Usuario> usuarios = new ArrayList<Usuario>();

        String sqlSelect = "SELECT * FROM usuario;";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null; // Resultado da busca no banco

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                //Usuario usuario = new Usuario();
                System.out.printf("%d: %10s - %15s - %10s\n",
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("email"),
                        sdf.format(resultSet.getDate("data_de_cadastro"))
                );

                /*
                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setDataDeCadastro(resultSet.getString("data_de_cadastro"));
                */


                //usuarios.add(usuario);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //return usuarios;

    }

    @Override
    //READ - FOR ID
    public void getUsuarioId() {

        System.out.print("Qual usuário(id) deseja buscar:");
        int id = Integer.parseInt(teclado.next());

        String sqlSelect = "SELECT * FROM usuario WHERE id = " + id + ";";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.printf("%d: %10s - %15s - %10s\n",
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("email"),
                        sdf.format(resultSet.getDate("data_de_cadastro"))
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    //UPDATE
    public void update() {

        System.out.print("Qual registro(id) voce deseja atualizar: ");
        int id = Integer.parseInt(teclado.next());

        System.out.print("Qual o novo nome: ");
        usuario.setNome(teclado.next());
        System.out.print("Qual o novo e-mail: ");
        usuario.setEmail(teclado.next());

        String sqlUpdate = ("UPDATE usuario SET nome= '" + usuario.getNome() + "', email = '" + usuario.getEmail() + "' WHERE id =  " + id + ";");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sqlUpdate);
            preparedStatement.executeUpdate();

            System.out.println("Usuário [" + id + "] atualizado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    // DELETE
    public void delete() {

        System.out.print("Qual usuário deseja excluir(id)");
        int id = Integer.parseInt(teclado.next());

        String sqlUpdate = ("DELETE FROM usuario WHERE id = '" + id + "';");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sqlUpdate);
            System.out.println("Usuário [" + id + "] deletado com sucesso!");
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
