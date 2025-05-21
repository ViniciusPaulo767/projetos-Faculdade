package pessoas_bd;

import java.sql.*;
import javax.swing.JOptionPane;

public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    // Getters e Setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getFone() { return fone; }
    public void setFone(String fone) { this.fone = fone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void inserir() {
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar() {
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void apagar() {
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM tb_pessoa";
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String aux = String.format("Código: %d, Nome: %s, Fone: %s, Email: %s",
                    rs.getInt("codigo"),
                    rs.getString("nome"),
                    rs.getString("fone"),
                    rs.getString("email"));
                JOptionPane.showMessageDialog(null, aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
