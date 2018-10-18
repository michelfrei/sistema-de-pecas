
package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Model.ClienteModel;

/**
 *
 * @author Michel
 */
public class ClienteDAO {
    
    public void InserirNovoProduto(ClienteModel cli) {
        String SQL = "INSERT INTO cliente (id, nome_razao, cpf_cnpj, rg, endereco, numero, complemento, bairro, cidade, estado, cep, telefone, telefone2, email, vencimento, debito, ativo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);

            stmt.setInt(1, 0);
            stmt.setString(2, cli.getNomeRazao());
            stmt.setString(3, cli.getCPF_CNPJ());
            stmt.setString(4, cli.getRG());
            stmt.setString(5, cli.getEndereco());
            stmt.setInt(6, cli.getNumero());
            stmt.setString(7, cli.getComplemento());
            stmt.setString(8, cli.getBairro());
            stmt.setString(9, cli.getCidade());
            stmt.setString(10, cli.getEstado());
            stmt.setString(11, cli.getCEP());
            stmt.setString(12, cli.getTelefone());
            stmt.setString(13, cli.getTelefone2());
            stmt.setString(14, cli.getEmail());
            stmt.setString(15, cli.getVencimentoConta());
            stmt.setDouble(16, cli.getDebito());
            stmt.setBoolean(17, true);

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public boolean DesativarCliente(ClienteModel cli) throws SQLException {
        String SQL = "update produto set ativo = ? where id=?";

        try {
            PreparedStatement stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);
            stmt.setBoolean(1, false);
            stmt.setInt(2, cli.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public boolean AlterarProduto(ClienteModel cli) throws SQLException {// não ta funcionando
        String SQL = SQL = "update produto set nome_razao=?, cpf_cnpj=?, rg=?, endereco=?, numero=?, complemento=?, bairro=?, cidade=?, estado=?, cep=?, telefone=?, telefone2=?, email=?, vencimento=?, debito=?, where id = ?";

        try {
            PreparedStatement stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);
            stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);
            
            
            stmt.setString(1, cli.getNomeRazao());
            stmt.setString(2, cli.getCPF_CNPJ());
            stmt.setString(3, cli.getRG());
            stmt.setString(4, cli.getEndereco());
            stmt.setInt(5, cli.getNumero());
            stmt.setString(6, cli.getComplemento());
            stmt.setString(7, cli.getBairro());
            stmt.setString(8, cli.getCidade());
            stmt.setString(9, cli.getEstado());
            stmt.setString(10, cli.getCEP());
            stmt.setString(11, cli.getTelefone());
            stmt.setString(12, cli.getTelefone2());
            stmt.setString(13, cli.getEmail());
            stmt.setString(14, cli.getVencimentoConta());
            stmt.setDouble(15, cli.getDebito());
            stmt.setInt(16, 0);

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return true;
    }
}
