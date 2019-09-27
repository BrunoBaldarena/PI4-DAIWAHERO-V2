/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi4.daiwahero.DAO;

import br.com.senac.pi4.daiwahero.Model.Pessoa;
import br.com.senac.pi4.daiwahero.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Deyvid
 */
public class ClienteDAO {
    
    //Chama a conexao com o banco de dados 
    Connection connection = ConnectionUtils.getConnection();
    
    //Método que insere categoria no banco de dados
    public void inserir(Pessoa pessoa) {

        try {

            String SQL = "INSERT INTO CLIENTE (NOME, CPF, SEXO, TELEFONE, EMAIL, SENHA ) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, pessoa.getNome());
            ps.setString(2,pessoa.getCpf());
            ps.setString(3,pessoa.getGenero());
            ps.setInt(4,pessoa.getTelefone());
            ps.setString(5,pessoa.getEmail());
            ps.setString(6,pessoa.getSenha());

            ps.execute();
            ps.close();
            connection.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    //Metodo que busca todos os dados da categoria e adiciona em uma lista
    public ArrayList<Pessoa> listarTudo() {
        String SQL = "SELECT * FROM CLIENTE WHERE TG_STATUS=0";
        ArrayList<Pessoa> lista = new ArrayList<>();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("PK_CLIENTE"));
                pessoa.setNome(rs.getString("NOME"));
                pessoa.setCpf(rs.getString("CPF"));
                pessoa.setGenero(rs.getString("SEXO"));
                pessoa.setTelefone(rs.getInt("TELEFONE"));
                pessoa.setEmail(rs.getString("EMAIL"));
                pessoa.setSenha(rs.getString("SENHA"));
                lista.add(pessoa);

            }
            st.close();
            connection.close();
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
    
     //Metodo que busca por categoria atraves do ID
    public ArrayList<Pessoa> listarID(int id) {
        String SQL = "SELECT * FROM CLIENTE WHERE PK_CLIENTE = " + id + " AND TG_STATUS=0";
        ArrayList<Pessoa> lista = new ArrayList<>();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("PK_CLIENTE"));
                pessoa.setNome(rs.getString("NOME"));
                pessoa.setCpf(rs.getString("CPF"));
                pessoa.setGenero(rs.getString("SEXO"));
                pessoa.setTelefone(rs.getInt("TELEFONE"));
                pessoa.setEmail(rs.getString("EMAIL"));
                pessoa.setSenha(rs.getString("SENHA"));
                lista.add(pessoa);

            }
            st.close();
            connection.close();
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
    
// Metodo para editar pessoa
    public void Editar(Pessoa pessoa) {

        try {

            String SQL = "UPDATE CLIENTE SET NOME=? WHERE PK_CLIENTE=?";

            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, pessoa.getNome());
            ps.setString(2,pessoa.getCpf());
            ps.setString(3,pessoa.getGenero());
            ps.setInt(4,pessoa.getTelefone());
            ps.setString(5,pessoa.getEmail());
            ps.setString(6,pessoa.getSenha());

            ps.execute();
            ps.close();
            connection.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    // Metodo que seta 0 para TG_STATUS inativando logicamente o elemento
    public void inativar(Pessoa pessoa)
            throws SQLException, Exception {
        try {
            String sql = "UPDATE CLIENTE SET TG_STATUS =1 WHERE PK_CLIENTE = ?";

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, pessoa.getId());

            pst.execute();
            pst.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

