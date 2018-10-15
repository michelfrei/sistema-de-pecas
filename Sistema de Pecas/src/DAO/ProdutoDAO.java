
package DAO;


import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Model.ProdutoModel;
/**
 *
 * @author Michel
 */
public class ProdutoDAO {
        public void InserirNovoProduto(ProdutoModel prod) {
        String SQL = "INSERT INTO produto (id, tipo, descricao, detalhes, marca, origem, codigo_de_barras, fabricante, setor, unidade_medida, peso, medidas, foto, estoque, ativo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);
            
            stmt.setInt(1, prod.getId());
            stmt.setString(2, prod.getTipo());
            stmt.setString(3, prod.getDescricao());
            stmt.setString(4, prod.getDetalhes());
            stmt.setString(5, prod.getMarca());
            stmt.setString(6, prod.getOrigem());
            stmt.setString(7, prod.getCodigoDeBarras());
            stmt.setString(8, prod.getFabricante());
            stmt.setString(9, prod.getSetor());
            stmt.setString(10, prod.getUnitMedida());
            stmt.setDouble(11, prod.getPeso());
            stmt.setString(12, prod.getMedidas());
            stmt.setString(13, prod.getFoto());
            stmt.setInt(14, prod.getEstoque());
            stmt.setBoolean(15, prod.isAtivo());
            
            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
        
        public boolean RemoverProduto(ProdutoModel prod) throws SQLException {
        String SQL = "Delete from produto where id=?";

        try {
            PreparedStatement stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);
            stmt.setInt(1, prod.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }
        
        public boolean AlterarProduto(ProdutoModel prod) throws SQLException {// não ta funcionando
        String SQL = SQL = "update sys.revista set tipo=?, descricao=?, detalhes=?, origem=?, codigo_de_barras=?, fabricante=?, setor=?, unidade_medida=?, peso=?, medidas=?, foto=?, estoque=?, ativo=? where id = ?";

        try {
            PreparedStatement stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);
            stmt = Conexao.getConexaoMySQL().prepareStatement(SQL);

            stmt.setString(1, prod.getTipo());
            stmt.setString(2, prod.getDescricao());
            stmt.setString(3, prod.getDetalhes());
            stmt.setString(4, prod.getOrigem());
            stmt.setString(5, prod.getCodigoDeBarras());
            stmt.setString(6, prod.getFabricante());
            stmt.setString(7, prod.getSetor());
            stmt.setString(8, prod.getUnitMedida());
            stmt.setDouble(9, prod.getPeso());
            stmt.setString(10, prod.getMedidas());
            stmt.setString(11, prod.getFoto());
            stmt.setInt(12, prod.getEstoque());
            stmt.setBoolean(13, prod.isAtivo());
            stmt.setInt(14, prod.getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return true;
    }
    
}
